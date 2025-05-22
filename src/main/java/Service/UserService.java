package Service;

import Model.User;

import java.util.List;

public interface UserService {
    void createUsersTable();

    void dropUsersTable();

    void saveUser(String name, String lastName, byte age);

    void removeUserById(Long id);

    List<User> getAllUsers();

    void cleanUsersTable();
}