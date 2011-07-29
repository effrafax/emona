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
	props.stringPropertyNames().sort().each { att ->
		String[] values = props.getProperty(att).split("\\|")
		def relevance = defaultRelevance
		if (values.length >=4 ) {
			relevance = Integer.parseInt(values[3])
		}
		def image = defaultImage
		if (values.length >=3 && values[2] != "") {
			image = values[2]
		}
		template(id:"org.emona.att.${att}",autoinsert:"true",
				context:"org.emona.edit.NagiosCfg.kw_${att}",deleted:"false",
				description:"${values[0]}",enabled:"true",name:"${att}",
				relevance:"${relevance}",image:"${image}",
				"${att} ${values[1]}")
	}
}

writer.flush()