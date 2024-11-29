package heart.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class UserModel {
	private String username;
	private String password;
	private LocalDate birthday;
}
