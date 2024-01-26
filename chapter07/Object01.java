public class Object01{
	public static void main(String[] args) {
		//创建Persion对象
		//p1 是对象名(对象引用)
		//new Person() 创建对象空间 真正的对象
		Person p1 = new Person();

		//对象属性的默认分配 遵循数组的默认分配
		p1.name = "小明";
		p1.age  = 10;

		Person p2 = p1;

		System.out.println(p2.age);



	}
}

class Person{
	//四个属性
	int age;
	String name;
}