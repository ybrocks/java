//package C02MethodClass;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class C10BoardService {
//    public static void main(String[] args) {
//
//        List<Author> authorList = new ArrayList<>();
//        List<Post> postList = new ArrayList<>();
//
//        Scanner sc = new Scanner(System.in);
//
//        while (true){
//            System.out.println("1.회원가입 2.회원목록 3.회원상세조회 4.게시글 작성 5.게시글 목록 6.게시글 상세조회");
//            int number = Integer.parseInt(sc.nextLine());
//
//            if (number==1){
//                System.out.println("[회원가입]이름/이메일/비밀번호");
//                String name = sc.nextLine();
//                String email = sc.nextLine();
//                String password = sc.nextLine();
//                if (name.isEmpty()||email.isEmpty()||password.isEmpty()){
//                    System.out.println("모두 입력하세요.");
//                    continue;
//                }
//                Author a1 = new Author(name, email, password);
//                authorList.add(a1);
//                System.out.println("회원가입완료");
//
//            }else if (number==2){
//                System.out.println("회원목록조회");
//                if (authorList.isEmpty()){
//                    System.out.println("회원이 없습니다.");
//                    continue;
//                }
//                for (Author a : authorList){
//                    System.out.println(a.getId()+a.getEmail());
//                }
//            } else if (number == 3) {
//                System.out.println("조회id입력");
//                long authorId = Long.parseLong(sc.nextLine());
//                Author author = null;
//                for (Author a : authorList){
//                    if (a.getId()==authorId){
//                        author=a;
//                        break;
//                    }
//                }
//                long count=0;
//                System.out.println(author.getName()+author.getEmail()+);
//
//            } else if (number == 4) {
//                System.out.println("[게시글작성]이메일/제목/내용 입력");
//                String email = sc.nextLine();
//                Author author = null;
//                for (Author a : authorList){
//                    if (a.getEmail().equals(email)){
//                        author = a;
//                        break;
//                    }
//                }
//                String title = sc.nextLine();
//                String contents = sc.nextLine();
//                if (title.isEmpty()||contents.isEmpty()){
//                    System.out.println("제목/내용을 작성하시오.");
//                    continue;
//                }
//                Post post = new Post(title, contents, author);
//                postList.add(post);
//                System.out.println("게시글 작성 완료");
//            } else if (number==5){
//                System.out.println("게시글 목록 조회");
//                if (postList.isEmpty()){
//                    System.out.println("게시글이 없습니다.");
//                    continue;
//                }
//                for (Post p : postList){
//                    System.out.println(p.getId()+p.getTitle());
//                }
//            } else if (number == 6) {
//                System.out.println("게시글 상세조회");
//                long postId = Long.parseLong(sc.nextLine());
//                Post post = null;
//
//                for (Post p : postList){
//                    if (p.getId()==postId){
//                        post = p;
//                        break;
//                    }
//                }
//                if (post==null){
//                    System.out.println("게시글이 없습니다.");
//                    continue;
//                }
//                String name = "";
//                if (post.getAuthor()!=null){
//                    name = post.getAuthor().getName();
//                }
//                System.out.println(post.getId()+post.getTitle()+post.getContents()+post.getAuthor().getName());
//            }
//        }
//    }
//}
//class Author{
//    private Long id;
//    private String name;
//    private String email;
//    private String password;
//    private static long staticId;
//
//    public Author(String name, String email, String password){
//        staticId++;
//        this.id=staticId;
//        this.name=name;
//        this.email=email;
//        this.password=password;
//    }
//    public Long getId() {
//        return id;
//    }
//    public String getName() {
//        return name;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public String getPassword() {
//        return password;
//    }
//    @Override
//    public String toString() {
//        return "{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
//}
//class Post{
//    private Long id;
//    private String title;
//    private String contents;
//    private Author author;
//    private static long staticId;
//
//    public Post(String title, String contents, Author author){
//        staticId++;
//        this.id=staticId;
//        this.title=title;
//        this.contents=contents;
//        this.author=author;
//    }
//    public Long getId() {
//        return id;
//    }
//    public String getTitle() {
//        return title;
//    }
//    public String getContents() {
//        return contents;
//    }
//    public Author getAuthor() {
//        return author;
//    }
//    @Override
//    public String toString() {
//        return "{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                ", contents='" + contents + '\'' +
//                ", author=" + author +
//                '}';
//    }
//}