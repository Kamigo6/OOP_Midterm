package person;

import system.VietNamTourism;

public class Emperor extends Person{
	private String child = "?s dbo:child ?child.";
	private String parent = "?s dbo:parent ?parent.";
	private String birthDate = "?s dbp:birthDate ?birthDate.";
	private String birthPlace = "?s dbp:birthPlace ?birthPlace.";
	private String deadDate = "?s dbp:deadDate ?deadDate.";
	private String deadPlace = "?s dbp:deadPlace ?deadPlace.";
	private String comment = "?s rdfs:comment ?comment.";
	
	public Emperor() {
		super();
		name = "Emperor";
		optional.add(child);
		optional.add(parent);
		optional.add(birthPlace);
		optional.add(birthDate);
		optional.add(deadPlace);
		optional.add(deadDate);
		optional.add(comment);
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
