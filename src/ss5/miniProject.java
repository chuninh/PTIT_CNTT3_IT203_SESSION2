import java.util.*;

public class miniProject {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            showMenu();
            System.out.print("Chọn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    twoSum();
                    break;
                case 2:
                    moveZeroes();
                    break;
                case 3:
                    validPalindrome();
                    break;
                case 4:
                    reverseWords();
                    break;
                case 5:
                    happyNumber();
                    break;
                case 0:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }

    // ================= MENU =================
    static void showMenu() {
        System.out.println("\n===== ỨNG DỤNG THUẬT TOÁN JAVA =====");
        System.out.println("1.  Tìm cặp số có tổng bằng K (Two Sum)");
        System.out.println("2. Dồn số 0 về cuối mảng");
        System.out.println("3.  Kiểm tra chuỗi đối xứng");
        System.out.println("4.  Đảo ngược từ trong câu");
        System.out.println("5.  Kiểm tra số hạnh phúc");
        System.out.println("0. Thoát");
    }

    static void twoSum() {
        System.out.print("Nhập số phần tử: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("Nhập target: ");
        int target = Integer.parseInt(sc.nextLine());

        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Tìm thấy: i = " + i + ", j = " + j);
                    found = true;
                    return;
                }
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy cặp số!");
        }
    }

    static void moveZeroes() {
        System.out.print("Nhập số phần tử: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        while (index < n) {
            arr[index++] = 0;
        }

        System.out.println("Mảng sau khi dồn 0:");
        System.out.println(Arrays.toString(arr));
    }

    static void validPalindrome() {
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0, right = clean.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("Kết quả: " + isPalindrome);
    }

    static void reverseWords() {
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        String[] words = input.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }

        System.out.println("Chuỗi sau xử lý:");
        System.out.println(sb.toString());
    }

    static void happyNumber() {
        System.out.print("Nhập số n: ");
        int n = Integer.parseInt(sc.nextLine());

        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumSquareDigits(n);
        }

        if (n == 1) {
            System.out.println("Đây là số hạnh phúc!");
        } else {
            System.out.println("Không phải số hạnh phúc!");
        }
    }

    static int sumSquareDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
