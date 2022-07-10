package naturalPlace;

public class River extends NaturalPlace {

    public River() {
        super();
        name ="River";
        constrain ="{?s dbo:country dbr:Vietnam.} "
        // + "UNION {?s dbp:country dbr:Vietnam.} "
        // + "UNION {?s dbo:location dbr:Vietnam.} "
        // + "UNION {?s dbp:location dbr:Vietnam.} "
        + "UNION {?s dbo:wikiPageWikiLink dbr:Vietnam.}"
        + " ?s dbo:wikiPageWikiLink dbr:Vietnam."
        + " ?s rdf:type dbo:NaturalPlace. "
        + " ?s dbo:wikiPageWikiLink dbc:Rivers_of_Vietnam.\r\n";
    }
    
}
