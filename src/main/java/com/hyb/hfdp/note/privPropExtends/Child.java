package com.hyb.hfdp.note.privPropExtends;

/**
 * TODO
 *
 * @author HYB
 * @since 2018/8/12 15:45
 **/
public class Child  extends Father{
    int age = 14;

    String name = "child";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
