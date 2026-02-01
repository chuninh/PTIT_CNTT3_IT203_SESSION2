package ss4;

import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {

        String description =
                "Sách lập trình Java cơ bản, Kệ: A12-B3, dành cho sinh viên CNTT";

        if (description.contains("Kệ:")) {

            int keIndex = description.indexOf("Kệ:");
            int start = keIndex + "Kệ:".length();

            int commaIndex = description.indexOf(",", start);

            String shelfCode;

            if (commaIndex != -1) {
                shelfCode = description.substring(start, commaIndex).trim();
            } else {
                shelfCode = description.substring(start).trim();
            }

            System.out.println("Mã vị trí kệ: " + shelfCode);

            String newDescription =
                    description.replace("Kệ:", "Vị trí lưu trữ:");

            System.out.println("Mô tả sau khi thay thế:");
            System.out.println(newDescription);

        } else {
            System.out.println("Không tìm thấy thông tin kệ sách.");
        }
    }
}
