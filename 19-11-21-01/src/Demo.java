/**
 * 内部类
 * @author 小斑马
 *
 */
public abstract class Demo{
    public abstract boolean disposable();
    public static void main(String[] args) {
        Demo i=new Demo() {
            public boolean disposable() {
                System.out.println("这是一个匿名类");
                return true;
            }
        };
        i.disposable();
    }
}
