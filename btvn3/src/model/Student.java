package model;

public class Student {
    private String idS;
    private String names;
    private String phoneNumbers;
    private String addressS;
    private String gioitinhS;

    public Student(String idS, String names, String phoneNumbers, String addressS, String gioitinhS) {
        this.idS = idS;
        this.names = names;
        this.phoneNumbers = phoneNumbers;
        this.addressS = addressS;
        this.gioitinhS = gioitinhS;
    }

    public String getIdS() {
        return idS;
    }

    public void setIdS(String idS) {
        this.idS = idS;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getAddressS() {
        return addressS;
    }

    public void setAddressS(String addressS) {
        this.addressS = addressS;
    }

    public String getGioitinhS() {
        return gioitinhS;
    }

    public void setGioitinhS(String gioitinhS) {
        this.gioitinhS = gioitinhS;
    }

    @Override
    public String toString() {
        return "Hoc Sinh - idS: " + idS + ", names: " + names + ", gioitinhS: " + gioitinhS;
    }
}

