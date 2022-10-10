package Template;

/**
 * @author xinglimin
 * @version v1.0
 * @date 2022/09/14 13:19
 */
public class Main {
    public static void main(String[] args) {
        String str = "hello";

        StringBuilder builder = new StringBuilder("hello");

        StringBuffer buffer = new StringBuffer("hello");

        str = str+str;

        builder  = builder.append("hello");

        buffer  = buffer.append("hello");
    }
}
