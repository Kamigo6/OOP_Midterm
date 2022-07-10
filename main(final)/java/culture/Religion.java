package culture;

public class Religion extends Culture{
    private String footer = "?s dbp:footer ?footer.";
    public Religion() {
        super();
        name = "Religion";
        optional.add(footer);
        constrain = "{?s dct:subject dbc:Vietnamese_folk_religion.} UNION{?s dct:subject dbc:Religion_in_Vietnam.} UNION{dbr:Vietnamese_Australians dbo:religion ?s.} UNION{dbr:Provisional_Central_Government_of_Vietnam dbo:religion ?s}";
    }
    
}
