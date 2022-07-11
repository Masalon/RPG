package extend.practice;

public abstract class Monster extends Living {

	public Monster(String name, int hp, int offensive, String weapon) {
		super(name, hp, offensive, weapon);
	}

	public void be_attacked(int n) {
		this.hp -= n;
	}

	public void attack(Living target) {
		System.out.println(this.name + "が" + this.weapon + "で攻撃！" + target.name + "に" + this.offensive + "のダメージを与えた。");
		target.be_attacked(this.offensive);
	}
}