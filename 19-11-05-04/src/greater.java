import java.util.*;
/**
 * 输入两个正整数 输出较大的
 * @author 小斑马
 *
 */
public class greater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int x = sc.nextInt();
		System.out.println("请输入第二个数");
		int y = sc.nextInt();
		if(x>y) {
			System.out.println("较大的数为："+x);
		}	
		if(x<y) {
			System.out.println("较大的数为："+y);
		}
		if(x==y) {
			System.out.println("两数一样大");
		}
		}
	}

