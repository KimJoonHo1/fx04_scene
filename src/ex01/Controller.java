package ex01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Controller implements Initializable{
	private Parent root;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void loginProc() {
		System.out.println("로그인 버튼 클릭");
		TextField t = (TextField)root.lookup("#fxId");
		System.out.println(t.getText());
	}
	
	public void setRoot(Parent root) {
		this.root = root;
	}

}
