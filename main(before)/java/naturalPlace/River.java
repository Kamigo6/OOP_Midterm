package naturalPlace;

public class River extends NaturalPlace {

    public River() {
        super();
        name ="River";
        constrain ="{{?s dbo:country dbr:Vietnam.} \r\n"
        + "UNION {?s dbp:country dbr:Vietnam.} \r\n"
        + "UNION {?s dbo:location dbr:Vietnam.} \r\n"
        + "UNION {?s dbp:location dbr:Vietnam.} \r\n"
        + "UNION {?s dbo:wikiPageWikiLink dbr:Vietnam.}}\r\n"
        + "?s dbo:wikiPageWikiLink dbr:Vietnam. \r\n"
        + "?s rdf:type dbo:NaturalPlace. \r\n"
        + "?s dbo:wikiPageWikiLink dbc:Rivers_of_Vietnam.\r\n";
    }
    
}
