package building;

public class Bridge extends Building{
	private String name = "Bridge";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Bridge() {
		super();
		constrain = "?s dbo:wikiPageWikiLink dbc:Bridges_in_Vietnam.\r\n";
	}
}
