package config;

import java.util.ArrayList;

public class Template{
    protected String name;
    protected ArrayList<String> optional = new ArrayList<String>();
    protected String constrain;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Template() {
        constrain = "?s rdfs:label ?label.\r\n";
    }

    public String queryStr() {
        // make Construct to RDF graph
		String x = "CONSTRUCT {\r\n";
        x = x + "?s rdfs:label ?label.\r\n";

        for (int i = 0; i < optional.size(); i++){
            x = x + optional.get(i) + "\r\n";
        }
        x = x + "}\r\n";

        // make Where to Constrain
        x = x + "WHERE {\r\n";
        x = x + "?s rdfs:label ?label.\r\n";
        x = x + constrain;

        for (int i = 0; i < optional.size(); i++){
            x = x + "OPTIONAL {"+ optional.get(i) + "}\r\n";
        }

        x = x + "\r\n";
        x = x + Config.FILTER + "\r\n";
        x = x + "}\r\n";
		return x;
	}

    public static void main(String[] args) {
        Template t = new Template();
        System.out.println(t.queryStr());
    }
	
}