/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import qlks.entity.User;
/**
 *
 * @author CNG;
 */
public class UserDao {
    public boolean checkUser(User user) {
        if (user == null) return false;
        else
        {
            try {
            File file = new File("File//User.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                String fileUsername = parts[0];
                String filePassword = parts[1];

                if (fileUsername.equals(user.getUserName()) && filePassword.equals(user.getPassword())) {
                    return true;
                    //break;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    return false;
        }
        
    }
}