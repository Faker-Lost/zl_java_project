import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {

		System.out.println("请输入要判断的三位数字：" );
		Scanner mysc = new Scanner(System.in);
		int num = mysc.nextInt();
		int a,b,c;
		int sum;

		//个位数
		a = num%10;
		//十位数
		b = num/10%10;
		//百位数
		c = num/100;

		sum = a*a*a + b*b*b + c*c*c;

		if(sum == num){
			System.out.println("该数字是水仙花数： " + num);
		}else{
			System.out.println("该数字不是水仙花数");
		}




	}
}