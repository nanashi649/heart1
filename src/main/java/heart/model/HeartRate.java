package heart.model;

import lombok.Data;

//心拍数、時間管理
@Data
public class HeartRate {
	//id
	private String Id;
	//LT心拍数
	private  int LTHeartRate;
	//最大心拍数
	private int maxHeartRate;
}
