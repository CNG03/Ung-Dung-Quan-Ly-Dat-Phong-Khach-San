/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import qlks.entity.Datphong;
import qlks.entity.Hoadon;

/**
 *
 * @author CNG;
 */
public class HoaDonDao {
    public boolean saveHoaDon(Hoadon hoadon) throws IOException, ClassNotFoundException {
        try {
            List<Hoadon> hoaDonList = readHoaDonFromFile();
            hoaDonList.add(hoadon);
            FileOutputStream fos = new FileOutputStream("File\\HoaDon.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(hoaDonList);
            oos.close();
            fos.close();
            System.out.println("Hoa don saved to file successfully.");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Hoadon> readHoaDonFromFile() throws IOException, ClassNotFoundException {
        List<Hoadon> hoaDonList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("File\\HoaDon.dat"))) {
            hoaDonList = (List<Hoadon>) ois.readObject();
        } catch (EOFException e) {
            e.printStackTrace();
        }
        return hoaDonList;
    }
}
