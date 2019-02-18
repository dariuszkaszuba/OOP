import model.Auto;

public class Main {
    public static void main(String[] args) {
//        Auto a1 = new Auto();
//
//        System.out.println(a1);
//
////        System.out.println("Brand: " + a1.brand);
////        System.out.println("Model: " + a1.model);
////        System.out.println("Production: " + a1.year);
////        System.out.println("Color: " + a1.color);
////        System.out.println("Fuel: " + a1.fuel_type);
////        System.out.println("Price: " + a1.price);
////        System.out.println("Segment: " + (int) a1.segment);
//
//        a1.brand = "BMW";
//        a1.model = "X5";
//        a1.year = 2019;
//        a1.color = "red";
//        a1.fuel_type = "Diesel";
//        a1.price = 1_234.44;
//        a1.segment = 'D';
//
//        System.out.println(a1);
//
//        Auto a2= new Auto();
//        System.out.println(a2);
//
//        a2.setPrice(100_000);
//        System.out.println(a2);
//        System.out.println(a2.getPrice());
//        System.out.println(a2.getPriceWithTax(23));

        Auto a3= new Auto("VW","Passerati",1920,"Diesel","REd",
                44443,'W');
        System.out.println(a3);
    }
}
