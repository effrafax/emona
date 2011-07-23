import groovy.xml.MarkupBuilder
import org.custommonkey.xmlunit.*

def file = new File("../src/org/emona/edit/attribute_keywords.txt")
Properties props = new Properties();
props.load(new FileInputStream(file));

def writer = new OutputStreamWriter(System.out);
def xml = new MarkupBuilder(writer)
xml.templates() {
	props.stringPropertyNames().each { att ->
		String[] values = props.getProperty(att).split("\\|")
		template(id:"org.emona.att.${att}",autoinsert:"true",
			context:"org.emona.edit.NagiosCfg.kw_${att}",deleted:"false",
		    description:"${values[0]}",enabled:"true",name:"${att}",
			 "${att} ${values[1]}")
		
	}
}

writer.flush()