package homeWork.hw_8_07_05_2020.object.product;

public interface IDaoProduct {

    long create(Product product);

    Product[] readAll();

    Product[] readByName(String name);

    Product[] readByNameAndPriseFewGiven(String name, long prise);

    Product[] readByShelfLifeMoreGiven(int shelfLife);

    void remove(long id);

    void update(Product product);

    default void clear() {

    }
}
