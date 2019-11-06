import java.util.*;
/**
 * 输入3个整数 按又小到大输出
 * @author 小斑马
 *
 */
public class SmallToBig {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数");
		int b = sc.nextInt();
		System.out.println("请输入第三个整数");
		int c = sc.nextInt();
		int d;
		if(a>b) {
			d = a;
			a = b;
			b = d;
		}
		if(a>c) {
			d = a;
			a = c;
			c = d;
		}
		if(b>c) {
			d = b;
			b = c;
			c = d;
		}
		System.out.println(a+" "+b+" "+c);
	}
}
