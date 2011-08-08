import groovy.xml.MarkupBuilder
import org.custommonkey.xmlunit.*


def defaultRelevance=100;
def defaultImage="icons/attribute.gif"
def file = new File("../src/org/emona/edit/attribute_keywords.txt")


Properties props = new Properties();
props.load(new FileInputStream(file));



def writer = new OutputStreamWriter(System.out);
def xml = new MarkupBuilder(writer)
xml.templates() {
	props.stringPropertyNames().sort().each { attName ->
		def att = attName
		if (attName.contains("#")) {
			att = attName[0..<attName.indexOf("#")]
		}
		String[] values = props.getProperty(attName).split("\\|")

		def relevance = defaultRelevance
		if (values.length >=4 && values[3] != "") {
			relevance = Integer.parseInt(values[3])
		}
		def image = defaultImage
		if (values.length >=3 && values[2] != "") {
			image = values[2]
		}
		if (values.length >=5 && values[4] != "") {
			template(id:"org.emona.att.${att}_${values[4]}",autoinsert:"true",
					context:"org.emona.edit.NagiosCfg.kw_${att}",deleted:"false",
					description:"${values[0]}",enabled:"true",name:"${att}",
					relevance:"${relevance}",image:"${image}",
					parent:"${values[4]}",
					"${att} ${values[1]}")
		} else {
			template(id:"org.emona.att.${att}",autoinsert:"true",
					context:"org.emona.edit.NagiosCfg.kw_${att}",deleted:"false",
					description:"${values[0]}",enabled:"true",name:"${att}",
					relevance:"${relevance}",image:"${image}",
					"${att} ${values[1]}")
		}
	}
}

writer.flush()