import java.util.Scanner;

public class Desafio_Dia2_2 {

    public static void main(String[] args){
        double f;
        double c;
        int op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Choose the conversion: '1' -> (Cº to Fº) | '2' -> (Fº to Cº)");
            op = Integer.parseInt(sc.nextLine());


            if (op == 1) {
                System.out.println("Type the temperature in Celsius: ");
                c = Double.parseDouble(sc.nextLine());
                f = (c * 9 / 5) + 32;
                System.out.printf("Temperature is %.2f ºF", f);
            }
            if (op == 2) {
                System.out.println("Type the temperature in Fahrenheit: ");
                f = Double.parseDouble(sc.nextLine());
                c = (f - 32) * (5 / 9.0);
                System.out.printf("Temperature is %.2f ºC", c);
            }
        }while(op != 1 && op != 2);
    }


}
