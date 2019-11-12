import java.util.Arrays;
/**
 * 
 * @author Ð¡°ßÂí
 *
 */
public class Demo {

	public static void main(String[] args) {
		int x[] = {59,58,78,88,90,62,60,65,77,91};
		int max = 0;
		int min = 0;
		int sum = 0;
		float avg = 0;
		int temp = 0;
		for(int i = 0;i < x.length-1;i++) {
			
			for(int j = 0;j < x.length-1-i;j++) {
				if(x[j]>x[j+1]) {
					temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
				}
			}
			sum += x[i];
			avg = (float)sum/x.length;
		}
		max = x[0];
		min = x[x.length-1];
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);
	}
}
