package building;

import config.VietNamTourism;

public class Building extends VietNamTourism{
	private String name = "Building";
	private String location = "?s dbp:location ?location.\r\n";
	private String geoLat = "?s geo:lat ?geolat.\r\n";
	private String geoLong = "?s geo:long ?geolong.\r\n";
	private String province = "?s dbp:province ?province.\r\n";
	private String comment = "?s rdfs:comment ?comment.\r\n";
	private String thumbnail = "?s dbo:thumbnail ?thumbnail.\r\n";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Building() {
		super();
		optional.add(location);
		optional.add(geoLat);
		optional.add(geoLong);
		optional.add(province);
		optional.add(comment);
		optional.add(thumbnail);
	}
	
	
}
