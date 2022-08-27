package bai3.javacore.techmaster;

import java.util.Arrays;
import java.util.Scanner;

public class Bai_tap_3 {


    public static void main(String[] args)
    {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println();
            System.out.println("******___________________******");
            System.out.print("Hay nhap bai toan :");
            int n = sc.nextInt();
            while (n > 5) {
                System.out.print("Khong duoc lon hon 5 hay nhap lai :");
                n = sc.nextInt();
            }
            switch (n) {
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
            }
        }
    }
    public static void Bai_1(){
        String chuoi;
        char kyTu;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chuỗi ban đầu : ");
        chuoi = scanner.nextLine();

        System.out.println("Chuỗi mới là : ");
        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(i);
            System.out.print(kyTu);
            System.out.print(kyTu);
        }
        System.out.println();
    }
    public static void Bai_2(){
        String chuoi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuỗi ban đầu : ");
        chuoi = scanner.nextLine();
        int[] count = new int[chuoi.length()];
        for (int i=0;i<chuoi.length();i++){
            count[i]=0;
        }
        for (int i=0;i<chuoi.length();i++){
            for(int j=i+1;j<chuoi.length();j++){
                if(chuoi.charAt(i)==chuoi.charAt(j)){
                    count[j]++;
                    break;
                }
            }
        }
        System.out.print("Chuoi khong bi lap la :");
        for(int i=0;i<chuoi.length();i++){
            if(count[i]==0){
                System.out.print(chuoi.charAt(i));
            }
        }
        System.out.println();
    }

    public static void Bai_3(){


        String chuoi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuỗi ban đầu : ");
        chuoi = scanner.nextLine();
        int[] count = new int[chuoi.length()];

        for (int i=0;i<chuoi.length();i++){
            count[i]=0;
            for(int j=0;j<chuoi.length();j++){
                if(chuoi.charAt(i)==chuoi.charAt(j)){
                    count[i]++;
                }
            }
        }
        System.out.print("Các ký tự xuất hiện 1 làn là : ");
        for(int i=0;i<chuoi.length();i++){
            if(count[i]==1){
                System.out.print(chuoi.charAt(i)+" ");
            }
        }
        System.out.println();
    }

    public static void Bai_4(){
        String chuoi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuỗi ban đầu : ");
        chuoi = scanner.nextLine();
        int[] count = new int[chuoi.length()];
        int max =0;
        for(int i=0;i<chuoi.length();i++){
            count[i]=0;
            for(int j=i+1;j<chuoi.length();j++){
                if(chuoi.charAt(i)==chuoi.charAt(j)){
                    count[i]++;
                }
            }
            if(max<count[i]){
                max=count[i];
            }
        }
        System.out.print("Cac ky tu xuat hien nhieu nhat la: ");
        for (int i=0;i<chuoi.length();i++){
            if(count[i]==max){
                System.out.print(chuoi.charAt(i)+ " ");
            }
        }
        System.out.println();
    }

    public static void Bai_5(){
        String chuoi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuỗi ban đầu : ");
        chuoi = scanner.nextLine();
        String[] words = chuoi.split(" ");
        for (int i= words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }
        System.out.println();
    }
}

