import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.util.Arrays;

public class Server {

    public static void main(String[] args) {


        int portNumber = 8080;
        String host = "localhost";
        String[] myRequest;
        String myFiles = "www/logo.png";
        File myFile = new File(myFiles);
        String texts = "png";
        long fileSizeInBytes = myFile.length();
        String notFoundText = "www/404.html";
        String myText = "www/index.html";
        OutputStream out;
        File indexFile = new File(myText);
        File notFoundFile = new File(notFoundText);



        String image = "HTTP/1.1 200 ok \r\n Content-Type: image/" + texts + "\r\n Content-Length: " + fileSizeInBytes + "\r\n\r\n";
        String text = "HTTP/1.0 200 Document Follows\r\n Content-Type: text/html; charset=UTF-8\r\n Content-Length: " + myText + "\r\n\r\n";
        String notFound = "HTTP/1.0 404 Not Found Content-Type: text/html; charset=UTF-8\r\n Content-Length: " + notFoundText + "\r\n\r\n";

        System.out.println(fileSizeInBytes);
        System.out.println(image);
        // STEP2: Bind to local port and block while waiting for client connections
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(portNumber);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (true) {
            Socket clientSocket = null;
            try {
                clientSocket = serverSocket.accept();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(clientSocket);

            // STEP3: Setup input and output streams
            try {
                out = clientSocket.getOutputStream();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            BufferedReader in = null;
            try {
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            String message = null;
            try {
                message = in.readLine();
                myRequest = message.split(" ");
                //out.write(image.getBytes());
                //Files.copy(myFile.toPath(),out);
                System.out.println(myFile.toPath());
                if (myRequest[1].equals("/index.html")){
                    out.write(text.getBytes());
                    Files.copy(indexFile.toPath(),out);
                }else if (myRequest[1].equals("/logo.png")){
                    out.write(image.getBytes());
                    Files.copy(myFile.toPath(),out);
                }else{
                    out.write(notFound.getBytes());
                    Files.copy(notFoundFile.toPath(), out);

                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("this is the client message: " + message);




            System.out.println(myRequest[1]);



        }
    }
}


