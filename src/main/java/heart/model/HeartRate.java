package heart.model;

import lombok.Data;

//心拍数、時間管理
@Data
public class HeartRate {
	private  int ETHeartRate;
	private int HeartRateA;
	private int HeartRateB;
	private int HeartRateC;
	private int HeartRateD;
	private int HeartRateE;
	
	private int TimeSecondsA;
	private int TimeSecondsB;
	private int TimeSecondsC;
	private int TimeSecondsD;
	private int TimeSecondsE;
	
	
}
