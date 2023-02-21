package JAVA;
import java.util.*;

class faculty{
    int facNo;
    String facName;
    String subject;
    faculty(){}
    faculty(int f, String n, String s){
        facName = n;
        facNo = f;
        subject = s;
    }
}

public class test {
    public static void main(String args[]){
        //Display Name Section Branch
        System.out.println("Name: Kushagra\nSection: CSE AIML\nBranch: CSE AIML\n\n\n");

        //Add two numbers
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum of a and b is " + c + "\n\n\n");

        //greatest of 3 numbers
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if(a>b && a>c){
            System.out.println("a is max " + a + "\n\n\n");
        }
        if(c>b && a<c){
            System.out.println("c is max " + c + "\n\n\n");
        }        
        if(b>a && b>c){
            System.out.println("b is max " + b + "\n\n\n");
        }

        //class faculty with overloaded constructor
        faculty f1 = new faculty();
        faculty f2 = new faculty(56, "Demo", "demo");

    }
}
