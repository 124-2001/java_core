package bai1.javacore.techmaster;
import java.util.Scanner;

import java.util.concurrent.ThreadLocalRandom;

public class Bai_tap {

        public static void main(String[] args) {
            Bai_10();
        }

        public static void Bai_1(){
            int i=10;
            System.out.println(i++%5);
        }
        public static void Bai_2(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap nhiet do theo do F :");
            double temperature = scanner.nextDouble();
            System.out.println("Nhiet do theo do C la : "+ (temperature-32)/1.8 +" °C");
        }
        public static void Bai_3(){
            double d =  9 /5;
            System.out.println("So d :" + d);
            d = (double)9 / (double)5;
            System.out.println("Sua code double d = (double)9 / (double)5 : "+ d);
        }
        public static void Bai_4(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap so can tinh tong :");
            int a = scanner.nextInt();
            int tong =0,so_du;
            while (a > 0) {
                so_du = a % 10;
                a = a / 10;
                tong += so_du;
            }
            System.out.println("Tong cac chu so la : " + tong);
        }
        public static void Bai_5(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap 2 so can kiem tra :");
            int a ,b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            boolean c;
            if(a+b==10){
                c=true;
            }
            else if (a==10|b==10) {
                c=true;
            } else if (a-b==10|b-a==10) {
                c=true;
            }
            else {
                c=false;
            }

            if(c==true){
                System.out.println("Chap Nhan ");
            }
            else{
                System.out.println("Khong chap Nhan ");
            }
        }
        public static void Bai_6(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap can nang :");
            double kg = scanner.nextDouble();
            System.out.print("Nhap chieu cao :");
            double cm = scanner.nextDouble();
            System.out.print("Chi so khoi co the (BMI) :"+ kg/(Math.pow(cm,2)));
        }
        public static void Bai_7(){
            System.out.println(System.currentTimeMillis());
        }
        public static void Bai_8(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Dau vao :");
            int a = scanner.nextInt();
            int so_du;
            System.out.print("Dau ra: ");
            while (a>0){
                so_du=a%10;
                System.out.print(" "+so_du+" ");
                a/=10;
            }
        }
        public static void Bai_9(){

        }
        public static void Bai_10(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("So bat dau :");
            int a = scanner.nextInt();
            System.out.print("So ket thuc :");
            int b = scanner.nextInt();
            int c=ThreadLocalRandom.current().nextInt(a,b);
            System.out.println(c);

        }
        public static void Bai_11(){

        }
    }


