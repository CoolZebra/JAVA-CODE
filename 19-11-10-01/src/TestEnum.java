/**
 * ����ö��
 * @author С����
 *
 */
public class TestEnum {

	public static void main(String[] args) {
		System.out.println(Season.WINTER);
		
		Season a = Season.SPRING;
//		a = Season.AUTUMN;
		
		switch(a) {
		case SPRING:
			System.out.println("����");
			break;
		case SUMMER:
			System.out.println("����");
			break;
		case AUTUMN:
			System.out.println("����");
			break;
		case WINTER:
			System.out.println("����");
			break;
		}
		
	}
}
	enum Season{
		SPRING,SUMMER,AUTUMN,WINTER
	}