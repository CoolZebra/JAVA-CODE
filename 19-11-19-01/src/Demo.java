 /**
  * ������ ��ȡ��ǰ���ں�����
  */
import java.util.Date;
   
public class Demo{
   
    public static void main(String[] args) {
        Date now= new Date();
  
        //��ǰ���ڵĺ�����
        System.out.println("Date.getTime() \t\t\t����ֵ: "+now.getTime());
        //ͨ��System.currentTimeMillis()��ȡ��ǰ���ڵĺ�����
        System.out.println("System.currentTimeMillis() \t����ֵ: "+System.currentTimeMillis());
           
    }
}
