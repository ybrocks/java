package C07ExceptionFileParsing.Practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class MemberRepository {

    private List<Member> memberList;

    //저장List생성
    public MemberRepository(){
        this.memberList = new ArrayList<>();
    }
    //회원저장(회원가입)
    public void register(Member member){
        this.memberList.add(member);
    }
    //이메일 조회(회원가입-중복, 로그인-맞는지)
    public Optional<Member> findByEmail(String email){
        Member member = null;
        for (Member m : memberList){
            if (m.getEmail().equals(email)){
                member = m;
                break;
            }
        }
        return Optional.ofNullable(member);
    }
    //id로 회원조회(회원상세조회)
    public Optional<Member> findById(long id){
        Member member = null;
        for (Member m : memberList){
            if (m.getId()==id){
                member = m;
                break;
            }
        }
        return Optional.ofNullable(member);
    }
    //회원전체조회(회원목록조회)
    public List<Member> findAll(){
        return new ArrayList<>(this.memberList);
    }
}
