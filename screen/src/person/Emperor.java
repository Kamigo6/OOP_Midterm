package person;

import system.VietNamTourism;

public class Emperor extends Person{
	public Emperor() {
		super();
		name = "Emperor";
		constrain = "  ?s  rdfs:label  ?label\r\n"
				+ "      { ?s  rdf:type  dbo:Person }\r\n"
				+ "    UNION\r\n"
				+ "      { ?s  rdf:type  foaf:Person }\r\n"
				+ "      { ?s  dbo:wikiPageWikiLink dbc:Lê_dynasty_emperors }\r\n"
				+ "    UNION\r\n"
				+ "      { ?s  dbo:wikiPageWikiLink dbc:Hồ_dynasty_emperors }\r\n"
				+ "    UNION\r\n"
				+ "      { ?s  dbo:wikiPageWikiLink dbc:Lý_dynasty_emperors }\r\n"
				+ "    UNION\r\n"
				+ "      { ?s  dbo:wikiPageWikiLink dbc:Mạc_dynasty_emperors}\r\n"
				+ "    UNION\r\n"
				+ "      { ?s  dbo:wikiPageWikiLink dbc:Trần_dynasty_emperors }\r\n"
				+ "    UNION\r\n"
				+ "      { ?s  dbo:wikiPageWikiLink dbc:Tây_Sơn_dynasty_emperors}\r\n"
				+ "   UNION\r\n"
				+ "      { ?s dbo:wikiPageWikiLink dbr:List_of_monarchs_of_Vietnam, dbr:Vietnam}\r\n"
				+ "";
	}
	
	
}
