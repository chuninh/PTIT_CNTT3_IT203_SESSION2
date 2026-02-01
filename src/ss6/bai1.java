package ss6;

class Student {
    String maSV;
    String hoTen;
    int namSinh;
    double diemTrungBinh;

    Student(String maSV, String hoTen, int namSinh, double diemTrungBinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    void hienThiThongTin() {
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.println("Điểm trung bình: " + diemTrungBinh);
        System.out.println("----------------------------");
    }
}

public class bai1 {
    public static void main(String[] args) {

        Student sv1 = new Student("SV001", "chu van ninh", 2006, 8.5);
        Student sv2 = new Student("SV002", "nguyen tai minh ngoc", 2006, 7.8);

        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
    }
}
