package culture;
import system.VietNamTourism;


public class TraditionalClothing extends Culture {

    public TraditionalClothing() {
        super();
        name = "TraditionalClothing";
        constrain = "{?s dct:subject dbc:Vietnamese_headgear.} UNION{?s dct:subject dbc:Vietnamese_clothing.}";
    }
    
}
