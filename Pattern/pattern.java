package Pattern;

import java.util.Scanner;

public class pattern {
    public static void main(String[] arg) {
// Ques1
//    *****
//    *****
//    *****

//    Scanner sc = new Scanner(System.in);
//    int row = sc.nextInt();
//    int col = sc.nextInt();
//
//    for(int i=1;i<=row;i++){
//        for (int j=1;j<=col;j++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }


// Ques 2
//    1234
//    1234
//    1234
//        1234
//Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//
//for(int i=1; i<=n; i++){
//    for (int j=1; j<=n; j++){
//        System.out.print(j+"");
//    }
//    System.out.println();
//    }


//    ques 3
//      ABCD
//      ABCD
//      ABCD
//      ABCD
//
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//
//for(int i=1; i<=n; i++){
//    for (int j=1; j<=n; j++){
//        System.out.print( (char)(j+64)+"");
//    }
//    System.out.println();
//    }


//    ques 4
//        n= 4
//                1111
//                2222
//                3333
//                4444
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    for(int i=1;i<=n;i++){
//        for(int j=1;j<=n;j++){
//            System.out.print(i);
//        }
//        System.out.println();
//    }


//    ques 5
//        aaaa
//        BBBB
//        cccc
//        DDDD

//    Scanner sc = new Scanner(System.in);
//
//    int n = sc.nextInt();
//
//    for (int i = 1; i <= n; i++) {
//        for (int j = 1; j <= n; j++) {
//
//            if (i % 2 == 0) {
//                System.out.print((char)(i + 64));
//            } else {
//                System.out.print((char)(i + 96));
//            }
//        }
//        System.out.println();
//    }


//    *
//    **
//    ***
//    ****
//


//    Scanner sc = new Scanner(System.in);
//
//    int n = sc.nextInt();
//
//    for (int i = 1; i <= n; i++) {
//        for (int j = 1; j <= i; j++) {
//            System.out.print("*");
//            System.out.print((char)(64+j)+"");
//            System.out.print(i+"");

//        }
//        System.out.println();
//    }


//*****
//****
//***
//**
//*


//
//    Scanner sc = new Scanner(System.in);
//
//    int n = sc.nextInt();
//
//    for (int i = 1; i <= n; i++) {
//        for (int j = 1; j <= n+1-i; j++) {
//            System.out.print("*");
//
//
//        }
//        System.out.println();
//    }


// hollow rectangle
//********
//*      *
//*      *
//*      *
//********
//
//    Scanner sc = new Scanner(System.in);
//
//    int n = sc.nextInt();
//    int m = sc.nextInt();
//
//    for (int i = 1; i <= m; i++) {
//        for (int j = 1; j <= n; j++) {
//         if(i==1||i==m||j==1||j==n)
//            System.out.print("*");
//         else System.out.print(" ");
//
//        }
//        System.out.println();
//    }


//    plus
//     *
//    ***
//     *


//    Scanner sc = new Scanner(System.in);
//
//
//    System.out.println("  enter  the odd value of n  ");
//    int n = sc.nextInt();
//      int mid = n/2+1;
//
//    for (int i = 1; i <= n; i++) {
//        for (int j = 1; j <= n; j++) {
//            if(i==mid|| j==mid){
//                System.out.print("*");}
//            else System.out.print(" ");
//
//        }
//        System.out.println();
//    }
//
//


//* *
// *
//* *

//    Scanner sc = new Scanner(System.in);
//
//
//
//    int n = sc.nextInt();
//
//
//    for (int i = 1; i <= n; i++) {
//        for (int j = 1; j <= n; j++) {
//            if(i==j||i+j==n+1){
//                System.out.print("*");}
//            else System.out.print(" ");
//
//        }
//        System.out.println();
//    }
//
//
//
//

//
//1
//23
//456
//67810
//
//
//        Scanner sc = new Scanner(System.in);
//
//
//        int n = sc.nextInt();
//        int a = 1;
//
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//
//                System.out.print(a++);
//            }
//
//
//
//        System.out.println();
//    }
//


//        1
//        01
//        101
//        0101
//

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//               if(((i+j)%2)==0)
//                System.out.print(1+"");
//               else System.out.print(0+"");
//            }
//
//
//
//            System.out.println();
//        }


//    *
//   **
//  ***
// ****
//*****


//
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//             if((i+j)>n){
//                System.out.print("*");}
//             else System.out.print(" ");
//            }
//
//            System.out.println();
//        }


//   1
//  12
// 123
//1234
//
//

//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//
//            // spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            // numbers
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//
//            System.out.println();
//        }
//


//        *****
//       *****
//      *****
//     *****
//    *****


//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//
//            // spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            // numbers
//            for (int j = 1; j <= n; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//

//
//*****
// ****
//  ***
//   **
//    *
//
//
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        for (int i = 1; i <=n; i++) {
//
//            // spaces
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" ");
//            }
//
//            // numbers
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//


//  pyramid

//        *
//       ***
//      *****
//


//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//
//            // spaces
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//
//            // numbers
//            for (int j = 1; j <= 2*i-1; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }




//   *
//  ***
// *****
//*******
// *****
//  ***
//   *
//
//
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//// Upper half
//        for (int i = 1; i <= n; i++) {
//
//            // spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            // stars
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//// Lower half
//        for (int i = n - 1; i >= 1; i--) {
//
//            // spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            // stars
//            for (int j = 1; j <= 2 * i - 1; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//

// bridge
//*       *
//**     **
//***   ***
//*********
//***   ***
//**     **
//*       *

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

// Upper half
//        for (int i = 1; i <= n; i++) {
//
//            // left stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            // middle spaces
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//
//            // right stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }

// Lower half
//        for (int i = n - 1; i >= 1; i--) {
//
//            // left stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            // middle spaces
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print(" ");
//            }
//
//            // right stars
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }











    }
}


