package culture;

public class Literature extends Culture{
    // private String author = "?s dbp:author\(s\)_  ?author.";
    private String verseForm = "?s dbp:verseForm ?verseForm.";
    private String genre  = "?s dbp:genre ?genre.";
    public Literature() {
        super();
        name = "Literature";
        constrain = "{?s dct:subject dbc:Vietnamese_literature.} UNION{?s dct:subject dbc:Vietnamese_poems}";
        // optional.add(author);
        optional.add(verseForm);
        optional.add(genre);
    }
    
}
