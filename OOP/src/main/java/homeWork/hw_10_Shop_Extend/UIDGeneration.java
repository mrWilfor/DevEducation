package homeWork.hw_10_Shop_Extend;

public class UIDGeneration implements homeWork.hw_10_Shop_Extend.interfaceOfShop.UIDGeneration {
    private long uid = 0;

    @Override
    public long getUID() {
        uid++;
        return uid;
    }
}
