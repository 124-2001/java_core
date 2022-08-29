package bai4.javacore.techmaster;

import java.util.Scanner;

public class Bai_tap_4 {
    public static void main(String[] args) {
        Bai_3();
    }

    public static void In_Mang(int[] arr){
        System.out.print("Mang in ra la : ");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static void Bai_1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap so luong mang : ");
        int n = sc.nextInt();
        int[] arrInt = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Phan tu thu "+ (i+1) +" la : " );
            arrInt[i]=sc.nextInt();
        }
        In_Mang(arrInt);
        System.out.print("Mang sau khi cong la : ");
        for(int i=0; i<n;i++){
            if(arrInt[i]%2==0){
                arrInt[i]++;
            }
        }
        In_Mang(arrInt);
    }
    public static void Bai_2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap so luong mang : ");
        int n = sc.nextInt();
        int[] arrInt = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Phan tu thu "+ (i+1) +" la : " );
            arrInt[i]=sc.nextInt();
        }
        In_Mang(arrInt);
        System.out.print("Trung binh cong cua mang la :");
        int tong = 0;
        for(int i=0;i<n;i++){
            tong+=arrInt[i];
        }
        System.out.print((double) tong/n);
    }

    public static void Bai_3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Hay nhap so luong mang : ");
        int n = sc.nextInt();
        int[] arrInt = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Phan tu thu "+ (i+1) +" la : " );
            arrInt[i]=sc.nextInt();
        }
        In_Mang(arrInt);
        //tao 1 mang mới
        int[] new_arrInt = new int[n+1];
        System.out.print("Mang sau khi chen la: ");
<<<<<<< HEAD
        for(int i=0;i<=n;i++){
=======
        for(int i=0;i<n;i++){
>>>>>>> cb0e8c00136716f1587b37ec457d12a071613e86
            if(i==2){
                new_arrInt[i]=5;
            }
            if(i<2){
                new_arrInt[i]=arrInt[i];
            }
<<<<<<< HEAD
            if(i>2 ){
                new_arrInt[i]=arrInt[i-1];
            }
        }
        In_Mang(new_arrInt);
=======
            if(i>2 && i<n){
                new_arrInt[i+1]=arrInt[i];
            }
        }
        In_Mang(new_arrInt);
    }

    public static void Bai_4(){
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        System.out.print("Cac ky tu giong nhau la : ");
        Lay_string_giong_nhau(array1,array2);
    }
    public static void Lay_string_giong_nhau(String[] arr1,String[] arr2){
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+ "  ");
                }
            }
        }
>>>>>>> cb0e8c00136716f1587b37ec457d12a071613e86
    }

    public static void Bai_4(){
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};

        System.out.print("Cac ky tu giong nhau la : ");
        Lay_string_giong_nhau(array1,array2);
    }
    public static void Lay_string_giong_nhau(String[] arr1,String[] arr2){
        for(int i=0;i< arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+ "  ");
                }
            }
        }
    }
}