package PvpGame;

public class Enemy {
	String name;
	int enemyHp;
	int enemyDamage;
	
	public Enemy(String name, int enemyHp, int enemyDamage) {
		this.name = name;
		this.enemyHp = enemyHp;
		this.enemyDamage = enemyDamage;
	}
	public void atacked(Player type) {
		System.out.println("적이 플레이어를 공격함");
		type.playerHp -= enemyDamage;
		if(type.playerHp <= 0) {
			System.out.println("********승리********");
		}
	}
	public void printEnemy() {
		System.out.println("======적의 정보======");
		System.out.println("이름 : " + this.name);
		System.out.println("체력 : " + this.enemyHp);
		System.out.println("공격력 : " + this.enemyDamage);
	}
}
