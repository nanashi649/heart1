package heart.service;

import java.util.List;
import java.util.NoSuchElementException;

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
		//グループネームが見つからないときの例外処理
		if(groupName == null) {
		throw new NoSuchElementException("団体名が誤っています"); 
		}
		return mapper.findUsername(groupName);
	}
}
