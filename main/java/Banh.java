
public class Banh extends Food{
    private String name = "Banh";
    private String type = "{?s dbo:type dbr:Bánh}UNION {?s dct:subject dbc:Bánh} UNION {?s dbo:type dbr:Pancake} UNION {?s dbo:type dbr:Sandwich} UNION {?s gold:hypernym dbr:Cakes}";
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
    public Banh() {
        super();
        compulsory.add(type);

    }

    

}
