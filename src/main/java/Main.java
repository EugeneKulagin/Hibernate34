import Model.User;
import Service.UserService;
import Service.UserServicelmpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServicelmpl();
        userService.createUsersTable();

        userService.saveUser("Dire", "Wolf", (byte) 150);
        userService.saveUser("Tyrion", "Lannister", (byte) 30);
        userService.saveUser("Daenerys", "Targaryen", (byte) 28);
        userService.saveUser("John", "Snow", (byte) 25);

        userService.removeUserById(3);

        userService.getAllUsers();

        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}