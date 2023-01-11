package Car;

public class CarMain {

    public static void main (String... args) {
        System.out.println("=================================IF/ELSE=====================================");
        Car aliceCar = new Car("");
        paintCar(aliceCar, "black");
        System.out.println("==================================CYCLES FOR=================================");
        String[] ownersOfCar = new String[3];
        ownersOfCar[0] = "Alice";
        ownersOfCar[1] = "Bob";
        ownersOfCar[2] = "Karl";
        drivers(ownersOfCar);
        System.out.println("=====================================SWITCH==================================");
        SwitchStatement("b");
    }

    //    System.out.println("=================================IF/ELSE=================================");
    public static void paintCar (Car aliceCar, String newCarColor){
        if (aliceCar.getCarColor().equals(newCarColor)) {
            System.out.println("We don`t need paint! Color the same!");
        }
        else {
            aliceCar.paintCar(newCarColor);
            System.out.println("Painting car in " + newCarColor);
        }
    }

    //  System.out.println("==================================CYCLES FOR=================================");
    public static void drivers (String[] someStrings) {
        for (int i = 0; i < someStrings.length; i++) {
            System.out.println(someStrings[i]);
        }
    }
    //  System.out.println("==================================SWITCH=================================");
    public static void SwitchStatement (String switchString) {
        switch (switchString) {
            case "a":
                System.out.println("this is a");
            case "b":
                System.out.println("this is b");
            case "c":
                System.out.println("this is c");
                break;
            default:
                System.out.println("this is default");
        }
    }

}





// ===================================================================================================LESSON 1==========
// public class CarMainClass {
//    public static void main (String... args) {
//        Car aliceCar = new Car();
//        System.out.println("AliceCar from factory are " + aliceCar.getCarColor());
//        aliceCar.paintCar("black");
//        System.out.println("After painting AliceCar turned " + aliceCar.getCarColor());
//    }
//}
