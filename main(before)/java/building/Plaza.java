package building;

public class Plaza extends Building{
	private String name = "Plaza";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Plaza() {
		super();
		constrain = "{?s rdf:type dbo:ShoppingMall.} \r\n"
				+ "{{?s dbo:location dbr:Vietnam.} "
				+ "UNION {?s dbp:location dbr:Vietnam.} "
				+ "UNION {?s dbo:country dbr:Vietnam.} "
				+ "UNION {?s dbp:country dbr:Vietnam.}}\r\n"
				+ "\r\n";
	}
}
