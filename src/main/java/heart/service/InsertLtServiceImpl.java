package heart.service;

import org.springframework.stereotype.Service;

import heart.mapper.InsertLtMapper;
import heart.model.HeartRate;

@Service
public class InsertLtServiceImpl implements InsertLtService {

	private final InsertLtMapper mapper;
	
	public InsertLtServiceImpl(InsertLtMapper mapper) {
		this.mapper = mapper;
	}
	
	@Override
	public int setLT(HeartRate model) {
		return mapper.saveLT(model);
	}

}
