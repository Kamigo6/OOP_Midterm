package Person;

import ObjectClasses.VietNamTourism;

public class Writer extends VietNamTourism{
	private String name = "Writer";
	private String child = "?s dbo:child ?child.";
	private String parent = "?s dbo:parent ?parent.";
	private String birthDate = "?s dbp:birthDate ?birthDate.";
	private String birthPlace = "?s dbp:birthPlace ?birthPlace.";
	private String deadDate = "?s dbp:deadDate ?deadDate.";
	private String deadPlace = "?s dbp:deadPlace ?deadPlace.";
	private String comment = "?s rdfs:comment ?comment.";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Writer() {
		super();
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
				+ "      { ?s  dbo:wikiPageWikiLink dbc:Vietnamese_writers }\r\n"
				+ "";
	}
	
	
}
