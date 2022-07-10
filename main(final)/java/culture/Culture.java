package culture;
import system.VietNamTourism;

public class Culture extends VietNamTourism{
    private String hypernym = "?s gold:hypernym ?hypernym.";
    public Culture() {
        super();
        name = "Culture";
        constrain = "?s dct:subject dbc:Vietnamese_culture .";
        optional.add(hypernym);
    }
    
}
