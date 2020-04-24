package com.abhishek.serializable.custom;

import javax.xml.transform.sax.SAXSource;
import java.io.*;

public class CustomSerObjectRunner {
    public static void main(String args[]) {
        CustomSerObject obj1 = new CustomSerObject("Abhishek", 31);

        try {
            FileOutputStream fout = new FileOutputStream("e:\\serial\\custom.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(obj1);
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fin = new FileInputStream("e:\\serial\\custom.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);

            CustomSerObject cus = (CustomSerObject)oin.readObject();
            System.out.println(cus.getName());
            System.out.println(cus.getAge());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
