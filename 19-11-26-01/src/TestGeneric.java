import java.util.Arrays;

/**
 * ���Է���
 * @author С����
 *
 */
public class TestGeneric {
  public static void main(String[] args) {
	
	MyCollection<String> mc = new MyCollection<String>();
	
	mc.set("����", 0);
	String a = mc.get(0);
	   
}
}
class MyCollection<T>{
	Object[] objs = new Object[5];
	
	public void set(T t,int index) {
		objs[index] = t;
	}
	
	public T get(int index) {
		return (T)objs[index];
	}
	
}
