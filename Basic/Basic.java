package Basic;

import java.util.Scanner;

//public class Basic {
//    public static void main(String[] args) {
//        System.out.println("RohanTyagi");

//        System.out.println(70+52);
// area of circle
//        double r = 3;
//        double a= 3.14*r*r;
//        System.out.println(a);

// area of sphere
//        double r =10;
//        double v =(3/4)*3.14*r*r*r;
//        System.out.println(v);

//        input  from user
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the value of r :");
//        double r = sc.nextDouble();
//
//        double a =  3.14*r*r;
//        System.out.println(a);



//        char data type
//        char c = '$';
//        System.out.println(c);

//        type casting
//         char a ='a';
//          int x = a;
//        System.out.println(x*x);
//        System.out.println(x+x);
//        System.out.println(x/x);
//         int to char
//        int a = 97;
//        char x = (char) a;
//        System.out.println(x);





//    }
//
//
//}
//If else statement

//public class Basic {
//    public static void main(String[] args) {

//        even odd number





//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number:");
//        int n = sc.nextInt();
//        if(n%2==0){
//            System.out.println("even");
//        }
//        else
//        {
//            System.out.println("odd");
//        }




// num is divisible by 5
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number:");
//        int n = sc.nextInt();
//
//        if(n%5==0){
//            System.out.println("num is divisible by 5");
//        }
//



// take positive integer input  and print the absolute value of that integer

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number:");
//        int n = sc.nextInt();
//        if(n>=0){
//            System.out.println(n);}
//        else System.out.println(-n);


//   take real number input and chek if is an integer or not


//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter number:");
//       double n = sc.nextDouble();
//        int x = (int)n;
//        if (n-x==0) System.out.println("integer");
//        else System.out.println(" not integer");




//    given a point (x,y)  write a program to find uot if it is lies in the 1st  quadrant
//        ,2nd quadrent , 3 quadrent ,4 duadrent ,on the x-axis , y-axia,or at a origin.



//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter  value of  X :  ");
//        int x = sc.nextInt();
//        System.out.println("enter  value of  Y :  ");
//        int y = sc.nextInt();
//
//        if(x==0 && y ==0) System.out.println(" at the origin");
//        else if (x>0 && y>0) System.out.println("point is on 1st qua");
//        else if (x<0 && y>0) System.out.println("point is on 2st qua");
//        else if (x<0 && y<0) System.out.println("point is on 3st qua");
//        else if (x>0 && y<0) System.out.println("point is on 4st qua");
//        else if (y==0) System.out.println("X-axis");
//        else System.out.println("y-axis");


// Nested if else



//        greater value
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter  value of  a :  ");
//        int a = sc.nextInt();
//        System.out.println("enter  value of  b :  ");
//        int b = sc.nextInt();
//        System.out.println("enter  value of  c :  ");
//        int c = sc.nextInt();
//
//        if(a>=b) {
//            if (a >= c) System.out.println(a);
//            else System.out.println(c);
//        }
//        else {
//                if(b>=c) System.out.println(b);
//                else System.out.println(c);
//            }
//




//        ternary operator

//        int n = 3;
//        System.out.print((n%2==0)? "even":"odd");


//loops
//       int n=100;
//        for(int i=1; i<=n; i++){
//            System.out.println("rohan tyagi");
//
//        }


//
//        int n;
//        for(int i = 2; i<=200 ; i=i+2){
//            System.out.println(i);
//        }



//print table of 17
//        int n;
//        for (int i = 17 ; i<=170 ;i=i+17){
//            System.out.println(i);
//        }

//        print num n to 1
//
//        int n= 200;
//        for (int i=n;i>=1;i--){
//            System.out.println(i);
//        }

// print AP

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter  value of  a :  ");
//        int a = sc.nextInt();
//        System.out.println("enter  value of  d:  ");
//        int d = sc.nextInt();
//
//for (int i=1;i<=100;i++){
//    System.out.println(a+"");
//    a+=d;
//}


//        while loop
//        int i =1;
//        while (i<=100){
//            System.out.println("Rohan tyagi");
//            i++;
//        }

// do while loop
//        int i =10;
//        do {
//            System.out.println("Rohan Tyagi");
//            i++;
//        }
//        while (i<=13) ;









//        Reverse a number

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter  value of  n :  ");
//        int n= sc.nextInt();
//        int r=0;
//        while (n!=0){
//            r*=10;
//            r+=(n%10);
//            n/=10;
//        }
//        System.out.println(r);



//}
//
// }


//        factorial of number


public class Basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact =1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}








