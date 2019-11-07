import java.util.Arrays;
/**
 * 测试冒泡排序
 * @author 小斑马
 *
 */
public class TestBubbleSort {
	public static void main(String[] args) {
		int x[] = {15,13,10,45,56,98,12,19,75,3,520};
		int temp;
		for(int i =0;i<x.length-1;i++) {
			//判断是否得出结果 若得出 则停止测试
			boolean flag = true;
		for(int j = 0;j<x.length-1-i;j++) {
			//比较大小 并交换顺序
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
