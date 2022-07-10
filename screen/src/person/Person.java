package person;

import system.VietNamTourism;

public class Person extends VietNamTourism{

	private String child = "?s dbo:child ?child.";
	private String parent = "?s dbo:parent ?parent.";
	private String birthDate = "?s dbp:birthDate ?birthDate.";
	private String birthPlace = "?s dbp:birthPlace ?birthPlace.";
	private String deadDate = "?s dbp:deadDate ?deadDate.";
	private String deadPlace = "?s dbp:deadPlace ?deadPlace.";


	
	public Person() {
		super();
		name = "Person";
		optional.add(child);
		optional.add(parent);
		optional.add(birthPlace);
		optional.add(birthDate);
		optional.add(deadPlace);
		optional.add(deadDate);

		constrain = "{ ?s rdf:type dbo:Person}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s rdf:type foaf:Person}\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Early_Lý_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Early_Lý_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Nguyễn_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Trần_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Mạc_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Tây_Sơn_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Đinh_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Early_Lê_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Hồng_Bàng_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Ngô_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Triệu_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Hồ_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Later_Trần_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Lê_dynasty}\r\n"
				+ "    UNION\r\n"
				+ "     { ?s dbo:wikiPageWikiLink dbr:Lý_dynasty}\r\n"
				+ "";
	}
	
	
}
