import java.util.Scanner;
import java.lang.Math;
/**
 * 测试三角形形状
 * @author 小斑马
 *
 */
public class TestTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三角形的三条边：");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//判断是否为三角形
		if(a+b>c && a+c>b && b+c>a && (Math.abs(a-b)<c && Math.abs(a-c)<b && Math.abs(b-c)<a)) {
			if(a==b&&b==c) {
				System.out.println("该三角形为等边三角形");
			}
			else if(a==b || a==c || b==c) {
				System.out.println("该三角形为等腰三角形");
			}
			else if((a*a + b*b ==c*c)||(a*a + c*c == b*b)||(b*b + c*c == a*a)){
				System.out.println("该三角形为直角三角形");
			}
			else System.out.println("该三角形为一半三角形");
			}
		else System.out.println("您输入的三个数构不成三角形");
	}

}
