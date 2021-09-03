package ex03;

import java.net.URL;
import java.util.ResourceBundle;

import ex03.loginService.LoginServiceImpl;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class Controller implements Initializable{
	private Parent root = null;
	private LoginServiceImpl service = new LoginServiceImpl();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub	
	}
	
	public void loginProc() {
		service.loginProc(root);
	}
	
	public void cancelProc() {
		service.cancelProc(root);
	}
	
	public void openMembershipForm() {
		service.openMembershipForm();
	}
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
}
