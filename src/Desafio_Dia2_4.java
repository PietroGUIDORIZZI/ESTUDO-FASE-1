import java.util.Scanner;

public class Desafio_Dia2_4 {
    public static void main(String[] args){
        double r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the radius of the circle to find it's area: ");
        r = Double.parseDouble(sc.nextLine());
        double circleArea = Math.PI * r * r;
        System.out.printf("\nthe area of the circle is: %.3f", circleArea);

        sc.close();
    }
}
