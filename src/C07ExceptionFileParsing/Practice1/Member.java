package C07ExceptionFileParsing.Practice1;

public class Member {

    private static long staticId = 0L;
    private long id;
    private String name;
    private String email;
    private String passeord;

    public Member(String name, String email, String password){
        this.id=staticId;
        this.name=name;
        this.email=email;
        this.passeord=password;
        staticId++;
    }
    public static long getStaticId() {
        return staticId;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPasseord() {
        return passeord;
    }
    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
