/**
 * 输出1-1000的完数
 * @author 小斑马
 *
 */
public class Demo {

	public static void main(String[] args) {
		System.out.println("1到1000的完数有：");
		for(int i = 1;i < 1000;i++) {
			int t = 0;
			for(int j = 1;j <= i/2;j++) {
				if(i%j == 0) {
					t += j;
				}
			}
			if(t == i) {
				System.out.println(i + " "); 
			}
		}
	}
}
