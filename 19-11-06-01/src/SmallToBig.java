import java.util.*;
/**
 * ����3������ ����С�������
 * @author С����
 *
 */
public class SmallToBig {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		System.out.println("���������������");
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
