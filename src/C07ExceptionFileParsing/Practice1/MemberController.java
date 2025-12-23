package C07ExceptionFileParsing.Practice1;

import C07ExceptionFileParsing.MemberException.MemberRepository;

import java.util.Scanner;

public class MemberController {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MemberService memberService = new MemberService();

        while (true){
            System.out.println("서비스 번호를 입력해주세요.");
            System.out.println("1.회원가입 2.회원상세조회 3.회원목록조회 4.로그인" );
            String input = sc.nextLine();

            if (input.equals("1")){
                try {
                    System.out.println("회원가입 서비스입니다.");
                    System.out.println("이름을 입력해주세요.");
                    String name = sc.nextLine();
                    System.out.println("이메일을 입력해주세요");
                    String email = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요.");
                    String password = sc.nextLine();
                    memberService.register(name, email, password);
                    System.out.println("회원가입 완료");
                }catch (IllegalArgumentException e){
                    System.out.println("회원가입 실패");
                }
            } else if (input.equals("2")) {
                try {
                    System.out.println("회원상세조회 서비스입니다.");
                    System.out.println("회원 id를 입력해주세요.");
                    long id = Long.parseLong(sc.nextLine());
                    Member member = memberService.findById(id);
                    System.out.println(member);
                }catch (NumberFormatException e){
                    System.out.println("숫자만 입력 가능합니다.");
                }catch (IllegalArgumentException e){
                    System.out.println("존재하지않는 id입니다.");
                }
            } else if (input.equals("4")) {
                try {
                    System.out.println("로그인 서비스입니다,");
                    System.out.println("이메일을 입력해주세요.");
                    String email = sc.nextLine();
                    System.out.println("비밀번호를 입력해주세요.");
                    String password = sc.nextLine();
                    memberService.login(email, password);
                    System.out.println("로그인 성공");
                }catch (IllegalArgumentException e){
                    System.out.println("로그인 실패");
                }
            }
        }
    }
}
