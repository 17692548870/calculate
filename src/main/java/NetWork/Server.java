package NetWork;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author xinglimin
 * @version V1.0
 * @Package NetWork
 * @date 2022/10/5 16:52
 */
public class Server {
    private static InputStream inputStream = null;

    public static void main(String[] args) throws IOException {
        try {
            ServerSocket serverSocket = new ServerSocket(8080);

            Socket socket = serverSocket.accept();

            inputStream = socket.getInputStream();

            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                String string = new java.lang.String(buffer, 0, len);
                System.out.println(string);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            inputStream.close();
        }
    }
}
