package ra.string;

public class Demo1 {
    public static void main(String[] args) {
        // Khai báo chuổi
        String name = "Trần Mai";
        name = "Mai Trần";

        // các phương thức làm việc với chuỗi

        // equals trả về true neeus 2 chuoi bang nhau flase neu 2 chuoi khong ban nhau
        String str1 = "Nguyễn Thị Mai";
        String str2 = "Nguyễn Thị Mai Mai";
        System.out.println("so sánh chui vơi equals "+str1.equals(str2));

        // trả về độ dài của ký tự
        System.out.println("str1 có độ dài là "+str1.length());
        String st3 = "mai";
        // viết hoa
        System.out.println(st3.toUpperCase());

        // nối 2 chuoix với nhau
        System.out.println("Cộng chuỗi 1 với chuoxi 2"+str1.concat(str2));

        // cắt khoảng trắng 2 đầu
        String str4 = " mai ";
        str4= str4.trim();
        System.out.println(str4.length());

        // kiểm tra 1 chuỗi có nằm trong 1 chuoxi khác hay không
        String str5 = "mai";
        String str6 = "nguyen thi mai";
        System.out.println("chuôỗi str5 có tồn tại trong chuôi str6 ko "+str6.contains(str5));

        // so sánh sử dung compareTo
        String str7 = "Rikkei Education";
        String str8 = "Rikkei";
        System.out.println(str7.compareTo(str8));

        // tìm kiếm và thay thế replace
        System.out.println(str7.replace("Education","Academy"));

        // thay thế tất cả
        System.out.println(str8.replaceAll("Rikkei","R"));

        // startsWith kiểm tra chuỗi đầu có phải là giá trị truyền vào ko
        String str9 = "C111";
        System.out.println(str9.startsWith("B"));
    }
}
