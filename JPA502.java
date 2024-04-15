package lab05;
import java.util.Scanner;

public class JPA502 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        while (true){
            System.out.print("Input n ( 0 <= n <= 16 ):" );
            int x = a.nextInt();
            if(x != 999){
                int y = 1;
                for (int i = 1; i <= x; i++) {
                    y *= i;
                }
                System.out.printf("%d的階乘(遞迴) = %d\n", x , y);
                System.out.printf("%d的階乘(尾遞迴) = %d\n" , x , facTail(x , 1));
            }
            else{
                a.close();
                break;
            }
        }
    }
    public static int facTail(int a , int b) {
        if(a == 0 || a == 1){
            return b;
        }
        else{
            return facTail((a - 1) , (a * b));
        }
    }
}
