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

    void disp(){
        System.out.println("FacName: " + facName + " FacNumber: " + facNo + " Subject: " + subject);
    }
}

public class test {
    public static void main(String args[]){
        //Display Name Section Branch
        System.out.println("\t'Display Name Section Branch'");
        System.out.println("Name: Kushagra\nSection: CSE AIML\nBranch: CSE AIML\n\n\n");

        //Add two numbers
        System.out.println("\t'Add two numbers'");
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println("Sum of a and b is " + c + "\n\n\n");

        //greatest of 3 numbers
        System.out.println("\t'greatest of 3 numbers'");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        a = s.nextInt();
        System.out.print("Enter an integer: ");
        b = s.nextInt();
        System.out.print("Enter an integer: ");
        c = s.nextInt();
        if(a>b && a>c){
            System.out.println("a is max: " + a + "\n\n\n");
        }
        if(c>b && a<c){
            System.out.println("c is max: " + c + "\n\n\n");
        }        
        if(b>a && b>c){
            System.out.println("b is max: " + b + "\n\n\n");
        }

        //class faculty with overloaded constructor
        System.out.println("\t'class faculty with overloaded constructor'");
        faculty f1 = new faculty();
        System.out.println("f1 Object: ");
        f1.disp();
        faculty f2 = new faculty(56, "Demo", "demo");
        System.out.println("f2 Object: ");
        f2.disp();

    }
}

