package naturalPlace;

import ObjectClasses.*;

public class Cave extends NaturalPlace{

    public Cave() {
        super();
        name = "Cave";
        constrain ="?s dbo:wikiPageWikiLink dbc:Caves_of_Vietnam.\r\n" +
        "?s rdf:type dbo:NaturalPlace.\r\n";
    }
    
}