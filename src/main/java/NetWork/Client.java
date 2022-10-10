package NetWork;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author xinglimin
 * @version V1.0
 * @Package NetWork
 * @date 2022/10/5 16:51
 */
@SuppressWarnings("ALL")
public class Client {

    public static void main(String[] args) throws IOException {
        InetAddress serverIp = InetAddress.getByName("localhost");
        int port = Integer.parseInt("8080");
        Socket socket = new Socket(serverIp, port);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello world".getBytes());
        outputStream.flush();
    }
}
