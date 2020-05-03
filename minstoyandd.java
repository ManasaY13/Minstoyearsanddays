import java.util.*;
import java.util.Scanner;
class MinstoDY{
    public static void main(String []args){
        Scanner scan=new Scanner(System.in);
        int x=0,y=0,z=0;
        System.out.println("Input the number of minutes: ");
        x=scan.nextInt();
        y=x/1440;
        z=x/(365*1440);
        System.out.println(x+" minutes is approximately "+ z +" years and "+ y + " days ");
    }
}
