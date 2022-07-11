
import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class VnTourismUIController {
	private String opt;

    @FXML
    private ToggleGroup identical;

    @FXML
    private TextArea TextArea;

    @FXML
    private Button btnExport;

    @FXML
    void FoodAll(ActionEvent event) {
    	opt = "FoodAll";
    }

    @FXML
    void Drink(ActionEvent event) {
    	opt = "Drink";
    }

    @FXML
    void RiceDished(ActionEvent event) {
    	opt = "RiceDished";
    }

    @FXML
    void StreetFood(ActionEvent event) {
    	opt = "StreetFood";
    }

    @FXML
    void Soup(ActionEvent event) {
    	opt = "Soup";
    }

    @FXML
    void Noodle(ActionEvent event) {
    	opt = "Noodle";
    }

    @FXML
    void Banh(ActionEvent event) {
    	opt = "Banh";
    }

    @FXML
    void CultureAll(ActionEvent event) {
    	opt = "CultureAll";
    }

    @FXML
    void Literature(ActionEvent event) {
    	opt = "Literature";
    }

    @FXML
    void MartialArt(ActionEvent event) {
    	opt = "MartialArt";
    }

    @FXML
    void Music(ActionEvent event) {
    	opt = "Music";
    }

    @FXML
    void Religion(ActionEvent event) {
    	opt = "Religion";
    }

    @FXML
    void TraditionalClothing(ActionEvent event) {
    	opt = "TraditionalClothing";
    }

    @FXML
    void VisualArts(ActionEvent event) {
    	opt = "VisualArts";
    }

    @FXML
    void BuildingAll(ActionEvent event) {
    	opt = "BuildingAll";
    }

    @FXML
    void Bridge(ActionEvent event) {
    	opt = "Bridge";
    }

    @FXML
    void HistoricalSite(ActionEvent event) {
    	opt = "HistoricalSite";
    }

    @FXML
    void Hospital(ActionEvent event) {
    	opt = "Hospital";
    }

    @FXML
    void Hotel(ActionEvent event) {
    	opt = "Hotel";
    }

    @FXML
    void Museum(ActionEvent event) {
    	opt = "Museum";
    }

    @FXML
    void NationalPark(ActionEvent event) {
    	opt = "NationalPark";
    }

    @FXML
    void Plaza(ActionEvent event) {
    	opt = "Plaza";
    }

    @FXML
    void Skycrapper(ActionEvent event) {
    	opt = "Skycrapper";
    }

    @FXML
    void Temple(ActionEvent event) {
    	opt = "Temple";
    }

    @FXML
    void WorldHeritageSite(ActionEvent event) {
    	opt = "WorldHeritageSite";
    }

    @FXML
    void NaturalPlaceAll(ActionEvent event) {
    	opt = "NaturalPlaceAll";
    }

    @FXML
    void Bay(ActionEvent event) {
    	opt = "Bay";
    }

    @FXML
    void Beach(ActionEvent event) {
    	opt = "Beach";
    }

    @FXML
    void Cave(ActionEvent event) {
    	opt = "Cave";
    }

    @FXML
    void Lake(ActionEvent event) {
    	opt = "Lake";
    }

    @FXML
    void MountainPass(ActionEvent event) {
    	opt = "MountainPass";
    }

    @FXML
    void MountainsAndHills(ActionEvent event) {
    	opt = "MountainsAndHills";
    }

    @FXML
    void NationalParkPlace(ActionEvent event) {
    	opt = "NationalParkPlace";
    }

    @FXML
    void River(ActionEvent event) {
    	opt = "River";
    }

    @FXML
    void PersonAll(ActionEvent event) {
    	opt = "PersonalAll";
    }

    @FXML
    void Emperor(ActionEvent event) {
    	opt = "Emperor";
    }

    @FXML
    void General(ActionEvent event) {
    	opt = "General";
    }

    @FXML
    void Poet(ActionEvent event) {
    	opt = "Poet";
    }

    @FXML
    void Writer(ActionEvent event) {
    	opt = "Writer";
    }

    @FXML
    void btnExportClicked(ActionEvent event) throws FileNotFoundException{
    	TextArea.setEditable(false);
    	
    	if (opt != null) {
    		RunFunction.run(opt);
    		TextArea.appendText(opt + " Field was exported to ttl file \n");
    		
    	} else {
    		TextArea.appendText("Please choose one field to export \n");
    	}
    }
    
    @FXML
    void btnExportAllClicked(ActionEvent event) throws FileNotFoundException {
    	RunFunction.run("BuildingAll");
    	RunFunction.run("NaturalPlaceAll");
    	RunFunction.run("PersonAll");
    	RunFunction.run("FoodAll");
    	RunFunction.run("CultureAll");
    }

}

