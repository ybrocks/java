//package C04Interface;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class C01InterfaceMain {
//    public static void main(String[] args) {
//        C01Cat c1 = new C01Cat();
//        c1.makeSound();
//
//        C01Dog d1 = new C01Dog();
//        d1.makeSound();
//
//        //인터페이스 특징1 - 다형성 : 하나의 부모타입으로 여러 자식객체를 다룰수있음
//        C01AnimalInterface1 c2 = new C01Cat();
//        c2.makeSound();
//        C01AnimalInterface1 d2 = new C01Dog();
//        d2.makeSound();
//
//        //다형성의 장점 : 기존 구현체(ArrayList)를 다른 구현체(LinkedList)로 변경시 용이함
////        List<Integer> myList = new ArrayList<>();
//        List<Integer> myList = new LinkedList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.get(0);
//
//        //인터페이스 특징2 - 다중구현(상속)이 가능
//        C01AnimalInterface1 c3 = new C01Cat();
//        c3.makeSound();
//        C01AnimalInterface2 c4 = new C01Cat();
//        c4.eat();
//
//        //다중구현 예시 - List Queue
//        List<Integer> myList1 = new ArrayList<>();
////        myList1.get(0); //사용가능
//        Queue<Integer> myList2 = new LinkedList<>();
////        myList2.get(0); //사용불가
//
//    }
//}
