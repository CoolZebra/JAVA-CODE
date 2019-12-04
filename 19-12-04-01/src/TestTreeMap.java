import java.util.Map;
import java.util.TreeMap;

/**
 * ����TreeMap��ʹ��
 * @author С����
 *
 */
public class TestTreeMap {
public static void main(String[] args) {
	Map<Integer,String> treemap1 = new TreeMap<>();
	
	treemap1.put(20, "aa");
	treemap1.put(30, "bb");
	treemap1.put(10, "cc");
	
	//����key�����ķ�ʽ����
	
	for(Integer key:treemap1.keySet()) {
	System.out.println(key+"---"+treemap1.get(key));
	}
	
	Map<Employee,String> treemap2 = new TreeMap<>();
	treemap2.put(new Employee(100,"����",9000),"�����������");
	treemap2.put(new Employee(80,"����",8000),"���ĸ������");
	treemap2.put(new Employee(40,"����",7000),"����������");
	
	for(Employee key:treemap2.keySet()) {
		System.out.println(key+"---"+treemap2.get(key));
	}
}
}

//���Լ������������ ��compareTo����
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
	//��дString����
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
