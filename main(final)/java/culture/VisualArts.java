package culture;
public class VisualArts extends Culture{

    public VisualArts() {
        super();
        name = "VisualArts";
        constrain = "{?s dct:subject dbc:Archaeology_of_Vietnam.}"
        + "UNION{?s dct:subject dbc:Vietnamese_pottery.}"
        + "UNION{?s dct:subject dbc:Vietnamese_painting.}"
        + "UNION{?s dct:subject dbc:Vietnamese_art.}";
    }
    
}
