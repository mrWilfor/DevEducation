package homeWork.hw_10_Shop_Extend;

import homeWork.hw_10_Shop_Extend.classes.employee.Administrator;

public class Main {
    public static void main(String[] args) {
        Administrator administrator = new Administrator("nick");
        System.out.println(administrator.getRole());
    }
}
