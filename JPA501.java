package lab05;
import java.util.Scanner;
public class JPA501 {

    public static int fac(int c){
        int d=1;
        for(int i=1;i<=c;i++){
            d*=i;
        }
        if(c==0){
            return 1;
        }else{
            return d;
        }
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        while(true){
            System.out.print("Input n (0<=n<16):");
            int x=a.nextInt();
            int y=fac(x);
            if(x==999){
                break;
            }else{
                System.out.printf("%d的乘階 = %d\n",x,y);
            }
        }
        
        
    a.close();
    }
}
