/**
 * ���1000���ڵ�ˮ�ɻ���
 * @author С����
 *
 */
public class ShuiXianFlower {
		public static void main(String[] args) {
			//��ˮ�ɻ���
			int ge,shi,bai;
			int m=0;
			
			for(int i=100;i<1000;i++){
				ge=i%10;
				shi=i/10%10;
				bai=i/100;
				int b=(int) (Math.pow(ge,3)+Math.pow(shi, 3)+Math.pow(bai, 3));
				if(i==b){	
					System.out.println(i);
					
					m++;	
				}
			}
			
			System.out.println("1000���ڹ��У�"+m+"��ˮ�ɻ���");
		}
}

