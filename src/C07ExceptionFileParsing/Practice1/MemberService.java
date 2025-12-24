//package C07ExceptionFileParsing.Practice1;
//
//import java.util.List;
//import java.util.NoSuchElementException;
//import java.util.Optional;
//
//public class MemberService {
//
//     private MemberRepository memberRepository;
//
//     public MemberService(){
//         memberRepository = new MemberRepository();
//     }
//     public void register(String name, String email, String password) throws IllegalArgumentException{
//         Member member = memberRepository.findByEmail(email);
//         if (member != null){
//             throw new IllegalArgumentException("이미 사용중인 이메일입니다.");
//         }
//         Member newMember = new Member(name, email, password);
//         memberRepository.register(newMember);
//     }
//     public Member findById(long id) throws NumberFormatException{
//         return memberRepository.findById(id).
//         orElseThrow(()->new NoSuchElementException("존재하지않는 사용자"));
//
//         }
//     }
//    public List<Member> findAll(){
//         return memberRepository.findAll();
//    }
//    public void login(String email, String password)throws NoSuchElementException, IllegalArgumentException{
//         Optional<Member> member = memberRepository.findByEmail(email);
//         Member member = Optional
//         }
//    }
//}
