import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class Main {
  /**
   * @param args
   */
  public static void main(String[] args) {

    // Print Text
    System.out.println("Hello Loes");
    System.out.println("hoe gaat het met je?");


    // Print Numbers
    System.out.println(15);
    System.out.println(3+3);
    System.out.println(5*5);
   
    
    // Java Comments
    // dit is commentaaR
    /* MEERDERE REGELS
       commentaar */
    /* hier komt zo Hallo Loes te staan */
    System.out.println("Hallo Loes");


    // Java Variables //
    String name  = "Loes"; 
    System.out.println(name);

    int myNum = 15;
    System.out.println(myNum);

    String nameString = "Loes"; 
    System.out.println("Hello" + name);

    String firstName = "Loes";
    String lastName = "ten Wolde"; 
    String fullName = firstName + lastName; 
    System.out.println(fullName);

    int x = 5;
    int y = 6;
    System.out.println(x + y); // Print the value of x + y

    // Java Data Types // 
    byte myNum2 = 100; 
    System.out.println(myNum2); 

    short myNumShort = 5000;
    System.out.println(myNumShort);

    int myNumint = 100000;
    System.out.println(myNumint);

    long myNumLong = 15000000000L;
    System.out.println(myNumLong);

    float myNumFloat = 5.75f; 
    System.out.println(myNumFloat);

    double myNumDouble = 19.99d;
    System.out.println(myNumDouble);

    // Java Boolean Data Types //
    boolean isJavaFun = true;
    boolean isFishTasty = false;
    System.out.println(isJavaFun);  //Outputs true
    System.out.println(isFishTasty);  //Outputs false

    // Java Characters //
    char myGrade = 'B';
    System.out.println(myGrade);
    
    char myVar1 = 65, myVar2 = 66, myVar3 = 67;
    System.out.println(myVar1);
    System.out.println(myVar2);
    System.out.println(myVar3);

    String greeting = "Hello World"; 
    System.out.println(greeting);

    // Java Widening Casting // 
    class Mainclass { 
      public static void main(String[]args) {
        int myInt = 9; 
        double myDouble = myInt; // Automatic casting: int to double 

        System.out.println(myInt);         // Outputs 9 
        System.out.println(myDouble);      // Outputs 9.0
      }
    }

     // Java Operators //
     int sum1 = 100 + 50;  // 150 (100 + 50)
     int sum2 = sum1 + 250; //400 (150 + 250)
     int sum3 = sum2 + sum2; //800 (400+ 400)

    System.out.println(sum1);
    System.out.println(sum2);

    int xx = 10;
    System.out.println(xx);

    int xxx = 10;
    x += 5; 
    System.out.println(xxx > x);

    int xxxx = 5;
    int yy = 3;
    System.out.println(xxxx > yy);  //returns true, Because 5 is higer than 3 

    // Java Strings //
    String dataString = "Hello!"; 
    System.out.println(dataString);

    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
    System.out.println("The lenght of the txt string is: " + txt.length());

    String txtx = "Please locate where 'locate' occurs!";
    System.out.println(txtx);
    System.out.println(txtx.indexOf("locate")); // Outputsz 7

    String txtxx = "Hallo Wereld";
    System.out.println(txtxx.toUpperCase());   // Outputs "HaLLO WERELD"
    System.out.println(txtxx.toLowerCase());   // Outputs "hallo wereld"

    // Java string Concatenation //
    String FIrstName = "Wilco";
    String LAstName = " ten Wolde";
    System.out.println(FIrstName + " " + LAstName); 

    String FIRstName = "Loes"; 
    String LAStName = "ten Wolde "; 
    System.out.println(FIRstName.concat(LAStName));

    // Java Numbers and Strings //
    int xy = 10;
    int yx = 20;
    int z = xy+yx; // z will be 30 (an integer/number)
    System.out.println(z);

    String xs = "10";
    String yl = "20";
    String zz = xs = yl;  // zz will be 1020 (a String)
    System.out.println(xs);
    System.out.println(zz);

    String txtt = "We are the so-called \"Vikings\" from the north.";
    System.out.println(txtt);
    String txtl = "It\'s alright.";
    System.out.println(txtl);
    String txtd = "The character \\ is called backslash.";
    System.out.println(txtd);

    // Java Math Max // 
    System.out.println(Math.max(5, 10));





  }

}