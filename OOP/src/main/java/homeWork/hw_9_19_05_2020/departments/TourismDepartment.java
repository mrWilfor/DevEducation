package homeWork.hw_9_19_05_2020.departments;

import homeWork.hw_9_19_05_2020.Buyer;
import homeWork.hw_9_19_05_2020.product.Product;
import homeWork.hw_9_19_05_2020.product.Tourism;
import homeWork.hw_9_19_05_2020.storeStaff.Cashier;
import homeWork.hw_9_19_05_2020.storeStaff.Consultant;
import homeWork.hw_9_19_05_2020.storeStaff.SecurityGuard;
import homeWork.hw_9_19_05_2020.storeStaff.Staff;

import java.util.ArrayList;

public class TourismDepartment implements Department {
    private ArrayList<Product> listProduct;
    private ArrayList<Staff> listStaff;
    private ArrayList<Buyer> listBuyers;

    Cashier cashier;
    Consultant consultant;
    SecurityGuard securityGuard;

    public TourismDepartment() {
        this.listProduct = new ArrayList<>();
        this.listStaff = new ArrayList<>();
        this.listBuyers = new ArrayList<>();
        this.cashier = new Cashier("Sara", "Tourism department");
        this.consultant = new Consultant("Denny", "Tourism department");
        this.securityGuard = new SecurityGuard("Richard", "Tourism department");
        Tourism tent = new Tourism(
                "tent",
                "green",
                "for camping",
                300,
                "set on a flat surface and fasten"
        );
        Tourism knife = new Tourism(
                "multi functional knife",
                "orange",
                "for different task",
                120,
                "use careful, sharp knife"
        );
        Tourism backpack = new Tourism(
                "backpack",
                "green",
                "to carry a large volume of things",
                400,
                "put things tight and tighten the belts, in order to unpack, unfasten the tightening belts"
        );

        addStaff(cashier);
        addStaff(consultant);
        addStaff(securityGuard);

        addProduct(tent);
        addProduct(knife);
        addProduct(backpack);
    }

    @Override
    public void addProduct(Product product) {
        listProduct.add(product);
    }

    @Override
    public void deleteProduct(Product product) {
        listProduct.remove(product);
    }

    @Override
    public void addStaff(Staff staff) {
        staff.setDepartment("Tourism department");
        listStaff.add(staff);
    }

    @Override
    public void deleteStaff(Staff staff) {
        listStaff.remove(staff);
    }

    @Override
    public void addBuyer(Buyer buyer) {
        listBuyers.add(buyer);
    }

    @Override
    public void deleteBuyer(Buyer buyer) {
        listProduct.remove(buyer);
    }

    @Override
    public Buyer getBuyer(int number) {
        return listBuyers.get(number - 1);
    }

    @Override
    public String getListBuyers() {
        int number = 1;
        String result = "";

        for(Buyer b : listBuyers) {
            result = result + number + "\t" + b.toString() + "\n";
            number++;
        }
        return result;
    }

    @Override
    public String getListStaff() {
        int number = 1;
        String result = "";

        for(Staff s : listStaff) {
            result = result + number + "\t" + s.toString() + "\n";
            number++;
        }
        return result;
    }

    @Override
    public Staff getStaff(int index) {
        return listStaff.get(index);
    }

    @Override
    public Staff getStaff(String position) {
        Staff s = null;

        for (Staff staff : listStaff) {
            if (staff.getPosition().equals(position)) {
                s = staff;
            }
        }
        return s;
    }

    @Override
    public Staff getStaff(String position, boolean status) {
        Staff s = null;

        for (Staff staff : listStaff) {
            if (staff.getPosition().equals(position) && ((Consultant) staff).getStatus() == status) {
                s = staff;
            }
        }
        return s;
    }

    @Override
    public String getListProduct() {
        int number = 1;
        String result = "";

        for(Product p : listProduct) {
            result = result + number + "\t" + p.toString() + "\n";
            number++;
        }
        return result;
    }

    @Override
    public Product getProduct(int index) {
        return listProduct.get(index);
    }

    @Override
    public String getDepartmentName() {
        return "Tourism department";
    }
}
