package entyti;

import java.util.Arrays;

public class QuatytiStaff {
    private Staff staff;
    public Salelist[] salelists;

    public QuatytiStaff(Staff staff, Salelist[] salelists) {
        this.staff = staff;
        this.salelists = salelists;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Salelist[] getSalelists() {
        return salelists;
    }

    public void setSalelists(Salelist[] salelists) {
        this.salelists = salelists;
    }

    @Override
    public String toString() {
        return "QuatytiStaff{" +
                "staff=" + staff +
                ", salelists=" + Arrays.toString(salelists) +
                '}';
    }
}
