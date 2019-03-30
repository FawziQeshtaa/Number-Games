package com.company;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {


        //         الأسم:فوزي موسى نصرالله قشطة     &     الرقم الجامعي:120180698


        Scanner in = new Scanner(System.in);

        System.out.println("whats your name?");
        String names;
        names = in.next();
        System.out.println("اهلا و سهلا" + " " + names);
        int number = 0;

        while (number != 3) {
            System.out.println("مستوى صعوبة اللعبة : المستوى الصعب بين 1/1000 :1");
            System.out.println("اذا اردت هذا المستوى ادخل  1");
            System.out.println("المستوى السهل بين 2:1/100");
            System.out.println("اذا اردت هذا المستوى ادخل :2");
            System.out.println("اذا اردت الخروج ادخل :3");
            number = in.nextInt();
            Random s = new Random();

            if (number == 1) {
                System.out.println(" تم اختيار المستوى الصعب");
                System.out.println("ابدا بالمحاولة");
                int com_nn = 0;
                for (int i = 1; i <= 10; i++) {
                    int nuf;
                    do {
                        nuf = in.nextInt();
                        com_nn++;
                    } while (nuf < 0 && nuf > 1000);
                    int sum = s.nextInt(1000);
                    if (nuf == sum) {
                        System.out.println("تهانينا لقد فزت بالتخمين");
                        System.out.println("الرقم صحيح");
                        break;
                    } else if (nuf < sum && nuf >= 0) {
                        System.out.println("اقل بكثير");
                        System.out.println("الرقم غير صحيح");
                    } else if (nuf > sum && nuf <= 100) {
                        System.out.println("اكبر بكثير");
                        System.out.println("الرقم غير صحيح");
                    } else
                        System.out.println("ادخل رقم صحيح");
                }

                System.out.println("عدد المحاولات" + " " + com_nn);
            } else if (number == 2) {
                System.out.println("تم اختيار لمستوى السهل");
                System.out.println("ابدا بالمحاولة");
                int com_mm = 0;
                for (int b = 1; b <= 5; b++) {
                    System.out.println("حاول مرة اخرى");
                   int sad;
                   do {
                       sad = in.nextInt();
                       com_mm ++;
                   }while (sad <0 && sad > 100);
                   int num = s.nextInt(100);
                    if (sad == num) {
                        System.out.println("تهانينا لقد فزت بالتخمين");
                        System.out.println("الرقم صحيح");
                        break;
                    } else if (sad < num && sad >= 0) {
                        System.out.println("اقل بكثير");
                        System.out.println("الرقم خاطئ");
                    } else if (sad > num && sad <= 100) {
                        System.out.println("اكبر بكثير");
                        System.out.println("الرقم خاطئ");
                    }else
                        System.out.println("ادخل رقم صحيح");

                }
                System.out.println("عدد المحاولات" + " " + com_mm);

            } else if (number == 3) {
                System.out.println("خروج");
            }

        }
    }

 }

//                       الحمد لله الذي سخر لنا هذا و ما كنا له مقرنين





