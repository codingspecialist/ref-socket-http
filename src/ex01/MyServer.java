package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000); // 1. 서버소켓 생성

            Socket socket = serverSocket.accept(); // 2. 리스닝
            System.out.println("oh! connect?");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String line = br.readLine(); // 버퍼에 있는 메시지를 \n까지 읽는다.
            System.out.println("read : "+line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
