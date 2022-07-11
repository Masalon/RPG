package extend.practice;

public abstract class Living {
	protected String name;
	protected int hp;
	protected int offensive;
	protected String weapon;

	public Living(String name, int hp, int offensive, String weapon) {
		this.name = name;
		this.hp = hp;
		this.offensive = offensive;
		this.weapon = weapon;
	}

	abstract void be_attacked(int n);

	abstract void attack(Living target);
}
