public class StringBasic {
	public static void main(String[] args) {
		
		int n1 = 100;
		float f1 = 1.5f;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		//oop�ͷ���
		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		float num3 = Float.parseFloat(s5);
		Long num4 = Long.parseLong(s5);
		Short num5 = Short.parseShort(s5);
		Byte num6 = Byte.parseByte(s5);

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		// ��ô���ַ���ת���ַ�char ->������ָ ���ַ����ĵ�һ���ַ��õ�
		//���� �õ�s5�ַ����ĵ�һ���ַ�
		System.out.println(s5.charAt(0));

	}
}