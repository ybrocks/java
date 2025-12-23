package C07ExceptionFileParsing.Practice1;

import java.util.List;

public class MemberService {

     private MemberRepository memberRepository;

     public MemberService(){
         memberRepository = new MemberRepository();
     }
     public void register(String name, String email, String password){
         Member member = memberRepository.findByEmail(email);
         if (member != null){
             throw new IllegalArgumentException("이미 사용중인 이메일입니다.");
         }
         Member newMember = new Member(name, email, password);
         memberRepository.register(newMember);
     }
     public Member findById(long id){
         Member member = memberRepository.findById(id);
         if (member==null){
             throw new IllegalArgumentException("존재하지 않는 id입니다.");
         }
         return member;
     }
    public List<Member> findAll(){
         return memberRepository.findAll();
    }
    public void login(String email, String password){
         Member member = memberRepository.findByEmail(email);
         if (member==null){
             throw new IllegalArgumentException("존재하지 않는 이메일입니다.");
         }
         if (!member.getPasseord().equals(password)){
             throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
         }
    }
}
