package person;

import system.VietNamTourism;

public class Poet extends Person{
	public Poet() {
		super();
		name = "Poet";
		constrain = "  ?s  rdfs:label  ?label\r\n"
				+ "      { ?s  rdf:type  dbo:Person }\r\n"
				+ "    UNION\r\n"
				+ "      { ?s  rdf:type  foaf:Person }\r\n"
				+ "      { ?s  dbo:wikiPageWikiLink dbc:Lê_dynasty_poets }\r\n"
				+ "    UNION\r\n"
				+ "      { ?s  dbo:wikiPageWikiLink dbc:Hồ_dynasty_poets }\r\n"
				+ "    UNION\r\n"
				+ "      { ?s  dbo:wikiPageWikiLink dbc:Lý_dynasty_poets }\r\n"
				+ "    UNION\r\n"
				+ "      { ?s  dbo:wikiPageWikiLink dbc:Trần_dynasty_poets }\r\n"
				+ "    UNION\r\n"
				+ "      { ?s dbo:wikiPageWikiLink dbc:Vietnamese_poets, dbr:Vietnam}\r\n"
				+ "";
	}
	
	
}
