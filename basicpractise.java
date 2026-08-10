// Question 1 : In a program, input 3 numbers: A, B andC. Youhave to output the average of
// these 3 numbers.
// (Hint : Average of N numbers is sum of those numbers divided by N)

// import java.util.*;
// public class basicpractise{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt(); 
//     int b = sc.nextInt();
//     int c = sc.nextInt();
//     int Average = (a + b + c)/3;

//     System.out.println("Average is :" + Average);

//   };
// };  

// Question 2: In a program, input the side of a square. You have to output the area of the
// square.
// (Hint : area of a square is (side x side)

// import java.util.*;
// public class basicpractise{
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int side = sc.nextInt(); 
//     int area = side * side;

//     System.out.println("Area of the square is: " + area);
//   }
// }

// Question 3: Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

// import java.util.*;
// public class basicpractise{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//          System.out.print("Enter pencil cost: ");
//         float pencilCost = sc.nextFloat();

//          System.out.print("Enter pen cost: ");
//         float pencost = sc.nextFloat();

//           System.out.print("Enter eraser cost: ");
//         float erasercost = sc.nextFloat();

//         float totalcost = pencilCost + pencost + erasercost;

//         float gst = totalcost *18/100;

//         float finalcost = totalcost + gst;

//         System.out.println("Total cost of the items is: " + totalcost);
//         System.out.println("GST is: " + gst);
//         System.out.println("Final cost of the items is: " + finalcost);
//     }
// }

// CONDITIONAL STATEMENTS QUESTIONS
// Question1: WriteaJavaprogramtogetanumberfromtheuserandprintwhether it is
// positive or negative.

// import java.util.*;
// public class basicparctise{
//     public static void main(String args[]){
//         Scanner sc = new Scanner (System.in);
//         int x = sc.nextInt();

//         if (x > 0){
//             System.out.println("The number is positive");
//         } else {
//             System.out.println("The number is negative");
//         }
//     }
// }

// Question2: FinishthefollowingcodesothatitprintsYouhaveafeverifyourtemperature
// is above 100 and otherwise prints You don't have a fever.
// public class Solution {
// public static void main(String[] args) {
// double temp = 99.5;

// if(temp >100){
//     System.out.println("You have a fever");
// }
// else{
//     System.out.println("You don't have a fever");
// }
// }
// }

// Question3: Writea Javaprogramtoinputweeknumber(1-7)andprintdayofweekname
// using switch case.
// import java.util.*;

// public class basicpractise {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("entr a week number(1-7):");
//         int week = sc.nextInt();
//         switch (week) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid input ! Please enter week number between 1-7.");

//         }

//     }
// }



// Question5: WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthat
// year is a leap year or not.

