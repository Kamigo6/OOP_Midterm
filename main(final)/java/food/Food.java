package food;
import system.VietNamTourism;

public class Food extends VietNamTourism{
	private String type = "?s dbp:type ?type.\r\n";
	private String region =	"?s dbp:region ?region.\r\n";
	private String ingredient = "?s dbo:ingredient ?ingredient.\r\n";
	private String mainIngredient = "?s dbp:mainIngredient ?mainIngredient.";
	// private String comment = "?s rdfs:comment ?comment";
	// private String food = "{?s rdf:type dbo:Food.} UNION {?s dct:subject dbc:Vietnamese_cuisine} UNION {?s rdf:type yago:WikicatVietnameseRiceDishes} UNION {?s rdf:type yago:WikicatVietnameseBeverages}";


	public Food() {
		super();
		name = "Food";
		constrain = "{{?s dbo:country dbr:Vietnam.} UNION {?s dbp:country dbr:Vietnam.}. ?s rdf:type dbo:Food.}\r\n"
		+" UNION {?s dct:subject dbc:Vietnamese_cuisine} \r\n"
		+" UNION {?s rdf:type yago:WikicatVietnameseRiceDishes}\r\n"
		+" UNION {?s rdf:type yago:WikicatVietnameseBeverages}\r\n";
		optional.add(type);
		optional.add(region);
		optional.add(ingredient);
		optional.add(mainIngredient);
	}
	
}
