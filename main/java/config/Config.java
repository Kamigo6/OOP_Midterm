package config;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.rdf.model.Model;

public class Config {
	public static String FILTER = "FILTER ( LANG ( ?label) = 'en' )."
								+ "FILTER ( LANG ( ?comment ) = 'en' ). ";
	public static String PREFIX = "prefix rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>\r\n"
			+ "prefix rdfs: <http://www.w3.org/2000/01/rdf-schema#>\r\n"
			+ "prefix dbp: <http://dbpedia.org/property/>\r\n"
			+ "prefix dbo: <http://dbpedia.org/ontology/>\r\n"
			+ "prefix dbc: <http://dbpedia.org/resource/Category:>\r\n"
			+ "prefix dbr: <http://dbpedia.org/resource/>\r\n"
			+ "prefix dct: <http://purl.org/dc/terms/>\r\n"
			+ "prefix dbt: <http://dbpedia.org/resource/Template:>\r\n"
			+ "prefix foaf: <http://xmlns.com/foaf/0.1/>\r\n"
			+ "prefix dbc: <http://dbpedia.org/resource/Category:>\r\n"
			+ "prefix dbd: <http://dbpedia.org/datatype/>\r\n"
			+ "prefix gold: <http://purl.org/linguistics/gold/>\r\n"
			+ "prefix yago: <http://dbpedia.org/class/yago/>\r\n"
			+ "prefix geo: <http://www.w3.org/2003/01/geo/wgs84_pos#>\r\n"
			+ "\r\n"
			+ "";
	public static String tripleStyleString = "turtle";
	
	public static void process(String queryStr, String name) throws FileNotFoundException {
        queryStr = PREFIX + queryStr;
        Query query = QueryFactory.create(queryStr);
        
        System.out.println(query);
        QueryExecution queryExe = QueryExecutionFactory.sparqlService("http://dbpedia.org/sparql", query);
        
        Model model = queryExe.execConstruct();
        model.write(System.out, Config.tripleStyleString);
        
        OutputStream out = new FileOutputStream("D:\\Code\\Code\\Workspace\\Java\\All_in_Java\\TourismBackend\\OutputSourceTTL\\" + name + ".ttl");
        model.write(out, Config.tripleStyleString);
        
	}
}