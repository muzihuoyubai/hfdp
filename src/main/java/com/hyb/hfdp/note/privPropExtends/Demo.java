package com.hyb.hfdp.note.privPropExtends;

/**
 * 父类中的属性继承demo
 * 类的属性不具备多态性
 *
 * @author HYB
 * @since 2018/8/12 15:45
 **/
public class Demo {
    public static void main(String[] args) {
        Father father = new Father();
        Father cFather = new Child();
        Child child = new Child();
        //40 走父类方法拿父类属性
        System.out.println(father.getAge());

        //40 走父类方法拿父类属性
        System.out.println(cFather.getAge());

        //40 走父类方法拿父类属性，因为没有重写父类的getAge方法
        System.out.println(child.getAge());

        //father 走父类方法拿父类属性
        System.out.println(father.getName());

        //child 重写了父类getName方法，多态，运行时获取子类的属性
        System.out.println(cFather.getName());

        //child 调用子类中重写的方法，获取子类属性
        System.out.println(child.getName());

        //father 父类引用，获取父类的属性
        System.out.println(father.name);

        //father 父类引用，获取父类的属性
        System.out.println(cFather.name);

        //child 子类引用，获取子类的方法
        System.out.println(child.name);

//        @Override
//        public String toString() {
//            return "Father{" +
//                    "age=" + age +
//                    ", name='" + name + '\'' +
//                    '}';
//        }
        //父类重写了toString，子类不重写
        //父类toString中，打印时直接引用属性
        //Father{age=40, name='father'}
        System.out.println(father);

        //Father{age=40, name='father'}
        System.out.println(cFather);

        //由于子类没有重写toString，引用了父类的toString获取父类的属性
        //Father{age=40, name='father'}
        System.out.println(child);


//        @Override
//        public String toString() {
//            return "Father{" +
//                    "age=" + getAge() +
//                    ", name='" + getName() + '\'' +
//                    '}';
//        }
        //父类重写了toString，子类不重写
        //父类toString中，打印时使用方法获取属性
        //Father{age=40, name='father'}
        System.out.println(father);

        //没有重写getAge，因此取得父类的方法
        //重写getName，通过方法的多态，获取到了子类的name属性
        //Father{age=40, name='child'}
        System.out.println(cFather);

        //由于子类没有重写toString，引用了父类的toString获取父类的属性
        //父类toString中调用了子类的getName方法，获取到了子类的name属性
        //可以理解为子类的引用，调用的方法中，包含子类重写的方法引用的属性全部是子类的属性
        //该方法即使是在父类方法中调用，也是被重写了
        //Father{age=40, name='child'}
        System.out.println(child);
    }
}
