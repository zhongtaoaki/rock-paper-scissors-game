package example;

public class Player {
	public String name;
	public int point;
	public Strategy strategy;

	public Player(String name, Strategy strategy) {
		this.name = name;
		this.point = 0;
		this.strategy = strategy;
	}

	public void win() {
		point++;
		System.out.println(name + "さんの勝ちだ");
	}

}
