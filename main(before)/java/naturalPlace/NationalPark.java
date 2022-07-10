package naturalPlace;



public class NationalPark extends NaturalPlace {

    public NationalPark() {
        super();
        constrain = "?s dbo:wikiPageWikiLink dbc:National_parks_of_Vietnam. {{?s rdf:type geo:SpatialThing.} UNION {?s rdf:type dbo:ProtectedArea.} UNION {?s rdf:type dbo:NaturalPlace.}}";
        name = "NationalPark";
    }
    
}
