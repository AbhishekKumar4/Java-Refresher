package com.abhishek.serializable;

import java.io.*;

public class TestSer {
    public static void main(String args[]) {
        DemoSer1 demoSer1 = new DemoSer1("Abhishek", 31);
        try {
            FileOutputStream fout = new FileOutputStream("e:\\serial\\serial.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(demoSer1);
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fin = new FileInputStream("e:\\serial\\serial.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);
            DemoSer1 deser = (DemoSer1) oin.readObject();
            System.out.println(deser.ename);
            System.out.println(deser.age);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}