package building;

import system.VietNamTourism;

public class Building extends VietNamTourism{

	private String location = "?s dbp:location ?location.\r\n";
	private String geoLat = "?s geo:lat ?geolat.\r\n";
	private String geoLong = "?s geo:long ?geolong.\r\n";
	private String province = "?s dbp:province ?province.\r\n";
	private String thumbnail = "?s dbo:thumbnail ?thumbnail.\r\n";
	

	public Building() {
		super();
		name = "Building";
		optional.add(location);
		optional.add(geoLat);
		optional.add(geoLong);
		optional.add(province);
		optional.add(thumbnail);
	}
	
	
}
