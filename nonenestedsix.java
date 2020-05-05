import java.util.*;

public class nonenestedsix {

    public static void main(String[] args) {
  

    int max=0;
    int min=0;
    int mid=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("3 Numbers: ");
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();
            
            if(x>y && x>z && y<z) {
            max=x;
            min=y;
            mid=z;
        }
        else if(z>x && z>y && x>y) {
            max=z;
            min=y;
            mid=x;
  
        }
            else if(y>z && y>x && x>z) {
            max=y;
            min=z;  
            mid=x;
        }
            else if(y>z && y>x && z>x) {
            max=y;
            min=x;
            mid=z;
        }
            else if(x>y && x>z && y>z) {
            max=x;
            min=z;
            mid=y;
        }
               else {
            max=z;
            min=x;
            mid=y;
        }
        System.out.println("Max "+ max);
         System.out.println("Mid: "+ mid);
        System.out.println("Min: "+ min);
       
        }
  
}