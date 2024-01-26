//转义字符的使用

public class ChangeChar {

	public static void main(String[] args) {
		// 制表符 \t
		System.out.println("北京\t天津\t上海");
		// 换行符 \n
		System.out.println("北京\n天津\n上海");
		// \\ 一个\ ；\\\ 两个\\
		System.out.println("北京\\天津\\上海");
		// \"xxxx\"  \'xxxx\' 
		System.out.println("老师说\"要好好学习\"");
		// 回车\r
		System.out.println("北京天津\r上海");
	}
}
