/**
 * 输出一个二维数组
 * @author 小斑马
 *
 */
public class Demo {
    public static void main(String[] args) {
        int [][] a=new int[5][5];//初始化数组
        for(int i=0;i<a.length;i++) {//赋值并输出打印
            for(int j=0;j<a.length;j++) {
                a[i][j]=(int)(Math.random()*100);
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");//换行
        }
        int temp=-1;//比较数
        int q=0;//用于记录数组位置
        int w=0;//用于记录数组位置
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i][j]>temp) {
                    temp=a[i][j];
                    q=i;
                    w=j;
                }
            }
        }
        System.out.print("数组最大值为："+temp);
        System.out.print("数组所在位置：[ "+q+"]["+w+"]");
    }
}