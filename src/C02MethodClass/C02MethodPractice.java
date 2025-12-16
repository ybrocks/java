package C02MethodClass;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class C02MethodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());
        if (isPrime(input)){
            System.out.println("입력하신 숫자는 소수입니다.");
        }else {
            System.out.println("입력하신 숫자는 소수가 아닙니다.");
        }
    }

    //소수판별기 메서드(isPrime) 생성
    //접근제어자(public), 클래서메서드, 반환타입(boolean), 입력값int
    public static boolean isPrime(int n){
        //메서드에서 return을 만나면 강제 종료
        if (n<2) return false;

        for (int i=2; i*i<=n; i++){
            if (n%i==0) return false;
        }
        return true;
    }

    public static void voidMethod(){
        if (true){
            //void메서드에서 return은 메서드 강제종료 목적으로 사용
            return;
        }
        System.out.println("hello world");
    }
}
