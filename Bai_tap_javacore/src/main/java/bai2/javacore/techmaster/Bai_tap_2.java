package bai2.javacore.techmaster;

import java.util.Scanner;

public class Bai_tap_2 {
    public static void main(String[] args) {
        Bai_2();
    }

    public static void Bai_1(){
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Bai_2(){
        int count=0;
        for(int i=1;i<=4;i++){
            for(int j=count ;j<=i;j++){
                System.out.print(count);
                count++;
            }
            count++;
            System.out.println();
        }
    }

    public static void  Bai_3(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void Bai_5(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Hay nhap so :");
        int n = sc.nextInt();
        int count1 = n-1;
        for(int i=1;i<=n;i++){

        }
        /*for(int i=1;i<=n;i++){
            //khoang trang
            for(int j=1;j<=count1;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
            count1--;
        }
        int count2=n-1;
        for(int i=1;i<=n-1;i++){
            //khoang trang
            for(int j=1;j<=n-count2;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*count2-1;k++){
                System.out.print("*");
            }
            System.out.println();
            count2--;
        }*/


    }
    public static void Bai_7(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Hay nhap so :");
        int n = sc.nextInt();
        int count =n;
        for(int i=1;i<=n;i++){
            //khoang trang
            for (int h=1;h<=n-count;h++){
                System.out.print(" ");
            }
            for(int j=count;j>=1;j--){
                System.out.print("*");
            }
            count--;
            System.out.println();
        }
    }

    public  static void Bai_8(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Hay nhap so :");
        int n = sc.nextInt();
        int count=n;
        for(int i=1;i<=n;i++){
            //khoang trang
            for(int j=1;j<=count-1;j++){
                System.out.print(" ");
            }
            for(int h=count-1;h<n;h++){
                System.out.print("@");
            }
            System.out.println();
            count--;
        }
    }

    public static void Bai_9(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Hay nhap so :");
        int n = sc.nextInt();
        int count=n-1;
        for(int i=1;i<=n;i++){
            //tao khoang trang
            for(int j=1;j<=count;j++){
                System.out.print(" ");
            }
            //n->1
            for(int h=n-count;h>=1;h--){
                System.out.print(h);
            }
            //2->
            for(int k=2;k<=n-count;k++){
                System.out.print(k);
            }
            System.out.println();
            count--;
        }
        int count2=n-1;
        for(int i=1;i<=n-1;i++){
            //khoang trang
            for(int j=1;j<=n-count2;j++){
                System.out.print(" ");
            }
            for(int h=count2;h>0;h--){
                System.out.print(h);
            }
            for(int k=2;k<=count2;k++){
                System.out.print(k);
            }
            System.out.println();
            count2--;
        }
    }
    public static void Bai_9b(){

        String[] a ={"A","B","C","D","E","F","G"};
        int count = a.length-1;
        for(int i=1;i<=a.length;i++){
            //khoang trang
            for(int j=1;j<=count;j++){
                System.out.print(" ");
            }
            //tu A -> G
            for(int h=0;h<=65;h++){

            }
        }
    }
}

