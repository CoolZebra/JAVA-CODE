/**
 * 输出1000以内的水仙花数
 * @author 小斑马
 *
 */
public class ShuiXianFlower {
		public static void main(String[] args) {
			//求水仙花数
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
			
			System.out.println("1000以内共有："+m+"个水仙花数");
		}
}

