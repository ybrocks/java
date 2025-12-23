package C07ExceptionFileParsing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class C02ExceptionAdvance {
    public static void main(String[] args){

        //의도된 예외 강제 발생 : 특정 시점에 프로그램을 강제 중지 시키기위한 목적
        Scanner sc = new Scanner(System.in);
        System.out.println("이메일을 입력해주세요");
        String email = sc.nextLine();
        System.out.println("비밀번호를 입력해주세요");
        String password = sc.nextLine();
        register(email, password);
        System.out.println("DB에 저장되는 코드"); //가정

        //checked Exception의 처리방법

        //1)throw를 통해 checked예외처리를 위임받고 main에서도 Throw(시스템에 위임)
//        String text = fileRead("src/C07ExceptionFileParsing/test.txt");
//        System.out.println(text);

        //2)throw를 통해 checked예외처리를 위임받고 호출하는 쪽에서 예외처리
//        try {
//            String text = fileRead("src/C07ExceptionFileParsing/test.txt");
//            System.out.println(text);
//        }catch (IOException e){
//            //사용자에게 메시지전달(가정)
//            System.out.println("파일 처리 과정에서 에러가 발생했습니다.");
//            e.printStackTrace();
//        }

        //3)checked예외를 try/catch하여 unchecked 예외 강제 발생(DB롤백 목적)
//                try {
//            String text = fileRead("src/C07ExceptionFileParsing/test.txt");
//            System.out.println(text);
//        }catch (RuntimeException e){
//            //사용자에게 메시지전달(가정)
//            System.out.println("파일 처리 과정에서 에러가 발생했습니다.");
//            e.printStackTrace();
//        }

    }
//    static String fileRead(String path) throws IOException {

        static String fileRead(String path){
        Path filePath = Paths.get(path);
            String text = null;
            try {
                text = Files.readString(filePath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return text;
    }

    static boolean register(String email, String password){
        if (password.length()>=10){
            return true;
        }else {
            //예외를 강제 발생시킴으로서 이 시점에서 해당 메서드 강제 종료
            //예외는 기본적으로 메서드를 호출한 쪽으로 전파
            throw new IllegalArgumentException("비빌먼호가 너무 짧습니다.");
        }
    }
}
