package C09NetWorking;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class C04WebServerDb {
    public static void main(String[] args) throws IOException, SQLException {
        //사용자 : 크롬을 통해 http://localhost:8080?id=1 get요청
        //서버 : DB에서 조회한 결과값을 문자열 형식으로 응답 1)일반문자열 2)json
        ServerSocket serverSocket = new ServerSocket(8080);

        String url = "jdbc:mysql://localhost:3306/board?useSSL=false";
        String userName = "root";
        String password = "test123";
        Connection myConnection = DriverManager.getConnection(url, userName, password);
        Statement st = myConnection.createStatement();


        System.out.println("서버시작");
        while (true){
            Socket socket = serverSocket.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuffer sb = new StringBuffer();
            String line = br.readLine();
            while (line != null && !line.isEmpty()){
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            String id = "";
            if (infos.contains("?")){
                id = infos.split("=")[1];
            }
            ResultSet result = st.executeQuery("select * from posts where id="+"\'"+id+"\'");
            Posts posts = null;
            while (result.next()){
//                response += "id : " + result.getInt("id");
//                response += "title : " + result.getString("title");
//                response += "contants : " + result.getString("contants");
                posts = new Posts(result.getLong("id"), result.getString("title"), result.getString("contants"));
            }

            ObjectMapper objectMapper = new ObjectMapper();
            String jsonPosts = objectMapper.writeValueAsString(posts);
            System.out.println(posts);
            String response = "HTTP/1.1 200 OK\r\n" + "Content-Type: application/json; charset=UTF-8\r\n\r\n" + jsonPosts;
            socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().flush();
            socket.close();
        }
    }
}
class Posts{
    private long id;
    private String title;
    private String contants;

    public Posts() {

    }
    public Posts(long id, String title, String contants) {
        this.id = id;
        this.title = title;
        this.contants = contants;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContants() {
        return contants;
    }
    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", contants='" + contants + '\'' +
                '}';
    }
}