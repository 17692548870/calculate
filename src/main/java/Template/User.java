package Template;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author xinglimin
 * @version v1.0
 * @date 2022/09/14 14:18
 */
public class User {


    public User(String username, String userId) {
        this.username = username;
        this.userId = userId;
    }

    private String username;

    private String userId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    public static void main(String[] args) {
        User user11 = new User("11", "11");
        User user12 = new User("12", "12");
        User user122 = new User("122", "12");
        HashMap<User, String> map = new HashMap<>();
        map.put(user11,user11.username);
        map.put(user12,user12.username);
        map.put(user122,user122.username);
        System.out.println(map.size());
    }
}
