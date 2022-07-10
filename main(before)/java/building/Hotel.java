package building;

public class Hotel extends Building{
	private String name = "Hotel";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hotel() {
		super();
		constrain = "{?s rdf:type dbo:Building.} "
				+ "UNION {?s rdf:type dbo:building.}\r\n"
				+ "{?s rdf:type dbo:Hotel.} "
				+ "UNION {?s gold:hypernym dbr:Hotel.} "
				+ "UNION {?s dct:subject dbc:Hospitals_in_Vietnam.} "
				+ "UNION {?s rdf:type yago:Hospital103540595.}"
				+ "{?s dbo:country dbr:Vietnam.} "
				+ "UNION {?s dbp:country dbr:Vietnam.} \r\n"
				+ "UNION {?s dbo:location dbr:Vietnam.} \r\n"
				+ "UNION {?s dbp:location dbr:Vietnam.}\r\n"
				+ "\r\n";
	}
}
