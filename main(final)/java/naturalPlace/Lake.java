package naturalPlace;



public class Lake extends NaturalPlace{

    public Lake() {
        super();
        name="Lake";
        constrain="?s dbo:wikiPageWikiLink dbc:Lakes_of_Vietnam.\r\n" +
        "{{?s rdf:type geo:SpatialThing.} UNION {?s rdf:type dbo:NaturalPlace.}}\r\n";
    }
    
}
