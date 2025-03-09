package heart.service;

import java.util.NoSuchElementException;

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
		//Idが見つからないときの例外処理
		if (model == null || model.getId() == null) {
			throw new NoSuchElementException("ユーザデータが見つかりません。ユーザ登録をおこなってください。");
		}
		return mapper.saveHeartModel(model);
	}

}
