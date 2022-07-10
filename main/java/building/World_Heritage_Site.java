package building;

public class World_Heritage_Site extends Building {
	private String name = "World Heritage Site";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public World_Heritage_Site() {
		super();
		constrain = "?s dbo:wikiPageWikiLink dbc:World_Heritage_Sites_in_Vietnam.\r\n";
	}
	
}
