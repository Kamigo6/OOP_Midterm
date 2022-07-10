package food;

public class RiceDishes extends Food {

    public RiceDishes() {
        super();
        name = "RiceDish";
        constrain = "{?s dct:subject dbc:Vietnamese_rice_dishes} UNION {?s rdf:type yago:WikicatVietnameseRiceDishes}";
    }

    
}
