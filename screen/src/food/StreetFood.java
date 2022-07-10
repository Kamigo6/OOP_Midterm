package food;


public class StreetFood extends Food{

    public StreetFood() {
        super();
        name = "StreetFood";
        constrain = "{?s dbo:country dbr:Vietnam.} UNION {?s dbp:country dbr:Vietnam} {?s dbp:type dbr:Soup} UNION {?s dbp:type dbr:Noodle_soup}";
    }

}

