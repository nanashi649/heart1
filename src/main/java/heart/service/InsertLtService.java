package heart.service;

import org.springframework.stereotype.Service;

import heart.model.HeartRate;

@Service
public interface InsertLtService {
	public int setLT(HeartRate model);
}
