package building;

import system.*;

public class Bridge extends Building{
	public Bridge() {
		super();
		name = "Bridge";
		constrain = "?s dbo:wikiPageWikiLink dbc:Bridges_in_Vietnam.\r\n";
	}
}
