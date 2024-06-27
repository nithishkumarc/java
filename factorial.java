
import java.util.*;

public class factorial {
    public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.print("enter a factrial number :");
int a=s.nextInt();
int b=1;
int c;
for (int i = 1; i <=a; i++) {
c=b+a*i/2;
System.out.println(c);
        }
    }
}
