/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;
import java.io.EOFException;
import java.io.FileInputStream;
import qlks.entity.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author CNG;
 */
public class ThemPhongDao {
    public boolean savePhong(Phong phong) throws IOException, ClassNotFoundException {
        try {
            List<Phong> phongList = readPhongFromFile();
            for(Phong s : phongList) {
                if(s.getSoPhong()==phong.getSoPhong()) {
                    return false;
                }
            }
            phongList.add(phong);
            FileOutputStream fos = new FileOutputStream("File\\DanhSachPhong.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(phongList);
            oos.close();
            fos.close();
            System.out.println("Phong saved to file successfully.");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean saveDanhSachPhong(List<Phong> dsphong) throws IOException, ClassNotFoundException {
        try{
            FileOutputStream fos = new FileOutputStream("File\\DanhSachPhong.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dsphong);
            oos.close();
            fos.close();
            System.out.println("DSPhong saved to file successfully.");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Phong> readPhongFromFile() throws IOException, ClassNotFoundException {
        List<Phong> phongList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("File\\DanhSachPhong.dat"))) {
            phongList = (List<Phong>) ois.readObject();
        } catch (EOFException e) {
            e.printStackTrace();
        }
        return phongList;
    }


}
