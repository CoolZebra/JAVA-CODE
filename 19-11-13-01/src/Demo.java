import java.util.Scanner;
public class Demo{
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
         System.out.println("请输入年份：" );
         int x =s.nextInt();
       
        if (x%4==0 && x%100!=0 || x%400==0)
            System.out.println(x + "是闰年");
        else
            System.out.println(x + "不是闰年：" );
    }
}