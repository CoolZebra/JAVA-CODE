import java.util.Scanner;
/**
 * ��������
 */
public class TestRhombus{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        //�������ε�����
        int n;
        //�ж��Ƿ���Ч
        do{
            System.out.print("���������ε�������");
            n = sc.nextInt();
        }while(n%2 == 0 || n <= 0);

        int m = (n-1)/2;

        for(int i = -m;i <= m;i++){
            for(int j = -m;j <= m;j++){
                //��<=���==�Ǿͱ����һ����������
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

    