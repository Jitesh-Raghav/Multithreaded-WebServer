import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public class Server_MultiThreaded {
    public Consumer<Socket> getConsumer() {
        return (clientSocket) -> {
            try {
                PrintWriter toClient = new PrintWriter(clientSocket.getOutputStream());
                toClient.println("Hello from the server");
                toClient.close();
                clientSocket.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        };
    }

    public static void main(String[] args) {
        int port = 8010;
        Server_MultiThreaded server = new Server_MultiThreaded();

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(100000);
            System.out.println("Server is listening on port " + port);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connected to "+ clientSocket.getRemoteSocketAddress());
                // Create and start a new thread for each client
                Thread thread = new Thread(() -> server.getConsumer().accept(clientSocket));
                thread.start();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
