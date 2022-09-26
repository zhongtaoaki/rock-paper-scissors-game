package example;

public enum Hand {
	ROCK("グー", 0), SCISSORS("チョキ", 1), PAPER("パー", 2);

	public String name;
	public int num;

	private Hand(String name, int num) {
		this.name = name;
		this.num = num;
	}

	public static Hand getHand(int num) {
		switch (num) {
			case 0:
				return ROCK;
			case 1:
				return SCISSORS;
			case 2:
				return PAPER;
			default:
				return null;
		}
	}

	// 勝負するメソッド
	public int fight(Hand hand) {
		if (this == hand) {
			return 0;// 引き分け
		} else if ((this.num + 1) % 3 == hand.num) {
			return 1;// thisの勝ち
		} else {
			return -1;// handの勝ち
		}
	}
}
