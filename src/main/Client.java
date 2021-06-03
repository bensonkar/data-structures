package main;

import java.io.*;
import java.net.Socket;

/**
 * @author bkariuki
 */
public class Client {

    public static void main(String[] args) {
        String ip = "localhost";
        int port = 9999;
        try {
            Socket socket = new Socket(ip, port);
            System.out.println("connected");


//            //sends output to server
//            OutputStreamWriter output = new OutputStreamWriter(socket.getOutputStream());
//            PrintWriter writer = new PrintWriter(output);
//            writer.println("socket test by admin");
//            writer.flush();
//
//            //read data from server
//            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//            String str = br.readLine();
//            System.out.println("server message is::::  "+str);

            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String messageIn = "", messageOut = "";
            while (!messageIn.equals("end")) {
                messageOut = br.readLine();
                output.writeUTF(messageOut);
                messageIn = input.readUTF();
                System.out.println(messageIn);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
