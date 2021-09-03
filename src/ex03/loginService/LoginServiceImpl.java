package ex03.loginService;

import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginServiceImpl implements LoginService{
	@Override
	public void loginProc(Parent root) {
		// TODO Auto-generated method stub
		TextField id = (TextField) root.lookup("#fxId");
		System.out.println(id.getText());
		
		PasswordField pwd = (PasswordField) root.lookup("#fxPwd");
		System.out.println(pwd.getText());
	}
	
	@Override
	public void cancelProc(Parent root) {
		// TODO Auto-generated method stub
		TextField id = (TextField) root.lookup("#fxId");
		id.setText("");
		
		PasswordField pwd = (PasswordField) root.lookup("#fxPwd");
		pwd.setText("");
	}
	@Override
	public void openMembershipForm() {
		// TODO Auto-generated method stub
		System.out.println("회원가입 버튼이 눌리었습니다");
	}
	
}
