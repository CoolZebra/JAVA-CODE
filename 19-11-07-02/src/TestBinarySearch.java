import java.util.Arrays;
/**
 * ���Զ��ַ����ң��۰������
 * @author С����
 *
 */
public class TestBinarySearch {

	public static void main(String[] args) {
		int x[] = {45,461,3,78,132,45,66,12,98,755};
		//�ȶ�����ʹ��Array�������������
		Arrays.sort(x);
		//���������
		System.out.println(Arrays.toString(x));
		//���Ҹ��������Ƿ��������ҵ��� ��������ʾλ�� ���� �򷵻�-1
		System.out.println(myBinarySearch(x,456));
		
		}
		public static int myBinarySearch(int x[],int value) {
			//��һ��Ԫ��λ��Ϊ0 
			int low = 0;
			//���һ��Ԫ��λ��Ϊ���鳤��-1
			int high = x.length-1;
			
			/*
			 *����һ�� mid ��������һ�볤�ȵ�λ�� ���������ҵ�value��midλ�õ�Ԫ�ؽ��бȽ�
			 *��ֵ��� �򷵻����ֵ value 
			 *��value����midλ�ô���ֵ �� ������ǰ�벿������ ��[low+1]�滻ԭmid��λ��
			 *��valueС��mid*****************��********���� ��[high-1]�滻************
			 *ͨ����mid���¶��� ѭ����������
			 *ֱ���ҳ���value��λ��
			 * */
			
			while(low <= high) {
				int mid = (low + high)/2;
				if(value == x[mid]) {
					return mid;
				}
				if(value > x[mid]) {
					low = mid + 1;
				}
				if(value < x[mid]) {
					high = mid - 1;
				}
			} 
			//����value�������ڸ������� ��return -1
			return -1;
		}
}
