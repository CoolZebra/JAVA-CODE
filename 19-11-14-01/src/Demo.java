/***
 * ���1000���ڵ�����
 * @author С����
 *
 */
public class Demo {

	public static void main(String[] args) {
		 int count = 0;
		 for(int i = 1;i < 1000;i++) {
			 boolean b = false;
			 for(int j = 2;j <= Math.sqrt(i);j++) {
				 if(i%j == 0) {
					 b = false;break;
				 }
				 else {b = true;}
			 }
			 if(b == true) {
				 count++;
				 System.out.println(i);
			 }
		 }
		 System.out.println("�����ĸ���Ϊ��"+count);
	}
}
