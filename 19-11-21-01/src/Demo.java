/**
 * �ڲ���
 * @author С����
 *
 */
public abstract class Demo{
    public abstract boolean disposable();
    public static void main(String[] args) {
        Demo i=new Demo() {
            public boolean disposable() {
                System.out.println("����һ��������");
                return true;
            }
        };
        i.disposable();
    }
}
