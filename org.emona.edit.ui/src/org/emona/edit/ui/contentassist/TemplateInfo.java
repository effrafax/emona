package org.emona.edit.ui.contentassist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

public class TemplateInfo {

	private final static Logger log = Logger.getLogger(TemplateInfo.class);

	private static int NONE = -1;
	private static int DESC = 0;
	private static int TEMPL = 1;
	private static int IMG = 2;
	private static final String DESC_MARK = "#DESC#";
	private static final String TEMPL_MARK = "#TEMPLATE#";
	private static final String IMGFILE_MARK = "#IMAGE#";
	private static final String PRIORITY_MARK = "#PRIO#";

	private static final Pattern PRIO_PATTERN = Pattern.compile(".*"
			+ PRIORITY_MARK + "\\s+(\\d+).*");

	private String description = "";
	private String pattern = null;
	private String imageFile = null;
	private int priority = 1000;

	public static Collection<TemplateInfo> parse(InputStream stream)
			throws IOException {
		if (stream == null) {
			new TemplateInfo();
		}
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(stream));
		StringBuilder str = new StringBuilder();
		List<TemplateInfo> iList = new ArrayList<TemplateInfo>();
		String line;
		int state = NONE;
		TemplateInfo info = null;
		while ((line = reader.readLine()) != null) {
			if (state == NONE) {
				if (line.startsWith(DESC_MARK)) {
					state = DESC;
					info = new TemplateInfo();
					iList.add(info);
				} else if (line.startsWith(TEMPL_MARK)) {
					state = TEMPL;
				} else if (line.startsWith(IMGFILE_MARK)) {
					state = IMG;
					info.setImageFile(line.substring(IMGFILE_MARK.length())
							.trim());
				} else if (line.startsWith(PRIORITY_MARK)) {
					Matcher match = PRIO_PATTERN.matcher(line);
					if (match.matches() && match.groupCount() < 1) {
						log.error("Could not retrieve priority from: " + line);
					} else {
						int prio = Integer.parseInt(match.group(1));
						log.info("Setting priority to " + prio);
						info.setPriority(prio);
					}

				}
			} else {
				if (line.startsWith(DESC_MARK)) {
					state = NONE;
					info.setDescription(str.toString());
					str = new StringBuilder();
				} else if (line.startsWith(TEMPL_MARK)) {
					state = NONE;
					info.setPattern(str.toString());
					str = new StringBuilder();
				} else {
					if (str.length() > 0)
						str.append("\n");
					str.append(line);
				}
			}
		}
		return iList;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String template) {
		this.pattern = template;
	}

	public String getImageFile() {
		return imageFile;
	}

	public void setImageFile(String imageFile) {
		this.imageFile = imageFile;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

}
