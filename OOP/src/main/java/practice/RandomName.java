package practice;

import java.util.ArrayList;

public class RandomName {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Baranov");
        list.add("Borshchov");
        list.add("Voloha");
        list.add("Vyazovoi");
        list.add("Lyhnenko");
        list.add("Mokretsov");
        list.add("Spivak");
        list.add("Stupar");
        list.add("Tarasov");
        list.add("Shkuro");
        list.add("Yutsevich");

        String name = list.get((int) (Math.random() * 11));
        System.out.println(name);
    }
}
