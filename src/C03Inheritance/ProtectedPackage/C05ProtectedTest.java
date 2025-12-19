package C03Inheritance.ProtectedPackage;

import C03Inheritance.C04ProtectedClass;

public class C05ProtectedTest extends C04ProtectedClass{
    public static void main(String[] args) {
        C05ProtectedTest pc = new C05ProtectedTest();
        System.out.println(pc.st1); //public
//        System.out.println(pc.st2); //private
//        System.out.println(pc.st3); //default
        System.out.println(pc.st4); //protected
    }
}

