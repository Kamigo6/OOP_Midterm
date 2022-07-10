package building;

public class Museum extends Building{
	private String name = "Museum";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Museum() {
		super();
		constrain = "?s dbo:wikiPageWikiLink dbc:Museums_in_Vietnam.\r\n";
	}
}
