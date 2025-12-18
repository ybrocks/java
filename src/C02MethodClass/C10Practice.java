package C02MethodClass;

import javax.swing.text.StringContent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10Practice {
    public static void main(String[] args) {

        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();

        while (true){
            System.out.println("서비스번호를 선택하세요.");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());

            if (number==1){
                System.out.println("회원가입 서비스입니다.");
                System.out.println("이름을 입력해주세요");
                String name=sc.nextLine();
                System.out.println("이메일을 입력해주세요.");
                String email=sc.nextLine();
                System.out.println("비밀번호를 입력해주세요.");
                String password=sc.nextLine();
                Author author = new Author(name, email, password);
                authorList.add(author);

            } else if (number == 2) {
                System.out.println("회원목록조회 서비스입니다.");
                for (Author a : authorList){
                    System.out.println("id:"+a.getId()+" email:"+a.getEmail());
                }
            } else if (number == 3) {
                System.out.println("회원상세조회입니다.");
                System.out.println("회원ID를 입력해주세요.");
                long id = Long.parseLong(sc.nextLine());
                Author author = null;
                for (Author a : authorList){
                    if (a.getId()==id){
                        author=a;
                        break;
                    }
                }
                System.out.println("id:"+author.getId()+" email:"+author.getEmail()+" name:"+author.getName()+" password:"+author.getPassword()+" 작성글수:"+author.getPostList().size());
            } else if (number == 4) {
                System.out.println("게시글 작성 서비스입니다.");
                System.out.println("제목을 입력해주세요.");
                String title=sc.nextLine();
                System.out.println("내용을 입력해주세요.");
                String contents=sc.nextLine();
                System.out.println("email을 입력해주세요.");
                String email=sc.nextLine();
                Author author=null;
                for (Author a : authorList){
                    if (a.getEmail().equals(email)){
                        author=a;
                        break;
                    }
                }
                Post post=new Post(title, contents, author);
                postList.add(post);
            } else if (number == 5) {
                System.out.println("게시글 목록 조회 서비스입니다.");
                for (Post p : postList){
                    System.out.println("id:"+p.getId()+" 제목:"+p.getTitle());
                }
            } else if (number == 6) {
                System.out.println("게시글 상세조회입니다.");
                System.out.println("게시글 ID를 입력해주세요");
                long id=Long.parseLong(sc.nextLine());
                Post post=null;
                for (Post p : postList){
                    if (p.getId()==id){
                        post=p;
                        break;
                    }
                }
                System.out.println("id:"+post.getId()+" 제목:"+post.getTitle()+" 내용:"+post.getContents()+" 작성자:"+post.getAuthor().getName());
            }
        }
    }
}
class Author{
    private Long id;
    private String name;
    private String email;
    private String password;
    private static long staticId;
    private List<Post> postList;

    public Author(String name, String email, String password){
        staticId++;
        this.id=staticId;
        this.name=name;
        this.email=email;
        this.password=password;
        this.postList=new ArrayList<>();
    }
    public Long getId() {return id;}
    public String getName() {return name;}
    public String getEmail() {return email;}
    public String getPassword() {return password;}
    public List<Post> getPostList() {return postList;}

}
class Post{
    private Long id;
    private String title;
    private String contents;
    private Author author;
    public static long staticId;

    public Post(String title, String contents, Author author){
        staticId++;
        this.id=staticId;
        this.title=title;
        this.contents=contents;
        this.author=author;
        author.getPostList().add(this);
    }
    public Long getId() {return id;}
    public String getTitle() {return title;}
    public String getContents() {return contents;}
    public Author getAuthor() {return author;}
}