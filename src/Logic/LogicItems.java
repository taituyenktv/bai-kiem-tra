package Logic;

import entyti.Items;
import run.Main;

import java.util.Scanner;

public class LogicItems {
    public static void showItems() {
    for (int i = 0; i < Main.itemss.length; i++) {
        if (Main.itemss[i] != null) {
            System.out.println(Main.itemss[i]);
        }
    }
}

    public static void addNewItems() {
        System.out.print("Nhập số lượng bài viết muốn thêm: ");
        int itemsNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < itemsNum; i++) {
            Items items = new Items();
            items.inputInfo();
            saveitems(items);
        }
        Main.countItems += itemsNum;
    }

    public static void saveitems(Items items) {
        if (items == null) {
            return;
        }
        for (int i = 0; i < Main.itemss.length; i++) {
            if (Main.itemss[i] == null) {
                Main.itemss[i] = items;
                break;
            }
        }
    }
    public static Items findItemsById(int id) {
        Items items = null;
        for (int k = 0; k < Main.itemss.length; k++) {
            if (Main.itemss[k] != null && Main.itemss[k].getId() == id) {
                items = Main.itemss[k];
                break;
            }
        }
        return items;
    }
}
