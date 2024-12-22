package heart.service;

import org.springframework.stereotype.Service;

import heart.mapper.MaxHeartRateMapper;
import heart.model.HeartRate;

@Service
public class MaxHeartRateServiceImpl implements MaxHeartRateService {

	private final MaxHeartRateMapper mapper;
	
	public MaxHeartRateServiceImpl(MaxHeartRateMapper mapper) {
		this.mapper = mapper;
	}
	//mapperクラスにデータのセットを委譲
	@Override
	public int saveHeartRate(HeartRate model) {
		// TODO 自動生成されたメソッド・スタブ
		return mapper.saveHeartModel(model);
	}

}
