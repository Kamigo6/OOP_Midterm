package food;

public class Noodle extends Food{
    


    public Noodle() {
        super();
        name = "Noodle";
        constrain = "{{?s dbo:country dbr:Vietnam.} UNION {?s dbp:country dbr:Vietnam}. ?s dbp:type dbr:Noodle.} UNION {?s rdf:type yago:WikicatVietnameseNoodles} UNION {?s dct:subject dbc:Vietnamese_noodle_dishes}";
    }
}
