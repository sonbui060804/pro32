package test;

import model.GiaoVien;
import model.Student;
import model.MonHoc;

public class Main {
    public static void main(String[] args) {
        // Tạo các object
        GiaoVien giaoVien = new GiaoVien("GV01", "bui van son ", "123456789", "123 ABC aStreet");
        Student student = new Student("S01", "Le Thi sao sa ", "9876sadas54321", "456 XYZa aStreet", "Nu");
        MonHoc monHoc = new MonHoc("MH01", "Toan");

        // In ra thông tin
        System.out.println(giaoVien);
        System.out.println(student);
        System.out.println(monHoc);
    }
}
