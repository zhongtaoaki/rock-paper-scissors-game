package example;

import java.util.Random;

// ランダム戦略
public class RandomStrategy implements Strategy {
	public Hand nextHand(int round) {
		return Hand.getHand(new Random().nextInt(3));
	}
}
