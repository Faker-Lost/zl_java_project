public class Object01{
	public static void main(String[] args) {
		//����Persion����
		//p1 �Ƕ�����(��������)
		//new Person() ��������ռ� �����Ķ���
		Person p1 = new Person();

		//�������Ե�Ĭ�Ϸ��� ��ѭ�����Ĭ�Ϸ���
		p1.name = "С��";
		p1.age  = 10;

		Person p2 = p1;

		System.out.println(p2.age);



	}
}

class Person{
	//�ĸ�����
	int age;
	String name;
}