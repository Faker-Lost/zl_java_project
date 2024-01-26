import java.util.Scanner;//导入java.util下的Scanner类

public class Scanner {
	public static void main(String[] args) {
			
		//1.用户输入
		//引入对应的包名	Scanner 简单的文本扫妙器
		//创建对象 new 创建一个对象
		 Scanner sc = new Scanner(System.in);
		 //接收用户的输入
		 System.out.println("请输入name ");
		 String name = sc.next();//用户接受输入

		 System.out.println("请输入年龄 ");
		 int age = sc.nextInt();

		 System.out.println("请输入薪水 ");
		 double salary = sc.nextDouble();

		 System.out.println("人的信息");
		 System.out.println("名字=" + name + 
		 	"年龄=" + age + "薪水=" + salary );


	}
}