package overridetech.jdbc.jpa;

import overridetech.jdbc.jpa.dao.UserDaoJDBCImpl;
import overridetech.jdbc.jpa.model.User;
import overridetech.jdbc.jpa.service.UserServiceImpl;
import overridetech.jdbc.jpa.util.Util;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Konstantin", "Konstantinov", (byte) 35);
        userService.saveUser("Dmitriy", "Dmitriev", (byte) 25);
        userService.saveUser("Ivan", "Ivanov", (byte) 15);
        userService.saveUser("Artem", "Artemov", (byte) 45);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
