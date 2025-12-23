package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;

//저장소역할을 하는 계층
//DB에 CRUD를 수행하는 계층
public class MemberRepository {
    private List<Member> memberList;

    public MemberRepository(){
        this.memberList = new ArrayList<>();
    }
    //저장
    public void register(Member member){
        this.memberList.add(member);
    }
    //이메일로 조회
    public Member findByEmail(String email){
        for (Member m : memberList){
            if (m.getEmail().equals(email)){
                return m;
            }
        }
        return null;
    }
    //id로 조회
    public Member findById(long id){
        for (Member m : memberList){
            if (m.getId().equals(id)){
                return m;
            }
        }
        return null;
    }
    //회원목록조회
    public List<Member> findAll(){
        return new ArrayList<>(this.memberList);
    }
}