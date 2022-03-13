package PvpGame;

public class PvpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("최혜민", 100, 50);
		Enemy e1 = new Enemy("김유진", 100, 100);
		
		Player p2 = new Player("먼지", 100, 100);
		Enemy e2 = new Enemy("연어", 100, 50);
		//공격을 하기/받기 전 상태
		p1.printPlayer();
		e1.printEnemy();
		
		//적이 공격함
		e1.atacked(p1);
		
		//적이 공격을 한 상태
		p1.printPlayer();
		e1.printEnemy();
		
		//플레이어가 공격함
		p2.atack(e2);
		
		//플레이어가 공격을 한 상태
		p2.printPlayer();
		e2.printEnemy();
	}

}
