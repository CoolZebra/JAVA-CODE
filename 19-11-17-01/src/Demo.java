/**
 * ���1��+2��+...+10���ĺ�
 * @author С����
 *
 */
public class Demo {

	public static void main(String[] args) {
		long sum = 0;
		long fac = 1;
		for(int i = 1;i <= 10;i++) {
			fac = fac * i;
			sum += fac;
		}
		System.out.println(sum);
	}
}
