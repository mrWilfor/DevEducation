package homeWork.hw_8_Parth_3_19_05_2020.departments;

import homeWork.hw_8_Parth_3_19_05_2020.Buyer;
import homeWork.hw_8_Parth_3_19_05_2020.product.Product;
import homeWork.hw_8_Parth_3_19_05_2020.product.SportsWear;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Cashier;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Consultant;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.SecurityGuard;
import homeWork.hw_8_Parth_3_19_05_2020.storeStaff.Staff;

import java.util.ArrayList;

public class SportsWearDepartment implements Department {
    private ArrayList<Product> listProduct;
    private ArrayList<Staff> listStaff;
    private ArrayList<Buyer> listBuyers;

    Cashier cashier;
    Consultant consultant;
    SecurityGuard securityGuard;

    public SportsWearDepartment() {
        this.listProduct = new ArrayList<>();
        this.listStaff = new ArrayList<>();
        this.listBuyers = new ArrayList<>();
        this.cashier = new Cashier("Sara", "Sport wear department");
        this.consultant = new Consultant("Denny", "Sport wear department");
        this.securityGuard = new SecurityGuard("Richard", "Sport wear department");
        SportsWear trousers = new SportsWear(
                "sports trousers",
                "blue",
                "for sports and everyday wear",
                200,
                "34",
                "trousers"
        );
        SportsWear shirt = new SportsWear(
                "active sport shirt",
                "red",
                "for sports and everyday wear",
                150,
                "M",
                "shirt"
        );
        SportsWear sneakers = new SportsWear(
                "sneakers for running",
                "silver",
                "for running and any active sport",
                150,
                "M",
                "sneakers"
        );

        addStaff(cashier);
        addStaff(consultant);
        addStaff(securityGuard);

        addProduct(trousers);
        addProduct(shirt);
        addProduct(sneakers);
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
        staff.setDepartment("Sport wear department");
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
        return "Sport wear department";
    }
}
