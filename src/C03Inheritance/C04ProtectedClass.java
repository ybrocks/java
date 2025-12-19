package C03Inheritance;

//class에는 public, default 접근제어자만 존재(private X, protected X)
public class C04ProtectedClass {
    //변수, 메서드는 4가지 접근제어자 존재
    //public : 프로젝트 전체에서 접근가능(다른 패키지도 접근가능)
    //private : 같은 클래스만 접근가능
    //default : 같은 패키지만 접근가능
    //protected : 같은 패키지 접근가능 + 다른 패키지도 상속관계는 접근가능
    public String st1 = "hello java1";

    private String st2 = "hello java2";

    String st3 = "hello java3";

    protected String st4 = "hello java4";

}
