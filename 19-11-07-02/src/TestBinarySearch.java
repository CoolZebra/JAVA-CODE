import java.util.Arrays;
/**
 * 测试二分法查找（折半检索）
 * @author 小斑马
 *
 */
public class TestBinarySearch {

	public static void main(String[] args) {
		int x[] = {45,461,3,78,132,45,66,12,98,755};
		//先对数组使用Array工具类进行排序
		Arrays.sort(x);
		//输出该数组
		System.out.println(Arrays.toString(x));
		//查找该数组中是否有所查找的数 若有则显示位置 若无 则返回-1
		System.out.println(myBinarySearch(x,456));
		
		}
		public static int myBinarySearch(int x[],int value) {
			//第一个元素位置为0 
			int low = 0;
			//最后一个元素位置为数组长度-1
			int high = x.length-1;
			
			/*
			 *定义一个 mid 代表数组一半长度的位置 再用所查找的value与mid位置的元素进行比较
			 *若值相等 则返回这个值 value 
			 *若value大于mid位置处的值 则 将数组前半部分隐藏 用[low+1]替换原mid的位置
			 *若value小于mid*****************后********隐藏 用[high-1]替换************
			 *通过对mid重新定义 循环上述操作
			 *直到找出该value的位置
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
			//若该value不存在于该数组中 则return -1
			return -1;
		}
}
