/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author CNG;
 */
public class ReadIndex {
    public static void writeIntToFile(int number) {
        try {
            FileOutputStream fos = new FileOutputStream("src\\main\\java\\qlks\\File\\index.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeInt(number);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int readIntFromFile() {
        int number = 0;
        try {
            FileInputStream fis = new FileInputStream("src\\main\\java\\qlks\\File\\index.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            number = ois.readInt();
            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }
}
