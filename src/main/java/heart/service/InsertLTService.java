package heart.service;

import org.springframework.stereotype.Service;

import heart.model.HeartRate;

@Service
public  interface InsertLTService {
	public int setLT(HeartRate model);
	}
