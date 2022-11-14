package entyti;

public class Salelist {
    Items items;
    Items quatyti;

    public Items getItems() {
        return items;
    }

    public Salelist(Items items, int quatyti) {
        this.items = items;
        this.quatyti = quatyti;
    }


    public void setItems(Items items) {
        this.items = items;
    }

    public Items getQuatyti() {
        return quatyti;
    }

    public void setQuatyti(Items quatyti) {
        this.quatyti = quatyti;
    }

    @Override
    public String toString() {
        return "salesList{" +
                "items=" + items +
                ", quatyti=" + quatyti +
                '}';
    }

}
