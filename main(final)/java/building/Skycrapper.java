package building;

public class Skycrapper extends Building{
	public Skycrapper() {
		super();
		name = "Skycrapper";
		constrain = "{?s rdf:type dbo:Building.} "
				+ "UNION {?s rdf:type dbo:building.}.\r\n"
				+ "{?s dbo:wikiPageWikiLink dbr:Tallest_buildings_in_Vietnam.} "
				+ "UNION {?s gold:hypernym dbr:Skyscraper.} "
				+ "UNION {?s dct:subject dbc:Skyscraper_office_buildings_in_Vietnam.}"
				+ "{?s dbo:country dbr:Vietnam.} "
				+ "UNION {?s dbp:country dbr:Vietnam.} \r\n"
				+ "UNION {?s dbo:location dbr:Vietnam} "
				+ "UNION {?s dbp:location dbr:Vietnam}\r\n";
	}
}
