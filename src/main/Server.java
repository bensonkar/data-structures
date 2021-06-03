package main;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author bkariuki
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            System.out.println("server waiting for client to connect");

            Socket socket = ss.accept();
            System.out.println("client connected");

//            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            String str = br.readLine().trim();
//            ;
//            System.out.println("client message is::::  " + str);
//
//            //sends output to client
//            OutputStreamWriter output = new OutputStreamWriter(socket.getOutputStream());
//            PrintWriter writer = new PrintWriter(output);
//            writer.println("socket test by server pros");
//            writer.flush();


            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


            String messageIn = "", messageOut = "";
            while (!messageIn.equals("end")) {
                messageIn = input.readUTF();
                System.out.println(messageIn);
                messageOut = br.readLine();
                output.writeUTF(messageOut);
                output.flush();
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
