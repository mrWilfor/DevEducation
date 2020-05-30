package homeWork.hw_10_Shop_Extend.classes;

public class UIDGeneration {
    static long uid = 10000000;
    
    public static long getUID() {
        return ++uid;
    }
}
