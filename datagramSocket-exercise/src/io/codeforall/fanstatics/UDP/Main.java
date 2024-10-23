package io.codeforall.fanstatics.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Main {

    public static void main(String[] args) throws IOException {


        int localPort = 8080;


        // STEP2: Create send and receive buffers
        byte[] sendBuffer = new byte[1024];
        byte[] recvBuffer = new byte[1024];

        // STEP3: Open a UDP (datagram) socket

        DatagramSocket socket = new DatagramSocket(localPort);

        while (true) {

            // STEP4.1: Create and receive UDP datagram packet from the socket
            DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
            socket.receive(receivePacket); //receber a informação (escuta)


            String sentence = new String(receivePacket.getData(), 0, receivePacket.getLength()); // nova variavel do tipo string e o dado que foi recebido é transformado em uma string. You need to use receivePacket.getLength() to get the payload size.
            System.out.println("RECEIVED: " + sentence);
            String capitalizedSentence = sentence.toUpperCase(); // transforma a string recebida em upperCase
            InetAddress IPAddress = receivePacket.getAddress(); // criou-se uma variavel do tipo InetAdress
            int port = receivePacket.getPort(); //buscar a porta que recebeu a string (que estava na escuta)


            sendBuffer = capitalizedSentence.getBytes(); // busca o numero de bytes da string que foi transformada em upper para preparar para envio



            DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length, IPAddress, port);
            socket.send(sendPacket); //novo objeto datagram em seguida metodo para envio ao cliente(no terminal).


        }
    }
}