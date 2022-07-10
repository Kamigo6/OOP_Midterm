package naturalPlace;

public class MountainsAndHills extends NaturalPlace {

    public MountainsAndHills() {
        super();
        name = "MountainsAndHills";
        constrain = "{?s dbo:wikiPageWikiLink dbc:Hills_of_Vietnam.} UNION {?s dbo:wikiPageWikiLink dbc:Mountains_of_Vietnam.}."
        + "?s rdf:type dbo:Mountain.\r\n";
    }
    
}
