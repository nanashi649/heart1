package heart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import heart.mapper.InsertLTMapper;
import heart.model.HeartRate;

@Service
public class InsertLTServiceImpl implements InsertLTService {
	
	@Autowired
	InsertLTMapper mapper;

	@Override
	public int setLT(HeartRate model) {
		return mapper.setLT(model);
	}
	
	

}
