package building;

public class Hospital extends Building {


	public Hospital() {
		super();
		name = "Hospital";
		constrain = "{?s rdf:type dbo:Building.} "
				+ "UNION {?s rdf:type dbo:building.}\r\n"
				+ "{?s rdf:type dbo:Hospital.} "
				+ "UNION {?s gold:hypernym dbr:Hospital.} "
				+ "UNION {?s dct:subject dbc:Hospitals_in_Vietnam.} "
				+ "UNION {?s rdf:type yago:Hospital103540595.}\r\n"
				+ "{?s dbo:country dbr:Vietnam.} "
				+ "UNION {?s dbp:country dbr:Vietnam.} \r\n"
				+ "UNION {?s dbo:location dbr:Vietnam.} \r\n"
				+ "UNION {?s dbp:location dbr:Vietnam.}\r\n";
	}
}
