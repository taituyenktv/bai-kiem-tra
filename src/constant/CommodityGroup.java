package constant;

public enum CommodityGroup {

//    Điện tử, Điện lạnh, Máy tính, Thiết bị văn phòng

    DIEN_TU("Điện tử"),
    DIEN_LANH("Điện lạnh"),
    MAY_TINH("Máy tính"),
    THIETBI_VANPHONG("Thiết bị văn phòng");

    public  String value;

    CommodityGroup(String value) {
        this.value = value;
    }
}
