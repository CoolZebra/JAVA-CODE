import java.util.Scanner;
import java.lang.Math;
/**
 * ������������״
 * @author С����
 *
 */
public class TestTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ε������ߣ�");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//�ж��Ƿ�Ϊ������
		if(a+b>c && a+c>b && b+c>a && (Math.abs(a-b)<c && Math.abs(a-c)<b && Math.abs(b-c)<a)) {
			if(a==b&&b==c) {
				System.out.println("��������Ϊ�ȱ�������");
			}
			else if(a==b || a==c || b==c) {
				System.out.println("��������Ϊ����������");
			}
			else if((a*a + b*b ==c*c)||(a*a + c*c == b*b)||(b*b + c*c == a*a)){
				System.out.println("��������Ϊֱ��������");
			}
			else System.out.println("��������Ϊһ��������");
			}
		else System.out.println("�������������������������");
	}

}
