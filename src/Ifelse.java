import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age =30;
        if(age>=18 && age<=60)
        {
            if (age > 20 && age < 30) {
                System.out.println(" you are in 20's");
            } else if (age >= 30 && age <= 40) {
                System.out.println("You are in 30's");
            } else {
                System.out.println("you are still teen");
            }
        } else if (age>60) {
            System.out.println("You are an old man");
        } else if (age>=16 && age<18) {
            System.out.println("You are teen ager");
        }else{
           System.out.println("You are still kid");
      }
  }
}
