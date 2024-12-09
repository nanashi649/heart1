package heart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import heart.mapper.MaxHeartRateMapper;
import heart.model.HeartRate;

@Service
public class MaxHeartRateServiceImpl implements MaxHeartRateService {
	
	@Autowired
	MaxHeartRateMapper mapper;
	
	//mapperクラスにデータのセットを委譲
	@Override
	public int setHeartRate(HeartRate model) {
		// TODO 自動生成されたメソッド・スタブ
		return mapper.setHeartModel(model);
	}
	

}
