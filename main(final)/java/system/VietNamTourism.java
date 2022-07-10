package system;
public class VietNamTourism extends Template{

	public VietNamTourism() {
		super();
		name = "VietnamTourism";
		constrain = "{?s dbo:country dbr:Vietnam.} \r\n"
		+ "UNION {?s dbp:country dbr:Vietnam.}\r\n";
		optional.add("?s rdfs:comment ?comment.");
	}	
}
