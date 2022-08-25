package bai2.javacore.techmaster;

import java.util.Scanner;

public class Bai_tap_2 {
    public static void main(String[] args) {
        while (true){
            Scanner sc= new Scanner(System.in);
            System.out.println("******___________________******");
            System.out.print("Hay nhap bai toan :");
            int n = sc.nextInt();
            while (n>10){
                System.out.print("Khong duoc lon hon 10 hay nhap lai :");
                n = sc.nextInt();
            }
            switch (n){
                case 1:
                    Bai_1();
                    break;
                case 2:
                    Bai_2();
                    break;
                case 3:
                    Bai_3();
                    break;
                case 4:
                    Bai_4();
                    break;
                case 5:
                    Bai_5();
                    break;
                case 6:
                    Bai_6();
                    break;
                case 7:
                    Bai_7();
                    break;
                case 8:
                    Bai_8();
                    break;
                case 9:
                    Bai_9();
                    break;
                case 10:
                    Bai_10();
                    break;
            }
        }
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
        int dem=1;
        Scanner sc= new Scanner(System.in);
        System.out.print("Hay nhap so dong :");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1 ;j<=i;j++){
                System.out.print(dem+ " ");
                dem++;
            }
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
    public static void Bai_4(){
        int dem=1;
        Scanner sc= new Scanner(System.in);
        System.out.print("Hay nhap so dong :");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1 ;j<=i;j++){
                System.out.print(dem+ " ");
                dem++;
            }
            System.out.println();
        }
    }

    public static void Bai_5(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Hay nhap chieu cao cua nua hinh thoi :");
        int n = sc.nextInt();
        int count1 = n-1;
        for(int i=1;i<=n;i++){
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
        // đuôi kim cương
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
        }


    }

    public static long pascal(int k,int n){
        if(k==0||k==n){
            return 1;
        }
        else {
            return pascal(k,n-1)+pascal(k-1,n-1);
        }
    }
    public static void Bai_6(){
        int h;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều cao của tam giác: ");
        h = scanner.nextInt();
        int count = h;

        for(int i = 0;i<= h; i++){
            //khoang trang
            for(int k=count;k>=1;k--){
                System.out.print(" ");
            }
            //tam giac pascal
            for(int j = 0; j<= i; j++){
                System.out.print(pascal(j,i)+" ");
            }
            count--;
            System.out.println();
        }

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
    public static void Bai_10(){

        String[] a ={"A","B","C","D","E","F","G","H","I"};
        int count = a.length;
        for(int i=0;i<=a.length-1;i++){
            //khoang trang
            for(int j=1;j<=count;j++){
                System.out.print(" ");
            }
            //tu A -> G
            for(int h=0;h<=a.length-count;h++){
                System.out.print(a[h]);
            }
            //con lai
            for(int k=i-1;k>-1;k--){
                System.out.print(a[k]);
            }
            count--;
            System.out.println();
        }

        int count2 = a.length;
        for (int i=0;i<=a.length-2;i++){
            //khoang trang
            for (int j=-1;j<=a.length-count2;j++){
                System.out.print(" ");
            }
            //A->F
            for(int h=0;h<=count2-2;h++){
                System.out.print(a[h]);
            }
            //con lai
            for(int k=count2-3;k>=0;k--){
                System.out.print(a[k]);
            }
            count2--;
            System.out.println();
        }
    }
}

