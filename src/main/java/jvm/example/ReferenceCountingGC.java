package jvm.example;

/**
 * testGC() 方法执行后，objA和objB会不会被GC呢？
 * @author zzm
 * */
public class ReferenceCountingGC {

    public Object instance = null;
    private static final int _1MB = 1024 * 1024;

    /**
     * 这个成员属性的唯一意义就是占内存， 以便能在GC日志中看清楚是否被回收过
     * */
    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String [] args){
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objA;
        objB.instance = objB;
        objA = null;
        objB = null;
        // 假设在这行发生GC，objA和objB 是否能被回收?
        System.gc();
    }


}
