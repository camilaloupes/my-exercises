package io.codeforall.fanstatics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {


        // STEP1: Get parameters from command line arguments
        int portNumber = 8080;

        // STEP2: Bind to local port and block while waiting for client connections
        ServerSocket serverSocket = new ServerSocket(portNumber);
        while (true) {
            Socket clientSocket = serverSocket.accept();

            System.out.println(clientSocket);

            // STEP3: Setup input and output streams
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            String message = in.readLine();
            System.out.println("this is the client message: " + message);
            // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        }
    }
}
