import java.util.Scanner;
public class Fueltrip {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    Double distance,mileage,fuelprice,tollcharge;
    System.out.println("Enter distance:");
    distance = sc.nextDouble();
    System.out.println("Enter mileage:");
    mileage = sc.nextDouble();
    System.out.println("Enter fuelprice:");
    fuelprice = sc.nextDouble();
    System.out.println("Enter tollcharge:");
    tollcharge = sc.nextDouble();
    Double  fuelNeeded = distance/mileage;
    Double fuelcost = fuelNeeded*fuelprice;
    Double totalcost = fuelcost+ tollcharge;
    System.out.println("Total Trip cost="+totalcost); 
    }
}
