package C03Inheritance;

public class C05ProtectedTest {
    public static void main(String[] args) {
        C04ProtectedClass pc = new C04ProtectedClass();
        System.out.println(pc.st1); //public
//        System.out.println(pc.st2); //private
        System.out.println(pc.st3); //default
        System.out.println(pc.st4); //protected
    }
}
