package bai3.javacore.techmaster;

import java.util.Scanner;

public class Bai_tap_3 {
    public static void main(String[] args) {
        Bai_2();
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
    }

    public static void Bai_2(){
        String chuoi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuỗi ban đầu : ");
        chuoi = scanner.nextLine();
        char[] a = chuoi.toCharArray();

        for(int i=0;i<chuoi.length();i++){
            for(int j=i+1;j<chuoi.length();j++){
                if(a[i]==a[j]){
                    System.out.print(a[i]);
                    break;
                }

            }
        }
    }

    public static void Bai_3(){
        String chuoi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Chuỗi ban đầu : ");
        chuoi = scanner.nextLine();

        System.out.println("Ký tự xuất hiện 1 lần trong chuỗi là : ");
        int count=0;
        char[ ] arr = new char[chuoi.length()];
        for(int i=0;i<chuoi.length();i++){
            for(int j=i+1;j<chuoi.length();j++){
                if(chuoi.charAt(i)!=chuoi.charAt(j)){
                    arr[count]=chuoi.charAt(i);
                    break;
                }
            }
            count++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Bai_4(){
        String chuoi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuỗi ban đầu : ");
        chuoi = scanner.nextLine();
        int count1,count2;
        for(int i=0;i<chuoi.length();i++){
            for(int j=i+1;j<chuoi.length();j++){
                if(chuoi.charAt(i)!=chuoi.charAt(j)){

                }
            }
        }
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
    }
}
