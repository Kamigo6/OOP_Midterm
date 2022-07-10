

public class RiceDishes extends Food {
    private String name = "RiceDish";
    private String type = "{?s dct:subject dbc:Vietnamese_rice_dishes} UNION {?s rdf:type yago:WikicatVietnameseRiceDishes}";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public RiceDishes() {
        super();
        compulsory.add(type);
    }

    
}
