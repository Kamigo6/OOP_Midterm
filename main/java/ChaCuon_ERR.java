public class ChaCuon_ERR extends Food{
    private String name = "ChaCuon";
    private String type = "?s dbo:type https://dbpedia.org/page/Hors_d'oeuvre";
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
    public ChaCuon_ERR() {
        super();
        compulsory.add(type);
    }

    
    
}
