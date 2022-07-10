package building;

public class Temple extends Building {
	private String name = "Temple";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Temple() {
		super();
		constrain = "{{?s dbo:wikiPageWikiLink dbc:Buddhist_temples_in_Vietnam.} "
				+ "UNION {?s dbo:wikiPageWikiLink dbc:Confucian_temples_in_Vietnam}}\r\n";
	}
	
}
