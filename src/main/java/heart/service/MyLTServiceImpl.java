package heart.service;

import org.springframework.stereotype.Service;

import heart.mapper.MyLTMapper;
import heart.model.HeartRate;

@Service
public class MyLTServiceImpl implements MyLTService {
	private final MyLTMapper mapper;

	public MyLTServiceImpl(MyLTMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public HeartRate findLT(String id) {
		return mapper.findLT(id);
	}
}
