package CommonMultiple;
import java.util.Scanner;
//�� ���� �Է¹޾� 100������ �ڿ��� �� �� ���� ������� ���ϴ� ���α׷� �ۼ�
public class CommonMultiple {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.print("ù��° �� �Է� : ");
	  int num1 = scan.nextInt();
	  System.out.print("�ι�° �� �Է� : ");
	  int num2 = scan.nextInt();
	  
	  for(int i = 1; i <= 100; i++){
		  if((i % num1 == 0) && (i % num2 == 0)){
			  System.out.println(num1 + ", " + num2 + "�� ����� : " + i);
			  continue;
		  }
	  }
	}
}