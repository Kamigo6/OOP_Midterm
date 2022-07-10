package culture;
public class Music extends Culture{

    public Music() {
        super();
        name = "Music";
        constrain = "{?s dct:subject dbc:Vietnamese_music.} UNION{?s dct:subject dbc:Dance_in_Vietnam.} UNION{?s dct:subject dbc:Vietnamese_styles_of_music.}";
    }
    
}
