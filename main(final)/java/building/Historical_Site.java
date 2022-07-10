package building;

public class Historical_Site extends Building{

	public Historical_Site() {
		super();
		name = "Historical siee";
		constrain = "{?s rdf:type dbo:Building.}\r\n"
				+ "UNION {?s rdf:type dbo:building.}\r\n"
				+ "{?s rdf:type dbo:HistoricBuilding.} "
				+ "UNION {?s rdf:type schema:LandmarksOrHistoricalBuildings.}\r\n"
				+ "{?s dbo:country dbr:Vietnam.} "
				+ "UNION {?s dbp:country dbr:Vietnam.} "
				+ "UNION {?s dbo:location dbr:Vietnam.} "
				+ "UNION {?s dbp:location dbr:Vietnam.} "	
				+ "\r\n";
	}
}
