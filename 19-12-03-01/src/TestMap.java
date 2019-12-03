import java.util.HashMap;
import java.util.Map;

/*
 * 
 * 测试HashMap的常用方法
 */
public class TestMap {
public static void main(String[] args) {
	Map<Integer,String> m1 = new HashMap<>();
	
	System.out.println(m1.size());
	System.out.println(m1.isEmpty());
	
	m1.put(1, "张三");
	m1.put(2, "李四");
	m1.put(3, "王麻子");
	
	System.out.println(m1.get(2));
	
	System.out.println(m1.size());
	System.out.println(m1.isEmpty());
	System.out.println(m1.containsKey(3));
	System.out.println(m1.containsValue("王五"));
	
	
	Map<Integer,String> m2 = new HashMap<>();
	
	m2.put(5, "王五");
	m2.put(6, "赵六");
	System.out.println(m1);
	m1.putAll(m2);
	System.out.println(m2);
	System.out.println(m1);
	
	m1.put(3, "陈铁柱");
	System.out.println(m1);
	
	
	
}
}
