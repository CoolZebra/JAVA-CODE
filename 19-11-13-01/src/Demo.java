import java.util.Scanner;
public class Demo{
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
         System.out.println("��������ݣ�" );
         int x =s.nextInt();
       
        if (x%4==0 && x%100!=0 || x%400==0)
            System.out.println(x + "������");
        else
            System.out.println(x + "�������꣺" );
    }
}