package heart.service;

import org.springframework.stereotype.Service;

import heart.model.HeartRate;

@Service
public interface MyLTService {

	HeartRate findLT(String id);
}	
