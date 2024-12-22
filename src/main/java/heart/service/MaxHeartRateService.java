package heart.service;

import org.springframework.stereotype.Service;

import heart.model.HeartRate;

@Service
public interface MaxHeartRateService {

	public int saveHeartRate(HeartRate model);

}
