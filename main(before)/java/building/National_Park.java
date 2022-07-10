package building;

public class National_Park extends Building {
	private String name = "National park";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public National_Park() {
		super();
		constrain = "?s dbo:wikiPageWikiLink dbc:National_parks_of_Vietnam.\r\n";
	}
}
