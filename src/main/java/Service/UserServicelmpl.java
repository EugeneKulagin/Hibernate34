package Service;

import DAO.UserDao;
import DAO.UserDaoHibernatelmpl;
import Model.User;
import Service.UserService;

import java.util.List;

public class UserServicelmpl implements UserService {
    private final UserDao dao;

    public UserServicelmpl() {
        dao = new UserDaoHibernatelmpl();
    }

    public void createUsersTable() {
        dao.createUsersTable();
    }

    public void dropUsersTable() {
        dao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        dao.saveUser(name, lastName, age);
        System.out.println("User с именем: " + name + " " + lastName +
                " " + age + " лет, добавлен в б.д.");
    }

    public void removeUserById(Long id) {
        dao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }

    public void cleanUsersTable() {
        dao.cleanUsersTable();
    }
}