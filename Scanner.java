import java.util.Scanner;//����java.util�µ�Scanner��

public class Scanner {
	public static void main(String[] args) {
			
		//1.�û�����
		//�����Ӧ�İ���	Scanner �򵥵��ı�ɨ����
		//�������� new ����һ������
		 Scanner sc = new Scanner(System.in);
		 //�����û�������
		 System.out.println("������name ");
		 String name = sc.next();//�û���������

		 System.out.println("���������� ");
		 int age = sc.nextInt();

		 System.out.println("������нˮ ");
		 double salary = sc.nextDouble();

		 System.out.println("�˵���Ϣ");
		 System.out.println("����=" + name + 
		 	"����=" + age + "нˮ=" + salary );


	}
}