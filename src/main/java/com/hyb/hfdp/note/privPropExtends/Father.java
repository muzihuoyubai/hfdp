package com.hyb.hfdp.note.privPropExtends;

/**
 * @author HYB
 * @since 2018/8/12 15:44
 **/
public class Father {
    int age = 40;

    String name = "father";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Father{" +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                '}';
    }

//    @Override
//    public String toString() {
//        return "Father{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
