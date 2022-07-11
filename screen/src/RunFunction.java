import java.io.FileNotFoundException;

import java.util.List;

import building.*;
import culture.*;
import food.*;
import naturalplace.*;
import person.*;
import system.Config;

public class RunFunction {
	public static String[] Food = {"Drink",
									"Banh",
									"ChaCuon_ERR",
									"Noodle",
									"RiceDishes",
									"Soup",
									"StreetFood"};
	
	public static String[] Building = {"Bridge",
										"HistorialSite",
										"Hospital",
										"Hotel",
										"Museum",
										"NationalPark",
										"Plaza",
										"Skyscrapper",
										"Temple",
										"WorldHeritageSite"};
	
	public static String[] Culture = {"Literature",
										"MartialArt",
										"Music",
										"Religion",
										"TraditionalClothing",
										"VisualArts"};
	
	public static String[] NaturalPlace = {"Bay",
											"Beach",
											"Cave",
											"Lake",
											"MountainPass",
											"MountainsAndHills",
											"NatinalParkPlace",
											"NaturalPlace",
											"River"};
	
	public static String[] Person = {"Emperor",
									"General",
									"Poet",
									"Writer"};
			
	public static void run(String opt) throws FileNotFoundException {
		if (opt != null) {
			if (opt == "Drink") {
    			Drink d = new Drink();
    			Config.process(d.queryStr(), d.getName());
	    		} else if (opt == "Banh") {
	    			Banh b = new Banh();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Noodle") {
	    			Noodle b = new Noodle();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "RiceDished") {
	    			RiceDishes b = new RiceDishes();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Soup") {
	    			Soup b = new Soup();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "StreetFood") {
	    			StreetFood b = new StreetFood();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Bridge") {
	    			Bridge b = new Bridge();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "HistoricalSite") {
	    			Historical_Site b = new Historical_Site();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Hospital") {
	    			Hospital b = new Hospital();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Hotel") {
	    			Hotel b = new Hotel();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Museum") {
	    			Museum b = new Museum();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "NationalPark") {
	    			National_Park b = new National_Park();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Plaza") {
	    			Plaza b = new Plaza();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Skyscrapper") {
	    			Skyscrapper b = new Skyscrapper();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Literature") {
	    			Literature b = new Literature();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "MartialArt") {
	    			MartialArt b = new MartialArt();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Music") {
	    			Music b = new Music();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Relegion") {
	    			TraditionalClothing b = new TraditionalClothing();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "VisualArts") {
	    			VisualArts b = new VisualArts();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Bay") {
	    			Bay b = new Bay();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Beach") {
	    			Beach b = new Beach();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Cave") {
	    			Cave b = new Cave();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Lake") {
	    			Lake b = new Lake();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "MountainPass") {
	    			MoutainPass b = new MoutainPass();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "MountainsAndHills") {
	    			MountainsAndHills b = new MountainsAndHills();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "NationalParkPlace") {
	    			NationalPark b = new NationalPark();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "River") {
	    			River b = new River();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Emperor") {
	    			Emperor b = new Emperor();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "General") {
	    			General b = new General();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Poet") {
	    			Poet b = new Poet();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "Writer") {
	    			Writer b = new Writer();
	    			Config.process(b.queryStr(), b.getName());
	    		} else if (opt == "PersonAll") {
	    			for (String d: Person) {
	    				run(d);
	    			}
	    		} else if (opt == "BuildingAll") {
	    			for (String d: Building) {
	    				run(d);
	    			}
	    		} else if (opt == "NaturalPlaceAll") {
	    			for (String d: NaturalPlace) {
	    				run(d);
	    			}
	    		} else if (opt == "FoodAll") {
	    			for (String d: Food) {
	    				run(d);
	    			}
	    		} else if (opt == "CultureAll") {
	    			for (String d:	Culture) {
	    				run(d);
	    			}
	    		}
			}
		}
}
