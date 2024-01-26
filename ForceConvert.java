public class ForceConvert {
	public static void main(String[] args) {
		//只针对最近的操作数有效
		//int n1 = (int)4 * 2.5 + 3 * 1.5;
		// int n1 = (int)(4 * 2.5 + 3 * 1.5);
		// System.out.println(n1);
		char c1 = 100;
		int m = 100;
		//char c2 = m;
		char c3 = (char)m;
		System.out.println(c3);




		// //数据溢出
		// int n2 = 2000;
		// byte b1 = (byte)n2;
		// System.out.println(b1);
}
}