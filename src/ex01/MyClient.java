package ex01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MyClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 10000);

        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
        pw.println("hello world");

//        BufferedWriter bw = new BufferedWriter(
//                new OutputStreamWriter(socket.getOutputStream())
//        );
//        String data = """
//                {"username":"ssar","password":"1234"}
//                """;
//
//
//        bw.write(data+"\n");
//        bw.flush();
    }
}
