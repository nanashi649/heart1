package heart.model;

import lombok.Data;

@Data
public class MaxHeart {
	//最大心拍数
	 int maxHeart;
	 int halfHeart = (int) (0.53 * maxHeart);
}
