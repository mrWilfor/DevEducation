package homeWork.hw_10_Shop_Extend.classes;

public class UIDGeneration {
    static long uid = 0;
    
    public static long getUID() {
        uid++;
        return uid;
    }
}
