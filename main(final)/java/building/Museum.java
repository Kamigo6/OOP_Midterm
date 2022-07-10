package building;

public class Museum extends Building{


	public Museum() {
		super();
		name = "Museum";
		constrain = "?s dbo:wikiPageWikiLink dbc:Museums_in_Vietnam.\r\n";
	}
}
