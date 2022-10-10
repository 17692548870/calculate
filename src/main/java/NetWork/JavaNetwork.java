package NetWork;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author xinglimin
 * @version V1.0
 * @Package NetWork
 * @date 2022/10/5 16:37
 */
public class JavaNetwork {

    public static void main(String[] args) {
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getByName("www.baidu.com");
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        System.out.println(inetAddress.getHostAddress());
        String hostAddress = inetAddress.getHostAddress();
        System.out.println(hostAddress);
        byte[] address = inetAddress.getAddress();
        for (byte b : address) {
            System.out.println(
                    String.format("%02x", b)
            );
        }
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getCanonicalHostName());
    }
}
