package heart.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SupervisorModel extends UserModel {

	private String groupPW;

	public SupervisorModel() {
		super();
	}

}
