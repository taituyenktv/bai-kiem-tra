package entyti;

import constant.CommodityGroup;

import java.util.Scanner;

public class Items implements Inputinfo{
    private static int AUTO_ID = 1000;
    private int id;
    private String name;
    private CommodityGroup type;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public CommodityGroup getType() {
        return type;
    }

    public void setType(CommodityGroup type) {
        this.type = type;
    }

    private double price;
    private int amount;

    public static int getAutoId() {
        return AUTO_ID;
    }

    public static void setAutoId(int autoId) {
        AUTO_ID = autoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", quantity=" + quantity +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }


    @Override
    public void inputInfo() {
        AUTO_ID++;
        this.id = AUTO_ID;
        System.out.println("Nhập tên mặt hàng:  ");
        this.name= new Scanner(System.in).nextLine();
        System.out.println("Nhập số lượng mặt hàng: ");
        this.quantity = new Scanner(System.in).nextInt();
        System.out.println("Nhập loại Nhóm hàng: ");
        System.out.println("1. Điện từ");
        System.out.println("2. Điện lạnh");
        System.out.println("3. Máy tính");
        System.out.println("4. Thiết bị văn phòng");
        System.out.print("Lựa chọn: ");
        int typeTemp = 0;
        do {
            typeTemp = new Scanner(System.in).nextInt();
            if (typeTemp >= 1 && typeTemp <= 4) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        switch (typeTemp) {
            case 1:
                this.type = CommodityGroup.DIEN_TU;
                break;
            case 2:
                this.type = CommodityGroup.DIEN_LANH;
                break;
            case 3:
                this.type = CommodityGroup.MAY_TINH;
                break;
            case 4:
                this.type = CommodityGroup.THIETBI_VANPHONG;
                break;
        }
    }

}
