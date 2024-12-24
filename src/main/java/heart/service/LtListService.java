package heart.service;

import java.util.List;

import org.springframework.stereotype.Service;

import heart.model.UserModel;

@Service
public interface LtListService {
	public List<UserModel> findUsername(String id);
}
