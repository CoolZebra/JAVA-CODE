/**
 * 创建一个“人”类
 * @author 小斑马
 *
 */
public class Person {
	String name;//姓名
	float stature,weight;//身高、体重
	int age;//年龄
	float eatHeft;//吃的多少（重量）
	int moveSpeed;
	float eat() {
		//人吃东西的行为
		System.out.println("吃");
		return eatHeft;
	}
	void addSpeed(int Speed) {
		moveSpeed = moveSpeed + Speed;
	}
	public static void main(String[] args) {
		Person P1 = new Person();
		P1.name = "陈铁柱";
		P1.stature = 178f;
		P1.weight = 160f;
		P1.age = 23;
		P1.moveSpeed = 100;
		P1.addSpeed(250);
		P1.eat();
		P1.eatHeft = 10f;
		
		
		Person P2 = new Person();
		P2.name = "田二妞";
		P2.stature = 168f;
		P2.weight = 170f;
		P2.age = 23;
		P2.moveSpeed = 80;
		P2.addSpeed(70);
		P2.eat();
		P2.eatHeft = 10f;
		
	}
}
