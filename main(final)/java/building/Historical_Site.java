package building;

public class Historical_Site extends Building{
	private String name = "Historical siee";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Historical_Site() {
		super();
		constrain = "{?s rdf:type dbo:Building.} "
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
