
public class Food extends VietNamTourism{
	private String name = "Food";
	private String type = "?s dbp:type ?type.\r\n";
	private String region =	"?s dbp:region ?region.\r\n";
	private String ingredient = "?s dbo:ingredient ?ingredient.\r\n";
	private String mainIngredient = "?s dbp:mainIngredient ?mainIngredient.";
	private String food = "{?s rdf:type dbo:Food.} UNION {?s dct:subject dbc:Vietnamese_cuisine} UNION {?s rdf:type yago:WikicatVietnameseRiceDishes} UNION {?s rdf:type yago:WikicatVietnameseBeverages}";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Food() {
		super();
		compulsory.add(food);
		optional.add(type);
		optional.add(region);
		optional.add(ingredient);
		optional.add(mainIngredient);
	}
	
}
