package C07ExceptionFileParsing.Practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
    public Member findByEmail(String email){
        for (Member m : memberList){
            if (m.getEmail().equals(email)){
                return m;
            }
        }
        return null;
    }
    //id로 회원조회(회원상세조회)
    public Member findById(long id){
        for (Member m : memberList){
            if (m.getId()==id){
                return m;
            }
        }
        return null;
    }
    //회원전체조회(회원목록조회)
    public List<Member> findAll(){
        return new ArrayList<>(this.memberList);
    }
}
