public class Noodle extends Food{
    private String name = "Noodle";
    private String type = "{?s dbp:type dbr:Noodle} UNION {?s rdf:type yago:WikicatVietnameseNoodles} UNION {?s dct:subject dbc:Vietnamese_noodle_dishes}";
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

    public Noodle() {
        super();
        compulsory.add(type);
    }
}
