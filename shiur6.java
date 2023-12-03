//1.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numGrades = scan.nextInt();
        double[] grades = new double[numGrades];

        for (int i = 0; i < numGrades; i++) {
            grades[i] = scan.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < numGrades; i++) {
            sum += grades[i];
        }

        double avg = sum / numGrades;

        System.out.println("The average grade is " + avg);
    }
}
//2.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int counter = 0;
        String word;

        while (!word.equals("enter")) {
            System.out.print("Enter word: ");
            word = in.nextLine();
            counter++;
        }

        System.out.println("Number of words (including 'enter'): " + counter);
    }
}
//3.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int attempts = 0;

        do {
            System.out.println("Enter code:");
            int code = scan.nextInt();

            if (code == num) {
                System.out.println("Money much How?");
                break;
            } else {
                attempts++;
                System.out.println("You have " + (2 - attempts) + " attempts remaining.");
            }
        } while (attempts < 2);

        if (attempts == 2) {
            System.out.println("Error");
        }
    }
}
//4. 
 public static void checkPalindrome(String str) {

        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

    }

}
//5.   
    public static void func5(int num)
    {
      for (int i = 1; i <= num; i++) 
     {
     if (i != 0 && num % i == 0)
     {
         System.out.print(i);
                
                // בדיקה אם זו הפריט האחרון ברשימה
        if (i != num) {
               System.out.print(",");
        }
      }
     }
    System.out.println();
 }
//6.
    public static void func6() {
  	  System.out.println("here is Multiplication table:");
     for (int i = 1; i <= 10; i++) {
         for (int j = 1; j <= 10; j++) {
               System.out.print(i * j + " ");
        }
         System.out.println();
     }
  }
//7.
    public static void func7() {
        int grade_max = Integer.MIN_VALUE;
        int grade_min = Integer.MAX_VALUE;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("enter grade:");
            int grade = scan.nextInt();

            if (grade > grade_max) {
                grade_max = grade;
            }

            if (grade < grade_min) {
                grade_min = grade;
            }
        }

        System.out.println("Maximum grade: " + grade_max);
        System.out.println("Minimum grade: " + grade_min);
    }
 }
//8.
public boolean func8(int num)
{


	int a = 0, b = 1;

	while (a < num) {
	    int temp = a;
	    a = b;
	    b = temp + b;
	}

	if (a == num) {
	    System.out.println("The number is part of the Fibonacci series.");
	} else {
	    System.out.println("The number is not part of the Fibonacci series.");
	}
	
}

//9.
    public static int func9(int num1,int num2)
    {
        int mul = 0;
        for (int i = 0; i < num1;i++)
        {
            mul += num2;
        }
        return mul;
            
    }
//10.
public void func10(int height) {

    for (int i = 1; i <= height; i++) {
        for (int j = height - i; j >= 1; j--) {
            System.out.print(" ");
        }

        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print("*");
        }

        System.out.println();
    }
}
