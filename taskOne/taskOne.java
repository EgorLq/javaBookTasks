import java.util.Scanner;
import java.util.Date;
public class taskOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        StringBuilder undername = new StringBuilder(Name);
        undername.reverse();
        System.out.println("Привет " + undername);
        int fix = sc.nextInt();
        for (int i = 0; i < fix; i++) {
            double Number = 10 + Math.random() * 40;
            System.out.println(Number);
        }
        int number1=sc.nextInt();
        int number2= sc.nextInt();
        System.out.println("сумма= "+(number1+number2));
        System.out.println("произведение= "+(number1*number2));
        Date date = new Date(800);
        Date date1 = new Date(100000000);
        System.out.println(Name +" " +date.toString() +"\n" +date1.toString());
    }
}



