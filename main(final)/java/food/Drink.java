package food;

public class Drink extends Food{


    public Drink() {
        super();
        name = "Drink";
        constrain = "{?s dct:subject dbc:Vietnamese_drinks.} \r\n"
        + "UNION{?s rdf:type yago:WikicatVietnameseBeverages.}\r\n";
    }
    
}
