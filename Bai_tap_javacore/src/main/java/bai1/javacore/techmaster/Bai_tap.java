package bai1.javacore.techmaster;
import java.util.Scanner;

import java.util.concurrent.ThreadLocalRandom;

public class Bai_tap {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap bai toan  :");
            int a = scanner.nextInt();
            switch (a){
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
                case 11:
                    Bai_11();
                    break;
            }
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
            Scanner scanner = new Scanner(System.in);
            System.out.print("So cho truoc :");
            double a = scanner.nextInt();
            double ramdom = a-Math.random();
            System.out.println("So nho hon so da cho la :" +ramdom );
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
            System.out.println("1) Số giờ ");
            System.out.println("2) Số phút ");
            System.out.println("3) Số giây ");
            Scanner scanner = new Scanner(System.in);
            System.out.print("chon option :");
            int a = scanner.nextInt();
            switch (a){
                case 1:
                    System.out.print("So gio :");
                    double gio=scanner.nextDouble();
                    System.out.println(gio+" gio , "+Doi_gio_nam(gio)+" nam");
                    break;
                case 2:
                    System.out.print("So phut :");
                    double phut=scanner.nextDouble();
                    System.out.println(Doi_phut_gio(phut)+" gio , "+Doi_gio_nam(Doi_phut_gio(phut))+" nam");
                    break;
                case 3:
                    System.out.print("So giay :");
                    double giay=scanner.nextDouble();
                    System.out.println(Doi_phut_gio(Doi_giay_phut(giay))+" gio , "+Doi_gio_nam(Doi_phut_gio(Doi_giay_phut(giay)))+" nam");
                    break;

            }


        }
        public static double Doi_phut_gio(double phut){
            return phut/60;
        }
         public static double Doi_gio_nam(double gio){
            return (gio/24)/365;
        }
        public static double Doi_giay_phut(double giay){
            return giay/60;
    }
    }


