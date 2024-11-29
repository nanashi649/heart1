package heart.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class LoginModel {
	private String username;
	private String password;
	private LocalDate birthday;
	
	public LoginModel getModel(String username, String password, LocalDate date) {
		LoginModel model = new LoginModel();
        return model;
	}
}



