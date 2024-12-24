package heart.model;

import java.time.LocalDate;

//要修正

import lombok.Data;

@Data
public class UserModel {
	private String id;
	private String username;
	private String password;
	private LocalDate birthday;
	private String groupName;
	
	
	//↓いつかデータの関係を整理する（HeartRateとの継承関係を作る）
	private int LTHeartRate;
	//最大心拍数
	private int maxHeartRate;
	//日付
	private LocalDate currentDate;
	
	//
	
}
