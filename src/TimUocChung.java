import java.util.Scanner;

public class TimUocChung {
    public static void main(String[] args) {
        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.println("Nhập số a : ");
        a=Math.abs(input.nextInt());
        System.out.println("nhập Số b : ");
        b=Math.abs(input.nextInt());
        if (a==0||b==0){
            System.out.println("No great Common factor");
        }
        while (a!=b){
            if (a>b){
                a=a-b;
            }else {
                b=b-a;
            }
        }
        System.out.println("Greatest common factor:  "+ a);
    }
}
