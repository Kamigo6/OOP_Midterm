package system;
import java.io.FileNotFoundException;

import org.apache.jena.sparql.pfunction.library.concat;

import building.Bridge;
import building.Building;
import building.Historical_Site;
import building.Hospital;
import building.Hotel;
import building.Museum;
import building.National_Park;
import building.Plaza;
import building.Skycrapper;
import building.Temple;
import building.World_Heritage_Site;
import culture.Culture;
import culture.Literature;
import culture.MartialArt;
import culture.Music;
import culture.Religion;
import culture.TraditionalClothing;
import culture.VisualArts;
import food.Banh;
import food.Drink;
import food.Food;
import food.Noodle;
import food.RiceDishes;
import food.Soup;
import naturalPlace.Bay;
import naturalPlace.Beach;
import naturalPlace.Cave;
import naturalPlace.Lake;
import naturalPlace.MountainPass;
import naturalPlace.MountainsAndHills;
import naturalPlace.NationalPark;
import naturalPlace.NaturalPlace;
import naturalPlace.River;
import person.Person;


public class Main {
	public static void main(String[] args) throws FileNotFoundException{
		// Beach b = new Beach();
		// Lake b = new Lake();
		// Cave b = new Cave();
		// River b = new River();
		// MountainsAndHills b = new MountainsAndHills();
		// MountainPass b = new MountainPass();
		// Person b = new Person();
		// Bridge b = new Bridge();
		// Building b = new Building();
		// Historical_Site b = new Historical_Site();
		// Hospital b = new Hospital();
		// Hotel b = new Hotel();
		// Museum b = new Museum();
		// National_Park b = new National_Park();
		Plaza b = new Plaza();
		// Skycrapper b = new Skycrapper();
		// World_Heritage_Site b = new World_Heritage_Site();
		// NaturalPlace b = new NaturalPlace();
		// Food b = new Food();
		Config.process(b.queryStr(), b.getName());
		// VietNamTourism vn = new VietNamTourism();
		// Config.process(vn.queryStr(), vn.getName());

		// Food f = new Food();
		// Config.process(f.queryStr(), f.getName());
        
		// Soup s = new Soup();
		// Config.process(s.queryStr(), s.getName());

		// Noodle n = new Noodle();
		// Config.process(n.queryStr(), n.getName());

		// Banh b = new Banh();
		// Config.process(b.queryStr(), b.getName());

		// ChaCuonERR cc = new ChaCuonERR();
		// Config.process(cc.queryStr(), cc.getName());

		// RiceDishes rc = new RiceDishes();
		// Config.process(rc.queryStr(), rc.getName());

		// Drink d = new Drink();
		// Config.process(d.queryStr(), d.getName());

		// Culture c = new Culture();
		// Config.process(c.queryStr(), c.getName());

		// Literature l = new Literature();
		// Config.process(l.queryStr(), l.getName());

		// VisualArts vs = new VisualArts();
		// Config.process(vs.queryStr(), vs.getName());

		// Bridge br = new Bridge();
		// Config.process(br.queryStr(), br.getName());

		// Music m = new Music();
		// Config.process(m.queryStr(), m.getName());

		// Religion r = new Religion();
		// Config.process(r.queryStr(), r.getName());

		// TraditionalClothing tc = new TraditionalClothing();
		// Config.process(tc.queryStr(), tc.getName());

		// MartialArt ma = new MartialArt();
		// Config.process(ma.queryStr(), ma.getName());

		// NaturalPlace np = new NaturalPlace();
		// Config.process(np.queryStr(), np.getName());
		// System.out.println(np.queryStr());
		
		// NationalPark nk = new NationalPark();
		// Config.process(nk.queryStr(), nk.getName());

		// Skycrapper sk  = new Skycrapper();
		// Config.process(sk.queryStr(), sk.getName());

		// Historical_Site hs = new Historical_Site();
		// Config.process(hs.queryStr(), hs.getName());

		// Museum mu = new Museum();
		// Config.process(mu.queryStr(), mu.getName());

		// Bay b = new Bay();
		// Config.process(b.queryStr(), b.getName());
	}
}

