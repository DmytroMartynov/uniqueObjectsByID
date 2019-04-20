import java.util.*;

public class Main {

    public static void main(String[] args) {
        User user = new User("Dima", 10);
        User user1 = new User("Dasha", 11);
        User user2 = new User("Vasha", 12);
        User user3 = new User("Sasha", 10);
        List< User > users = new ArrayList<>();
        users.add(user);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        System.out.println(delete(users));
    }
    static Set< User > delete(List<User> usersList){
        Set<User> userList = new HashSet<User>(usersList);
       return userList;
    }

}
