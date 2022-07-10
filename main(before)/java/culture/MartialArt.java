package culture;
public class MartialArt extends Culture{
    private String creator ="?s dbp:creator ?creator.";
    private String focus ="?s dbp:focus ?focus.";

    public MartialArt() {
        super();
        name = "MartialArt";
        constrain = "{?s dbp:parenthood dbr:Vietnamese_martial_arts.} UNION{?s dct:subject dbc:Vietnamese_martial_arts}";
        optional.add(creator);
        optional.add(focus);
    }

    
}
