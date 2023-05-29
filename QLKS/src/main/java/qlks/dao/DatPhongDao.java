/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import qlks.entity.*;

/**
 *
 * @author CNG;
 */
public class DatPhongDao {
    public boolean saveDatPhong(Datphong datPhong) throws IOException, ClassNotFoundException {
        try {
            List<Datphong> DatphongList = readDatPhongFromFile();
//            for(Datphong s : DatphongList) {
//                if(s.getSoPhong()==phong.getSoPhong()) {
//                    return false;
//                }
//            }
            DatphongList.add(datPhong);
               
            FileOutputStream fos = new FileOutputStream("src\\main\\java\\qlks\\File\\DatPhong.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(DatphongList);
            oos.close();
            fos.close();
            System.out.println("Don dat phong saved to file successfully.");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Datphong> readDatPhongFromFile() throws IOException, ClassNotFoundException {
        List<Datphong> DatphongList = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\main\\java\\qlks\\File\\DatPhong.dat"))) {
            DatphongList = (List<Datphong>) ois.readObject();
        } catch (EOFException e) {
            e.printStackTrace();
        }
        return DatphongList;
    }
    
    public boolean saveListDatPhong(List<Datphong> datPhong) throws IOException, ClassNotFoundException {
        try {
            FileOutputStream fos = new FileOutputStream("src\\main\\java\\qlks\\File\\DatPhong.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(datPhong);
            oos.close();
            fos.close();
            System.out.println("List Don dat phong saved to file successfully.");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

}
