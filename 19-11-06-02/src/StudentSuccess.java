import java.util.*;
/**
 * ����ѧ���ɼ� �����ֵȼ�
 * @author С����
 *
 */
public class StudentSuccess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ѧ���ɼ���");
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
		case 5:System.out.println("������");
		break;
		case 6:System.out.println("��");
		break;
		case 7:System.out.println("��");
		break;
		case 8:System.out.println("��");
		break;
		case 9:
		case 10:System.out.println("��");
		}
	}
		else{
			System.out.println("error");
		}
  }
}
