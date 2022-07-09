public class Drink extends Food{
    private String name = "Drink";
    private String type = "?s dbp:type dbr:Drink.";
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
    public Drink() {
        super();
        compulsory.add(type);
    }
    
}
