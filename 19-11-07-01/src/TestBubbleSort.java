import java.util.Arrays;
/**
 * ����ð������
 * @author С����
 *
 */
public class TestBubbleSort {
	public static void main(String[] args) {
		int x[] = {15,13,10,45,56,98,12,19,75,3,520};
		int temp;
		for(int i =0;i<x.length-1;i++) {
			//�ж��Ƿ�ó���� ���ó� ��ֹͣ����
			boolean flag = true;
		for(int j = 0;j<x.length-1-i;j++) {
			//�Ƚϴ�С ������˳��
			if(x[j]>x[j+1]) {
				temp = x[j];
				x[j] = x[j+1];
				x[j+1] = temp;
				
				flag = false;
			}
			}
		    if(flag) {
				break;
		}
			System.out.println(Arrays.toString(x));
		}
	}
}
