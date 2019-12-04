import java.util.Map;
import java.util.TreeMap;

/**
 * 测试TreeMap的使用
 * @author 小斑马
 *
 */
public class TestTreeMap {
public static void main(String[] args) {
	Map<Integer,String> treemap1 = new TreeMap<>();
	
	treemap1.put(20, "aa");
	treemap1.put(30, "bb");
	treemap1.put(10, "cc");
	
	//按照key递增的方式排序
	
	for(Integer key:treemap1.keySet()) {
	System.out.println(key+"---"+treemap1.get(key));
	}
	
	Map<Employee,String> treemap2 = new TreeMap<>();
	treemap2.put(new Employee(100,"张三",9000),"张三个人情况");
	treemap2.put(new Employee(80,"李四",8000),"李四个人情况");
	treemap2.put(new Employee(40,"王五",7000),"王五个人情况");
	
	for(Employee key:treemap2.keySet()) {
		System.out.println(key+"---"+treemap2.get(key));
	}
}
}

//对自己定义的类排序 用compareTo方法
class Employee implements Comparable<Employee>{
	int id;
	String Ename;
	double Salary;
	public Employee(int id, String ename, double salary) {
		super();
		this.id = id;
		Ename = ename;
		Salary = salary;
	}
	//重写String方法
	public String toString(){
		return "id:"+id+",Ename:"+Ename+",salary:"+Salary;
	}

	public int compareTo(Employee o) {
		if(this.Salary>o.Salary) {
			return 1;
		}else if(this.Salary<o.Salary) {
			return -1;
		}else if(this.id>o.id) {
			return 1;
		}else if(this.id<o.id) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
}
