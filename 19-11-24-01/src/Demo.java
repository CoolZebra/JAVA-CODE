/**
 * 手动抛出异常
 * @author 小斑马
 *
 */
public class Demo {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setAge(-12);
	}

}

class Person{
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0) {
			throw new IllegalAgeException("年龄不能为负数");
		}
		
		this.age = age;
	}
} 
class IllegalAgeException extends RuntimeException{
	public IllegalAgeException() {
		
	}
	public IllegalAgeException(String msg) {
		super(msg);
	}
}
