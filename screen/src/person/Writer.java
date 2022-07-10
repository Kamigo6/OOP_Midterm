package person;

import system.VietNamTourism;

public class Writer extends Person{
	public Writer() {
		super();
		name = "Writer";
		constrain = "  ?s  rdfs:label  ?label\r\n"
				+ "      { ?s  rdf:type  dbo:Person }\r\n"
				+ "    UNION\r\n"
				+ "      { ?s  rdf:type  foaf:Person }\r\n"
				+ "      { ?s  dbo:wikiPageWikiLink dbc:Vietnamese_writers }\r\n"
				+ "";
	}
	
	
}
