package model;

public class GiaoVien {
    private String idGV;
    private String nameGV;
    private String phoneNumberGV;
    private String addressGV;

    public GiaoVien(String idGV, String nameGV, String phoneNumberGV, String addressGV) {
        this.idGV = idGV;
        this.nameGV = nameGV;
        this.phoneNumberGV = phoneNumberGV;
        this.addressGV = addressGV;
    }

    public String getIdGV() {
        return idGV;
    }

    public void setIdGV(String idGV) {
        this.idGV = idGV;
    }

    public String getNameGV() {
        return nameGV;
    }

    public void setNameGV(String nameGV) {
        this.nameGV = nameGV;
    }

    public String getPhoneNumberGV() {
        return phoneNumberGV;
    }

    public void setPhoneNumberGV(String phoneNumberGV) {
        this.phoneNumberGV = phoneNumberGV;
    }

    public String getAddressGV() {
        return addressGV;
    }

    public void setAddressGV(String addressGV) {
        this.addressGV = addressGV;
    }

    @Override
    public String toString() {
        return "Giao Vien - idGV: " + idGV + ", nameGV: " + nameGV;
    }
}
