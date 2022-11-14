package Logic;

import entyti.Staff;
import run.Main;

import java.util.Scanner;

public class LogicStaff {
    public static void showStaff() {
        for (int i = 0; i < Main.itemss.length; i++) {
            if (Main.itemss[i] != null) {
                System.out.println(Main.itemss[i]);
            }
        }
    }
    public static void addNewStaff() {
        System.out.print("Nhập số lượng phóng viên muốn thêm: ");
        int writerNum = new Scanner(System.in).nextInt();
        for (int i = 0; i < writerNum; i++) {
            Staff staff = new Staff();
            staff.inputInfo();
            saveStaff(staff);
        }
    }
    public static void saveStaff(Staff staff) {
        if (staff == null) {
            return;
        }
        for (int i = 0; i < Main.staffs.length; i++) {
            if (Main.staffs[i] == null) {
                Main.staffs[i] = staff;
                break;
            }
        }
    }
    public static Staff findStaffById(int id) {
        Staff staff = null;
        for (int j = 0; j < Main.staffs.length; j++) {
            if (Main.staffs[j] != null && Main.staffs[j].getId() == id) {
                staff = Main.staffs[j];
                break;
            }
        }
        return staff;
    }
}
