
public class Soup extends Food{
    private String name = "Soup";
    private String type = "{?s dbp:type dbr:Soup} UNION {?s dbp:type dbr:Noodle_soup}";
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

    public Soup() {
        super();
        compulsory.add(type);
    }

    

}
