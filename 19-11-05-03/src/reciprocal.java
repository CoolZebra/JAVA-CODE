import java.util.*;
/**
 *����һ����λ������ Ȼ���������
 * @author С����
 *
 */
public class reciprocal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ������");
		int x = sc.nextInt();
		int x1,x10,x100;
		x100 = x/100;
		x10 = (x-x100*100)/10;
		x1 = x%10;
		System.out.println(x1*100+x10*10+x100*1);
	}

}
