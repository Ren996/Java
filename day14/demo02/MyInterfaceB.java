package day14.demo02;

public interface MyInterfaceB {
    //错误写法！接口不能有代码块
//    static {
//
//    }
    //错误写法！接口不能有构造方法
//    public MyInterface(){
//
//    }
    public abstract void methodB();
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("默认方法BBB");
    }
}
