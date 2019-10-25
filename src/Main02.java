import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int a=sn.nextInt();
        char b=sn.next().charAt(0);
        for (int i=1;i<=a;i++){
            for (int j=1;j<=a;j++){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
