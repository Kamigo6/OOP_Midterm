public class StreetFood extends Food {
    private String name = "StreetFood";
    private String type = "?s dbp:type dbr:Street_food.";
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
    public StreetFood() {
        super();
        compulsory.add(type);
    }
    
}
