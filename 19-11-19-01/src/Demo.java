 /**
  * 日期类 获取当前日期毫秒数
  */
import java.util.Date;
   
public class Demo{
   
    public static void main(String[] args) {
        Date now= new Date();
  
        //当前日期的毫秒数
        System.out.println("Date.getTime() \t\t\t返回值: "+now.getTime());
        //通过System.currentTimeMillis()获取当前日期的毫秒数
        System.out.println("System.currentTimeMillis() \t返回值: "+System.currentTimeMillis());
           
    }
}
