package com.atguigu.chapter08.javaInnerClass;

public class JavaInnerClass {
    public static void main(String[] args) {

        //创建两个外部类对象
        OuterClass outerClass1 = new OuterClass();
        OuterClass outerClass2 = new OuterClass();

        //创建成员内部类对象，把成员内部类当做一个属性
        OuterClass.InnerClas innerClas1 = outerClass1.new InnerClas();
        OuterClass.InnerClas innerClas2 = outerClass2.new InnerClas();

        //创建静态内部类，静态内部类和类相关
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();

        //内部类之和类型相关，只要OuterClass.InnerClas类型的对象就可以传给形参InnerClas ic
        innerClas1.test(innerClas1);
        innerClas2.test(innerClas2);
        innerClas1.test(innerClas2);
        innerClas2.test(innerClas1);


    }
}

class OuterClass {//外部类

    class InnerClas {//成员内部类

        public void test(InnerClas ic) {
            System.out.println(ic);
        }
    }

    static class StaticInnerClass {//静态内部类

    }
}
