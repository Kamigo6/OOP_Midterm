package person;

import system.VietNamTourism;

public class General extends Person{
	public General() {
		super();
		name = "General";
		constrain = "  ?s  rdfs:label  ?label\r\n"
				+ "      { ?s  rdf:type  dbo:Person }\r\n"
				+ "    UNION\r\n"
				+ "      { ?s  rdf:type  foaf:Person }\r\n"
				+ "      { ?s  dbo:wikiPageWikiLink dbc:Vietnamese_generals }\r\n"
				+ "";
	}
	
	
}
