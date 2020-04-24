package com.abhishek.serializable.custom;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomSerObject implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public CustomSerObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void readObject(ObjectInputStream oin) throws ClassNotFoundException, IOException {
        name = oin.readUTF();
        age = oin.readInt();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeUTF(name);
        out.writeInt(age);
    }
}
