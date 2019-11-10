/**
 * 测试枚举
 * @author 小斑马
 *
 */
public class TestEnum {

	public static void main(String[] args) {
		System.out.println(Season.WINTER);
		
		Season a = Season.SPRING;
//		a = Season.AUTUMN;
		
		switch(a) {
		case SPRING:
			System.out.println("春天");
			break;
		case SUMMER:
			System.out.println("夏天");
			break;
		case AUTUMN:
			System.out.println("秋天");
			break;
		case WINTER:
			System.out.println("冬天");
			break;
		}
		
	}
}
	enum Season{
		SPRING,SUMMER,AUTUMN,WINTER
	}