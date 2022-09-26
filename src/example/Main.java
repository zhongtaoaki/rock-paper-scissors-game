package example;

public class Main {

	public static void main(String[] args) {

		// 初期化
		Player miyamoto = new Player("宮本", new RandomStrategy());
		Player sasaki = new Player("佐々木", new SequentialStrategy());
		int round = 10;

		// 試合開始
		for (int i = 1; i <= round; i++) {

			Hand miyamotoHand = miyamoto.strategy.nextHand(i);
			Hand sasakiHand = sasaki.strategy.nextHand(i);
			int result = miyamotoHand.fight(sasakiHand);
			System.out.println(i + "回目の試合です。" //
					+ miyamoto.name + "さんの" + miyamotoHand.name + "対" //
					+ sasaki.name + "さんの" + sasakiHand.name);

			if (result > 0) {
				miyamoto.win();
			} else if (result < 0) {
				sasaki.win();
			} else {
				System.out.println("おひきわけだ。");
			}

		}

		// 総点数を確認して勝負
		System.out.println("総合点：" //
				+ miyamoto.name + ": " + miyamoto.point + ", "//
				+ sasaki.name + ": " + sasaki.point);
		if (miyamoto.point > sasaki.point) {
			System.out.println("勝者はーー宮本だ。");
		} else if (miyamoto.point < sasaki.point) {
			System.out.println("勝者はーー佐々木だ。");
		} else {
			System.out.println("勝者がない、おひきわけだ。");
		}
	}
}
