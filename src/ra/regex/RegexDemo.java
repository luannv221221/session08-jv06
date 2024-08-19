package ra.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        // chuỗi mẫu
        String stringRegex = "x";
        // chuoi so khop
        String string = "x";
        System.out.println("So khop ko "+ Pattern.matches(stringRegex,string));

        System.out.println("so khơp Là ab hoặc cd "+Pattern.matches("(ac|bc)","acd"));
        System.out.println("Ký tự a hoặc b hoặc c "+Pattern.matches("[abc]","d"));
        System.out.println("Bất cứ ký tự nào khác a và b và c"+Pattern.matches("[^abc]","d"));
        System.out.println("Tư a - z"+Pattern.matches("[a-z]","9"));
        System.out.println("Tư 0 - 9"+Pattern.matches("[0-9]","9"));

        Scanner scanner = new Scanner(System.in);


        do{
            String regexEmail = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
            System.out.println("Nhap vao email ");
            String email = scanner.nextLine();
            if(Pattern.matches(regexEmail,email)){
                System.out.println("Đúng định dạng");
                break;
            } else {
                System.err.println("Sai định dạng");
            }
        } while (true);
        // Xây dựng mãu regex cho phone di động viet Nam
        // 0339513657

        do{
            String phoneRegex = "[0][3|8|7|9][\\d]{8}";
            System.out.println("Nhap vao so dt ");
            String phone = scanner.nextLine();
            if(Pattern.matches(phoneRegex,phone)){
                System.out.println("Đúng định dạng");
                break;
            } else {
                System.err.println("Sai định dạng");
            }
        } while (true);
    }
}
