package run;

import Logic.LogicItems;
import Logic.LogicSaleitems;
import Logic.LogicStaff;
import entyti.Items;
import entyti.QuatytiStaff;
import entyti.Staff;

import java.util.Scanner;


public class Main {
    public static Staff[] staffs = new Staff[100000];
    public static Items[] itemss = new Items[100000];
    public static QuatytiStaff[] quatytiStaffs = new QuatytiStaff[1000];
    public static int countItems = 0;

    public static void main(String[] args) { menu();}


        private static void menu() {
            while (true) {
                showMenu();
                int functionChoice = chooseFunction();
                switch (functionChoice) {
                    case 1:
                        LogicItems.addNewItems();
                        break;
                    case 2:
                        LogicItems.showItems();
                        break;
                    case 3:
                        LogicStaff.addNewStaff();
                        break;
                    case 4:
                        LogicStaff.showStaff();
                        break;
                    case 5:
                        LogicSaleitems.addNewQuatytiStaff();
                        break;
                    case 6:
                        LogicSaleitems.showQuatytiStaff();
                        break;
                    case 7:

                        break;
                    case 8:
                        return;
                    case 9:
                        return;
                    case 10:
                        return;
                }
            }
        }

    private static int chooseFunction() {
        System.out.print("Xin mời chọn chức năng: ");
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 10) {
                break;
            }
            System.out.print("Chức năng vừa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        return choice;


    }

    private static void showMenu() {
        System.out.println("----PHẦN MỀM QUẢN LÝ CỬA HÀNG-----");
        System.out.println("1. Nhập danh sách mặt hàng mới: ");
        System.out.println("2. In ra danh sách mặt hàng đã có. ");
        System.out.println("3. Nhập danh sách nhân viên mới. ");
        System.out.println("4. In ra danh sách nhân viên đã có: ");
        System.out.println("5. Lập bảng tính danh sách bán hàng cho từng nhân viên: ");
        System.out.println("6. In ra danh sách bán hàng cho từng nhân viên: ");
        System.out.println("7. Sắp xếp danh sách nhân viên theo bảng danh sách. ");
        System.out.println("7. Sắp xếp danh sách nhân viên theo nhóm mặt hàng. ");
        System.out.println("9. Lập bảng kê doanh thu cho mỗi nhân viên .");
        System.out.println("10. Thoát.");

    }

}

