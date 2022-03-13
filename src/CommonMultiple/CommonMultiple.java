package CommonMultiple;
import java.util.Scanner;
//두 수를 입력받아 100이하의 자연수 중 두 수의 공배수를 구하는 프로그램 작성
public class CommonMultiple {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  System.out.print("첫번째 수 입력 : ");
	  int num1 = scan.nextInt();
	  System.out.print("두번째 수 입력 : ");
	  int num2 = scan.nextInt();
	  
	  for(int i = 1; i <= 100; i++){
		  if((i % num1 == 0) && (i % num2 == 0)){
			  System.out.println(num1 + ", " + num2 + "의 공배수 : " + i);
			  continue;
		  }
	  }
	}
}