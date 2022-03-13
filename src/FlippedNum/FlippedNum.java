package FlippedNum;
import java.util.Scanner;
//숫자를 입력받아 그 수와 뒤집은 수의 합 구하기 ex)입력한 수 : 18, 뒤집힌 수 : 81 =>두 수의 합 : 18 + 81 = 99
public class FlippedNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = scan.nextInt();
		int original = num;
		int flipped = 0; //뒤집힌 수
		while(true) {
			flipped = flipped * 10 + num % 10; 
			num = num / 10; 
			if(num == 0) break;
		}
		int sum = original + flipped;
		System.out.println(original + " + " + flipped + " = " + sum);
	}//end of main

}//end of class
