import controller.CarController;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("AUTO FACTORY");
        boolean flag = true;
        CarController cc = new CarController();
        while (flag) {
            System.out.println("1. Zamwienie auta \n2. Lista zamowien \n0. Wyjscie");
            int decision = sc.nextInt();
            sc.nextLine();


            switch (decision) {
                case 1:
                    System.out.println("Podaj marke");
                    String brand = sc.nextLine();
                    System.out.println("Podaj model");
                    String model = sc.nextLine();
                    System.out.println("Podaj cene");
                    double price = sc.nextDouble();
                    System.out.println("Podaj rok");
                    int year = sc.nextInt();
                    sc.nextLine();
                    cc.purchaseCar(brand, model, price, year);
                    break;
                case 2:
                    System.out.println(CarController.getIndex());
                    cc.getCars();
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    System.out.println("Bledny wybór");
            }
        }
    }
}
