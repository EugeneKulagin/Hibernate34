package Service;

import Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserServicelmpl implements UserService {
    private List<User> users = new ArrayList<>(); // Пример хранения пользователей в памяти

    @Override
    public void createUsersTable() {
        // Логика для создания таблицы пользователей
        System.out.println("Таблица пользователей создана.");
    }

    @Override
    public void dropUsersTable() {
        // Логика для удаления таблицы пользователей
        System.out.println("Таблица пользователей удалена.");
    }

    @Override
    public void saveUser(String name, String lastName, byte age) { // Изменено на int
        User user = new User(name, lastName, age);
        users.add(user); // Добавляем пользователя в список
        System.out.println("Пользователь " + name + " сохранен.");
    }

    @Override
    public void removeUserById(Long id) {
        boolean removed = users.removeIf(users -> users.getId() == id); // Удаляем пользователя по ID
        if (removed) {
            System.out.println("Пользователь с ID " + id + " удален.");
        } else {
            System.out.println("Пользователь с ID " + id + " не найден.");
        }
    }

    @Override
    public List<User> getAllUsers() {
        return users; // Возвращаем список всех пользователей
    }

    @Override
    public void cleanUsersTable() {
        users.clear(); // Очищаем список пользователей
        System.out.println("Таблица пользователей очищена.");
    }
}