package Day2;

import java.util.Scanner;

public class Desafio_Dia2_3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the first variable: ");
        int var1 = Integer.parseInt(sc.nextLine());
        System.out.println("Type the second variable: ");
        int var2 = Integer.parseInt(sc.nextLine());


        System.out.println("Before:");
        System.out.println(var1);
        System.out.println(var2);

        int temp = var1;
        var1 = var2;
        var2 = temp;

        System.out.println("After:");
        System.out.println(var1);
        System.out.println(var2);


        sc.close();
    }
}
