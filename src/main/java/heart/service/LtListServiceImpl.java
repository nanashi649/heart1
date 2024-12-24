package heart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import heart.mapper.LtListMapper;
import heart.model.UserModel;

@Service
public class LtListServiceImpl implements LtListService {

	private final LtListMapper mapper;
	
	public LtListServiceImpl(LtListMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public List<UserModel> findUsername(String groupName) {
		return mapper.findUsername(groupName);
	}
}
