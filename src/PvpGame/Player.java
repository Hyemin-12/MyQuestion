package PvpGame;
//플레이어가 적과 싸우는 클래스
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
		System.out.println("플레이어가 적을 공격함");
		type.enemyHp -= playerDamage;
		if(type.enemyHp <= 0) {
			System.out.println("********패배********");
		}
	}
	public void printPlayer() {
		System.out.println("====플레이어의 정보====");
		System.out.println("이름 : " + this.name);
		System.out.println("체력 : " + this.playerHp);
		System.out.println("공격력 : " + this.playerDamage);
	}
}
