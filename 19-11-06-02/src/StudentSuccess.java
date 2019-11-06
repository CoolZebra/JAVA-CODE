import java.util.*;
/**
 * 输入学生成绩 并划分等级
 * @author 小斑马
 *
 */
public class StudentSuccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入学生成绩：");
		int x = sc.nextInt();
		int y;
		if(x>=0&&x<=100) {
		y = x/10;
		switch(y) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:System.out.println("不及格");
		break;
		case 6:System.out.println("差");
		break;
		case 7:System.out.println("中");
		break;
		case 8:System.out.println("良");
		break;
		case 9:
		case 10:System.out.println("优");
		}
	}
		else{
			System.out.println("error");
		}
  }
}
