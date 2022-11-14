package Logic;

import entyti.*;
import run.Main;

import java.util.Scanner;

public class LogicSaleitems {

    public static void addNewQuatytiStaff() {
        if (!checkItemsAndStaffs()) {
            System.out.println("Chưa có dữ liệu về Nhân viên và mặt hàng. ");
            return;
        }
        System.out.print("Lập bảng danh sách bán hàng cho bao nhiêu nhân viên: ");
        int staffNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < staffNumber; i++) {
            System.out.println("Nhập thông tin bán hàng viên thứ " + (i + 1));
            System.out.print("Nhập mã nhân viên : ");
            Staff staff;
            int staffID;
            do {
                staffID = new Scanner(System.in).nextInt();
                staff = LogicStaff.findStaffById(staffID);
                if (staff != null) {
                    break;
                }
                System.out.print("Không có nhân viên nào mang mã " + staffID + " trog hệ thống, vui lòng nhập lại: ");
            } while (true);
            System.out.print("Nhập số lượng mặt hàng đã bán: ");
            int itemsNumber = 0;
            itemsNumber = new Scanner(System.in).nextInt();
            Salelist[] salelists = new Salelist[itemsNumber];
            int count = 0;
            int total = 0;
            for (int j = 0; j < itemsNumber; j++) {
                System.out.println("Nhập thông tin Nhóm hàng thứ " + (j + 1) + " mà nhân viên " + Staff.getAutoId() + " đã bán: ");
                System.out.print("Nhập id của  hàng thứ " + (j + 1) + ": ");
                Items items;
                int itemsID;
                do {
                    itemsID = new Scanner(System.in).nextInt();
                    items = LogicItems.findItemsById(itemsID);
                    if (items == null) {
                        System.out.print("Không có mặt hàng nào mang mã " + itemsID + " trog hệ thống, vui lòng nhập lại: ");
                        continue;
                    }
                    boolean daNhapLoaiHangNayHayChua = false;
                    for (int k = 0; k < salelists.length; k++) {
                        if (salelists[k] != null && salelists[k].getItems().getId() == itemsID) {
                            daNhapLoaiHangNayHayChua = true;
                            break;
                        }
                    }
                    if (!daNhapLoaiHangNayHayChua) {
                        break;
                    }
                    System.out.print("Loại hàng này bạn vừa mới nhập xong, nhập loại khác đi: ");
                } while (true);
                System.out.print("Nhập số hàng đã bán cua nhân viên này: ");
                int quatity = new Scanner(System.in).nextInt();
                salelists[count] = new Salelist(items, quatity);
                total += quatity;
                count++;
            }
            QuatytiStaff postManagement = new QuatytiStaff(staff, salelists);
            saveQuatytiStaff(postManagement);
        }
    }

    private static boolean checkItemsAndStaffs() {
        boolean isValidItems = false;
        for (int i = 0; i < Main.itemss.length; i++) {
            if (Main.itemss[i] != null) {
                isValidItems = true;
                break;
            }
        }

        boolean isValidStaff = false;
        for (int i = 0; i < Main.staffs.length; i++) {
            if (Main.staffs[i] != null) {
                isValidStaff = true;
                break;
            }
        }
        return isValidItems && isValidStaff;


    }

    private static void saveQuatytiStaff(QuatytiStaff quatytiStaff) {
        for (int i = 0; i < Main.quatytiStaffs.length; i++) {
            if (Main.quatytiStaffs[i] == null) {
                Main.quatytiStaffs[i] = quatytiStaff;
                break;
            }
        }
    }

    public static void showQuatytiStaff() {
        for (int i = 0; i < Main.quatytiStaffs.length; i++) {
            if (Main.quatytiStaffs[i] != null) {
                System.out.println(Main.quatytiStaffs[i]);
            }
        }
    }


}

