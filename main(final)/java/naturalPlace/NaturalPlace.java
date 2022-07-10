package naturalPlace;
import system.VietNamTourism;

public class NaturalPlace extends VietNamTourism{
    private String province = "?s dbp:province ?province.";
    private String location = "?s dbp:location ?location.";
    private String geolat = "?s geo:lat ?geolat.";
    private String geoLong = "?s geo:long ?geolong.";

    public NaturalPlace() {
        super();
        name = "NaturalPlace";
        constrain = "{?s dbo:wikiPageWikiLink dbc:National_parks_of_Vietnam.}" +
        "UNION {?s dbo:wikiPageWikiLink dbc:Bays_of_Vietnam.} " +
        "UNION {?s dbo:wikiPageWikiLink dbc:Beaches_of_Vietnam.} " +
        "UNION {?s dbo:wikiPageWikiLink dbc:Lakes_of_Vietnam.} " +
        "UNION {?s dbo:wikiPageWikiLink dbc:Caves_of_Vietnam.} " +
        "UNION {?s dbo:wikiPageWikiLink dbc:Hills_of_Vietnam.}" +
        "UNION {?s dbo:wikiPageWikiLink dbc:Mountains_of_Vietnam.}" + 
        "UNION {?s dbo:wikiPageWikiLink dbc:Mountain_passes_of_Vietnam.} " +
        "UNION {?s dbo:wikiPageWikiLink dbc:dbc:Rivers_of_Vietnam.}" +
        "?s rdf:type dbo:Place." +
        "?s dbo:wikiPageWikiLink dbr:Vietnam.";
        optional.add(province);
        optional.add(location);
        optional.add(geoLong);
        optional.add(geolat);
    }
    
}
