import java.util.ArrayList;

public abstract class Template{
    protected ArrayList<String> compulsory = new ArrayList<String>();
    protected ArrayList<String> optional = new ArrayList<String>();
    
    public Template() {
        compulsory.add("?s rdfs:label ?label.");
    }

    public String queryStr() {
		String x = "CONSTRUCT {\r\n";
        x = x + compulsory.get(0) + "\r\n";
        for (int i = 0; i < optional.size(); i++){
            x = x + optional.get(i) + "\r\n";
        }
        x = x + "}\r\n";

        x = x + "WHERE {\r\n";
        for (int i = 0; i < compulsory.size(); i++){
            x = x + compulsory.get(i) + "\r\n";
        }
        x = x + "\r\n";

        for (int i = 0; i < optional.size(); i++){
            x = x + "OPTIONAL {"+ optional.get(i) + "}\r\n";
        }

        x = x + "\r\n";
        x = x + Config.UNION + "\r\n";
        x = x + Config.FILTER + "\r\n";
        x = x + "}\r\n";
		return x;
	}
	
}