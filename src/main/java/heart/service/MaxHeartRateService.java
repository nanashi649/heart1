package heart.service;

import org.springframework.stereotype.Service;

import heart.model.HeartRate;

@Service
public interface MaxHeartRateService {
	public int setHeartRate(HeartRate model);
}
