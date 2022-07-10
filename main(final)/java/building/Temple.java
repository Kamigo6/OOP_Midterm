package building;

public class Temple extends Building {
	

	public Temple() {
		super();
		name = "Temple";
		constrain = "{?s dbo:wikiPageWikiLink dbc:Buddhist_temples_in_Vietnam.} "
				+ "UNION {?s dbo:wikiPageWikiLink dbc:Confucian_temples_in_Vietnam}\r\n";
	}
	
}
