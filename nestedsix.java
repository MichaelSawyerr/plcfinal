import java.util.*;
/**
import java.util.Scanner;


public class nestedsix {

    public static void main(String[] args) {

    int max=0; 
    int mid=0;
    int min=0; 
    Scanner scan=new Scanner(System.in);
    System.out.println("3 Numbers: ");
    int x=scan.nextInt();
    int y=scan.nextInt();
    int z=scan.nextInt();
      
        if(x>y) {
        if(x>z) {
        if(y>z) {
            max=x;
            min=y;
            mid=z;
        
        }
        else {
        max=x;
        min=z;
        mid=y;
        }
        }
        else {
        max=z;
        min=y;
        mid=x;
          
          
        }
          
        }
        
        else {
        if(x<z) {
        max=y;
        min=x;
        mid=z;  
        }
        else {
        if(y<z) {
        max=z;
        min=x;
        mid=y;
        
        }
        else {
        max=y;
        min=z;
        mid=x;
        }
        }
          
        }
          
        System.out.println("Max: "+ max);
        System.out.println("Mid: "+ mid);
        System.out.println("Min: "+ min);
        
        }
          
        }