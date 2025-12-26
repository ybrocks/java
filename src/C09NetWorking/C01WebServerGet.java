package C09NetWorking;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class C01WebServerGet {
    public static void main(String[] args) throws IOException {
        //사용자 : 크롬을 통해 http://서버url get요청(http 요청문서 조립필요)
        //서버 : "hello world java" 문자열을 응답(http 응답문서 조립필요)
        //소켓이란 서버와 사용자가 통신을 하기 위한 네트워크 통신의 끝점을 나타내는 개념
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("서버시작");
        while (true){
            //accept(받아들이다) : 사용자의 연결 요청을 수락
            //socket객체 안에는 사용자가 보내온 http 요청 문서 및 사용자 정보(ip 등)가 들어있음
            Socket socket = serverSocket.accept();
            //write : 사용자에게 서버의 응답메시지를 전송
            String response = "HTTP/1.1 200 OK\r\n\r\n" + "hello world java";
            socket.getOutputStream().write(response.getBytes(StandardCharsets.UTF_8));
            //flush : 일반적으로 변경사항을 확정하는것
            socket.getOutputStream().flush();
            socket.close();
        }
    }
}
