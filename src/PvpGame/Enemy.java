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
		System.out.println("���� �÷��̾ ������");
		type.playerHp -= enemyDamage;
		if(type.playerHp <= 0) {
			System.out.println("********�¸�********");
		}
	}
	public void printEnemy() {
		System.out.println("======���� ����======");
		System.out.println("�̸� : " + this.name);
		System.out.println("ü�� : " + this.enemyHp);
		System.out.println("���ݷ� : " + this.enemyDamage);
	}
}
