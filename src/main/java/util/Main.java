package util;

import DAO.UserDao;
import DAO.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Name1", "LastName1", (byte) 20);
        userDao.saveUser("Name2", "LastName2", (byte) 25);
        userDao.saveUser("Name3", "LastName3", (byte) 31);
        userDao.saveUser("Name4", "LastName4", (byte) 38);

        System.out.println(userDao.getAllUsers()); // Выводим всех пользователей

        userDao.removeUserById(1L); // Удаляем пользователя с ID 1
        System.out.println(userDao.getAllUsers()); // Проверяем оставшихся пользователей

        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}