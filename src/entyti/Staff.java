package entyti;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;

public class Staff extends Person{

    private static int AUTO_ID = 1000;
    private int id;
    private String companyEnterDate;


    public String getCompanyEnterDate() {
        return companyEnterDate;
    }

    public void setCompanyEnterDate(String companyEnterDate) {
        this.companyEnterDate = companyEnterDate;
    }

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



    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", id=" + id +
                ", companyEnterDate=" + companyEnterDate +
                '}';
    }
    @Override
    public void inputInfo() {
        super.inputInfo();
        AUTO_ID++;
        this.id = AUTO_ID;
        System.out.println("Mời nhập ngày gia nhập công ty: ");
        this.companyEnterDate = new Scanner(System.in).nextLine();

    }

}


