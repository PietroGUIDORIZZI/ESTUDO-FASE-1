import java.util.Scanner;



public class Desafio_Dia2_1 {
    public static void main(String[] args) {
        String name;
        int age;
        double height;
        double weight;
        String student;
        boolean isStudent;
        double imc;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type your name: ");
        name = sc.nextLine();
        
        System.out.println("Type your age:");
        age =  Integer.parseInt(sc.nextLine());

        
        System.out.println("Type your height(M): ");
        height = Double.parseDouble(sc.nextLine());
        
        System.out.println("Type your weight(KG): ");
        weight = Double.parseDouble(sc.nextLine());
        
        System.out.println("Type 'yes' or 'no' for student: ");
        student = sc.nextLine().trim().toLowerCase();

        switch (student){
            case "yes", "y" -> isStudent = true;
            default -> isStudent = false;
        }

        imc = (weight / (height * height));

        System.out.printf("Hello, %s.\n" +
                "You're are %d years old.\n" +
                "Your height in meters is: %.2fm\n" +
                "and your weight is: %.2f\n" +
                "Your IMC is: %.2f\n" +
                "the affirmation of student is %b", name, age, height, weight, imc,isStudent );

        sc.close();
        
    }
    
}
