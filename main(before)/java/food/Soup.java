package food;

public class Soup extends Food{

    public Soup() {
        super();
        name = "Soup";
        constrain = "{?s dbo:country dbr:Vietnam.} UNION {?s dbp:country dbr:Vietnam} {?s dbp:type dbr:Soup} UNION {?s dbp:type dbr:Noodle_soup}";
    }

}
