

public class Stars{
	public static void main(String[] args) {
		
		for(int i = 1;i <= 5; i++){
			//��ӡ�ո�
			for(int k = 1;k<=5-i;k++){
				System.out.print(' ');
			}
			//��ӡ��
			for(int j = 1;j <=2*i-1 ; j++){
				if(j==1||j == 2*i-1||i==){
					System.out.print('*');
				}else{
					System.out.print(' ');
				}
			}
			System.out.println();
		}




	}
}