/**
 * ���һ����ά����
 * @author С����
 *
 */
public class Demo {
    public static void main(String[] args) {
        int [][] a=new int[5][5];//��ʼ������
        for(int i=0;i<a.length;i++) {//��ֵ�������ӡ
            for(int j=0;j<a.length;j++) {
                a[i][j]=(int)(Math.random()*100);
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");//����
        }
        int temp=-1;//�Ƚ���
        int q=0;//���ڼ�¼����λ��
        int w=0;//���ڼ�¼����λ��
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(a[i][j]>temp) {
                    temp=a[i][j];
                    q=i;
                    w=j;
                }
            }
        }
        System.out.print("�������ֵΪ��"+temp);
        System.out.print("��������λ�ã�[ "+q+"]["+w+"]");
    }
}