package PvpGame;

public class PvpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player p1 = new Player("������", 100, 50);
		Enemy e1 = new Enemy("������", 100, 100);
		
		Player p2 = new Player("����", 100, 100);
		Enemy e2 = new Enemy("����", 100, 50);
		//������ �ϱ�/�ޱ� �� ����
		p1.printPlayer();
		e1.printEnemy();
		
		//���� ������
		e1.atacked(p1);
		
		//���� ������ �� ����
		p1.printPlayer();
		e1.printEnemy();
		
		//�÷��̾ ������
		p2.atack(e2);
		
		//�÷��̾ ������ �� ����
		p2.printPlayer();
		e2.printEnemy();
	}

}
