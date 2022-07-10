package food;

public class Banh extends Food{
    public Banh() {
        super();
        name = "Banh";
        constrain ="{?s dbo:country dbr:Vietnam.} UNION {?s dbp:country dbr:Vietnam} ."+
        "{?s dbo:type dbr:Bánh}UNION {?s dct:subject dbc:Bánh} UNION {?s dbo:type dbr:Pancake} UNION {?s dbo:type dbr:Sandwich} UNION {?s gold:hypernym dbr:Cakes}";
    }
}
