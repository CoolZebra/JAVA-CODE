import java.util.Scanner;
/**
 * 测试菱形
 */
public class TestRhombus{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        //代表菱形的行数
        int n;
        //判断是否有效
        do{
            System.out.print("请输入菱形的行数：");
            n = sc.nextInt();
        }while(n%2 == 0 || n <= 0);

        int m = (n-1)/2;

        for(int i = -m;i <= m;i++){
            for(int j = -m;j <= m;j++){
                //当<=变成==是就变成了一个空心菱形
                if(Math.abs(j)+Math.abs(i)<=Math.abs(m)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}

    