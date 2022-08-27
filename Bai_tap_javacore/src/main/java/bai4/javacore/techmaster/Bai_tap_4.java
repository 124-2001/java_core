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
        System.out.print("Mang sau khi chen la: ");
        for(int i=0;i<n;i++){
            if(i>2){
                arrInt[i+1]=arrInt[i];
            }
            if(i==2){
                arrInt[i]=5;
            }
        }
        In_Mang(arrInt);
    }
}
