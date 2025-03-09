package heart.service;

import java.util.NoSuchElementException;

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
		//IDが見つからなかったときの例外処理
		if (model == null || model.getId() == null) {
			throw new NoSuchElementException("IDが見つかりません");
		}
		return mapper.saveLT(model);
	}

}
