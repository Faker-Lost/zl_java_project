import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {

		System.out.println("������Ҫ�жϵ���λ���֣�" );
		Scanner mysc = new Scanner(System.in);
		int num = mysc.nextInt();
		int a,b,c;
		int sum;

		//��λ��
		a = num%10;
		//ʮλ��
		b = num/10%10;
		//��λ��
		c = num/100;

		sum = a*a*a + b*b*b + c*c*c;

		if(sum == num){
			System.out.println("��������ˮ�ɻ����� " + num);
		}else{
			System.out.println("�����ֲ���ˮ�ɻ���");
		}




	}
}