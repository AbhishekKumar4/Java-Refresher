package com.abhishek.serialization.hasa;

import com.abhishek.serializable.DemoSer1;

import java.io.*;

public class TestRunner {
    public static void main(String args[]) {
        DemoSer demoSer = new DemoSer("Abhishek", 31, new DemoSerHasa("anyString"));
        //serializeObject(demoSer);
        deSerializeObject();
    }

    private static void deSerializeObject() {
        try {
            FileInputStream fin = new FileInputStream("e:\\serial\\demoSerialHasA.txt");
            ObjectInputStream oin = new ObjectInputStream(fin);
            DemoSer deser = (DemoSer) oin.readObject();
            System.out.println(deser.getEname());
            System.out.println(deser.getAge());
            System.out.println(deser.getDemoSerHasa().getAnyString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void serializeObject(DemoSer demoSer) {
        try {
            FileOutputStream fout = new FileOutputStream("e:\\serial\\demoSerialHasA.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(demoSer);
            out.flush();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}