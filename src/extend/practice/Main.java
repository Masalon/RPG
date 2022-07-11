package extend.practice;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		ArrayList<Human> braves = new ArrayList<>(); // creating a list of Array characters
		braves.add(new Brave("勇者", 100, 20, "剣"));
		braves.add(new Fighter("戦士", 100, 30, "斧"));
		braves.add(new Wizard("魔法使い", 100, 15, "魔法"));
		ArrayList<Monster> enemies = new ArrayList<>();
		enemies.add(new Slime("スライム", 50, 10, "体当たり"));// Same thing with the Monster; creating a list of Array by
														// adding each character below
		enemies.add(new Oak("オーク", 70, 20, "槍"));
		enemies.add(new Dragon("ドラゴン", 100, 30, "炎"));

		while (true) {
			System.out.println("人間のターン！");
			int s1 = Rand.get(braves.size()); // randomly get a character from Arraylist
			int t1 = Rand.get(enemies.size());
			braves.get(s1).attack(enemies.get(t1)); // 今回は人間のターンなので、リストからキャラを引っ張ってきて、敵の攻撃をする
			if (enemies.get(t1).hp <= 0) { // hpがゼロになったら倒れるためのif文
				System.out.println(enemies.get(t1).name + "は倒れた。");
				enemies.remove(t1);
			}
			if (enemies.size() == 0) {
				System.out.println("勇者達は勝利した！");
				break; // when the program reaches to this point, it ends the "while" function
			}

			System.out.println("モンスターのターン！");
			int s2 = Rand.get(enemies.size());
			int t2 = Rand.get(braves.size());
			enemies.get(s2).attack(braves.get(t2));
			if (braves.get(t2).hp <= 0) {
				System.out.println(braves.get(t2).name + "は倒れた。");
				braves.remove(t2);
			}
			if (braves.size() == 0) {
				System.out.println("モンスター達は勝利した！");
				break; // when the program reaches to this point, it ends the "while" function
			}
		}

	}
}
