package building;

public class World_Heritage_Site extends Building { 

	public World_Heritage_Site() {
		super();
		name = "World Heritage Site";
		constrain = "?s dbo:wikiPageWikiLink dbc:World_Heritage_Sites_in_Vietnam.\r\n";
	}
	
}
