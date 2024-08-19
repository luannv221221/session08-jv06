package ra.presentation;

import ra.businessImp.Employee;

import java.util.Scanner;

public class EmployeeManagement {

    private static Employee[] arrayEmloyee = new Employee[1000];
    private static int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("********************MENU********************* \n" +
                    "1. Nhập thông tin cho n nhân viên \n" +
                    "2. Hiển thị thông tin nhân viên \n" +
                    "3. Tính lương cho các nhân viên \n" +
                    "4. Tìm kiếm nhân viên theo tên nhân viên \n" +
                    "5. Cập nhật thông tin nhân viên \n" +
                    "6. Xóa nhân viên theo mã nhân viên \n" +
                    "7. Sắp xếp nhân viên theo lương tăng dần \n" +
                    "8. Sắp xếp nhân viên theo tên nhân viên giảm dần \n" +
                    "9. Thoát");
            System.out.println("Nhập vào lựa chọn ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice){
                case 1:
                    System.out.println("Nhap vào số lượng nhân viên muốn thêm ");
                    n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhâp nhân viên thứ "+(i+1));
                       arrayEmloyee[i] = new Employee();
                       arrayEmloyee[i].inputData(scanner);
                    }

                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        arrayEmloyee[i].displayData();
                    }
                    break;
                case 3:
                    for (int i = 0; i < n; i++) {
                        arrayEmloyee[i].displayData();
                        System.out.printf("Lương nhân viên %f",arrayEmloyee[i].calSalary());
                    }
                    break;
                case 4:
                    // khai bao 1 bien keyword;
                    System.out.println("Nhap vao ten muon tìm kiếm ");
                    String keyword = scanner.nextLine();
                    // mhap gia tri cho bien keyword
                    // chay vong lap kiem tra arrayEmloyee[i].getName().constranit == ytrue
                    for (int i = 0; i < n; i++) {
                        if(arrayEmloyee[i].getName().toLowerCase().contains(keyword.toLowerCase())){
                            arrayEmloyee[i].displayData();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Moi ban nhap vao ma nhan vien muon sua ");
                    String code = scanner.nextLine();
                    // khai bao 1 bien id;
                    // mhap gia tri cho bien id
                    // chay vong lap kiem tra arrayEmloyee[i].getName().equas == ytrue
                        // Nhạp lại thông cho nhân viên thứ i
                    for (int i = 0; i < n; i++) {
                        if(code.equals(arrayEmloyee[i].getId())){
                            arrayEmloyee[i].inputData(scanner);
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Sai lựa chọn");
            }
        } while (true);
    }
}
