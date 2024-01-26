public class HomeWork06 {
	public static void main(String[] args) {
		//分析：(1/1)-(1/2)+(1/3)-(1/4)....-(1/100)
		//先算总和
		double sum = 0.0;
		for(int i = 1;i<=100;i++){
			sum += (double)1/i;
			if(i%2==0){
				sum = sum - (double)1/i;
			}
		}
		System.out.println("Sum = " + sum);
	}
}