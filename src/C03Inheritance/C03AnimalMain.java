package C03Inheritance;

public class C03AnimalMain {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.sound2();
        Cat c1 = new Cat();
        c1.sound2();

        //상속관계일떄는 부모클래스의 타입을 자식클래스의 객체타입으로 지정가능
        Animal a1 = new Dog();
        a1.sound1();
        //부모클래스의 타입으로 지정시에 부모클래스에서 정의된 메서드만 객체에서 사용가능
//        a1.sound2();
    }
}

class Animal{
public void sound1(){
    System.out.println("동물이 소리를 냅니다.");

}
}

class Dog extends Animal{
    @Override
    public void sound1(){
        System.out.println("멍멍");
    }
public void sound2(){
    System.out.println("멍멍멍멍");
}
}

class Cat extends Animal{
public void sound2(){
    System.out.println("야옹야옹");
}
}