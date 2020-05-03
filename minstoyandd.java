import java.util.*;
import java.util.Scanner;
class MinstoDY{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int x=0,y1=0,y2=0,z=0,w=0;
        System.out.println("Input the number of minutes: ");
        x=scan.nextInt();
        z=x/(365*1440);
        y1=x/1440;
        y2=365*z;
        w=y1-y2;
        
        System.out.println(x+" minutes is approximately "+ z +" years and "+ w + " days ");



    }
}
