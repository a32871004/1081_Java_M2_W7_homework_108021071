import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
    Scanner sn=new Scanner(System.in);
    int a=sn.nextInt();
    for(int i=1;i<=a;i++){
        if(a%i==0){
            System.out.println(i);
        }
    }
    }
}
