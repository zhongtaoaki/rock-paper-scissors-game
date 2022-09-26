package example;

// 順番に出す戦略
public class SequentialStrategy implements Strategy {
	public Hand nextHand(int round) {
		return Hand.getHand(round % 3);
	}
}
