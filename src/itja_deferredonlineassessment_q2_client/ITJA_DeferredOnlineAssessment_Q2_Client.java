package itja_deferredonlineassessment_q2_client;

import java.net.Socket;
import java.io.*;

public class ITJA_DeferredOnlineAssessment_Q2_Client {

    public static void main(String[] args) {
        try {
            // Setting up connection
            System.out.println("Client Started");
            Socket soc = new Socket("localhost", 4444);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String string = userInput.readLine();
            PrintWriter output = new PrintWriter(soc.getOutputStream(), true);
            output.println(string);
            BufferedReader input = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(input.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
