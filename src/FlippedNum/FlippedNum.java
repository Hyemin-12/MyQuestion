package FlippedNum;
import java.util.Scanner;
//���ڸ� �Է¹޾� �� ���� ������ ���� �� ���ϱ� ex)�Է��� �� : 18, ������ �� : 81 =>�� ���� �� : 18 + 81 = 99
public class FlippedNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = scan.nextInt();
		int original = num;
		int flipped = 0; //������ ��
		while(true) {
			flipped = flipped * 10 + num % 10; 
			num = num / 10; 
			if(num == 0) break;
		}
		int sum = original + flipped;
		System.out.println(original + " + " + flipped + " = " + sum);
	}//end of main

}//end of class
