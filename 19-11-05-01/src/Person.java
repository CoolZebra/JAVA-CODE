/**
 * ����һ�����ˡ���
 * @author С����
 *
 */
public class Person {
	String name;//����
	float stature,weight;//��ߡ�����
	int age;//����
	float eatHeft;//�ԵĶ��٣�������
	int moveSpeed;
	float eat() {
		//�˳Զ�������Ϊ
		System.out.println("��");
		return eatHeft;
	}
	void addSpeed(int Speed) {
		moveSpeed = moveSpeed + Speed;
	}
	public static void main(String[] args) {
		Person P1 = new Person();
		P1.name = "������";
		P1.stature = 178f;
		P1.weight = 160f;
		P1.age = 23;
		P1.moveSpeed = 100;
		P1.addSpeed(250);
		P1.eat();
		P1.eatHeft = 10f;
		
		
		Person P2 = new Person();
		P2.name = "����";
		P2.stature = 168f;
		P2.weight = 170f;
		P2.age = 23;
		P2.moveSpeed = 80;
		P2.addSpeed(70);
		P2.eat();
		P2.eatHeft = 10f;
		
	}
}
