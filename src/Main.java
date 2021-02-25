import points.*;

import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        askPoint();
        askRepeatProgram();
    }

    public static void askPoint(){
        int option;

        while (true) {
            System.out.print("\nQue punto desea utilizar: ");
            option = input.nextInt();

            switch (option) {
                case 1:
                    Point1.main(null);
                    break;
                case 2:
                    Point2.main(null);
                    break;
                case 3:
                    Point3.main(null);
                    break;
                case 4:
                    Point4.main(null);
                    break;
                case 5:
                    Point5.main(null);
                    break;
                case 6:
                    Point6.main(null);
                    break;
                case 7:
                    Point7.main(null);
                    break;
                case 8:
                    Point8.main(null);
                    break;
                case 9:
                    Point9.main(null);
                    break;
                case 10:
                    Point10.main(null);
                    break;
                case 11:
                    Point11.main(null);
                    break;
                default:
                    System.out.println("Opcion fuera de rango");
                    continue;
            }
            break;
        }

    }

    public static void askRepeatProgram() {
        while(true){
            System.out.println("\nDesea repetir el programa?");
            System.out.println("1 -> Si\n2 -> No");
            int choice = input.nextInt();

            switch(choice) {
                case 1:
                    main(null);
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Opcion fuera de rango");
                    continue;
            }
        }
    }
}
