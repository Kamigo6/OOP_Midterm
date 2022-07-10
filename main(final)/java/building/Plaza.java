package building;

public class Plaza extends Building{


	public Plaza() {
		super();
		name = "Plaza";
		constrain = "?s rdf:type dbo:ShoppingMall.\r\n"
				+ "{?s dbo:location dbr:Vietnam.} "
				// + "UNION {?s dbp:location dbr:Vietnam.} "
				// + "UNION {?s dbo:country dbr:Vietnam.} "
				+ "UNION {?s dbp:country dbr:Vietnam.}";
	}
}
