package PvpGame;
//�÷��̾ ���� �ο�� Ŭ����
public class Player {
	String name;
	int playerHp;
	int playerDamage;
	
	public Player(String name, int playerHp, int playerDamage) {
		this.name = name;
		this.playerHp = playerHp;
		this.playerDamage = playerDamage;
	}
	public void atack(Enemy type) {
		System.out.println("�÷��̾ ���� ������");
		type.enemyHp -= playerDamage;
		if(type.enemyHp <= 0) {
			System.out.println("********�й�********");
		}
	}
	public void printPlayer() {
		System.out.println("====�÷��̾��� ����====");
		System.out.println("�̸� : " + this.name);
		System.out.println("ü�� : " + this.playerHp);
		System.out.println("���ݷ� : " + this.playerDamage);
	}
}
