import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class Controller {
	
	@FXML
	private TableView<Produit> table;
	
	public void pizza(ActionEvent e) {
		Produit unproduit = new Produit("Pizza", 7.00);
		
	}
	public void frites(ActionEvent e) {
		Produit unproduit = new Produit("Frites", 3.00);
	}
	public void salade(ActionEvent e) {
		Produit unproduit = new Produit("Salades", 4.50);
	}
	public void canette(ActionEvent e) {
		Produit unproduit = new Produit("Canette", 1.50);
	}
	
	
}
