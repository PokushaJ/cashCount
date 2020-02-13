package org.example;

import org.apache.camel.main.Main;

import java.util.Scanner;

/**
 * A Camel Application
 */
public class MainApp {

    public static void enterNamews (String names[]) { // Ввод имен челиков
        Scanner scanner = new Scanner (System.in);
        for (int i = 0; i < names.length; i++) {
            System.out.println("Челик номер " + i);
            names[i] = scanner.next();
        }
    }
    public static void enterSkinyli (double skinyli []) { //Ввод суммы, которую скинул челик
        Scanner scanner = new Scanner (System.in);
        for (int i = 0; i < skinyli.length; i++) {
            System.out.println("Челик " + i + " скинул");
            skinyli[i] = scanner.nextDouble();
        }
    }
    public static double stoimostTysovki (double skinyli []) { //Подсчет общей стоимости тусовки
        double stoimost = 0;
        for (int i = 0; i < skinyli.length; i++) {
            stoimost = skinyli[i] + stoimost;
        }
        return  stoimost;
    }
    public static double sredneeNaChelika (double summaTus, int kolvo) { //Средняя стоимость на челика
        double result = 0;
        result = summaTus/kolvo;
        return  result;
    }

    public static void itogovayaTema(double summa [], double jopa) { // Итоговый подсчет суммы
        for (int i = 0; i < summa.length; i++) {
            summa[i]=jopa-summa[i];
        }
    }
    public static void conclusion (String imena [], double summochka []) {
        for (int i = 0; i < imena.length; i++){
            System.out.println(imena[i] + " должен скинуть " + summochka [i]);
        }
    }
    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numberOfPersons;
        System.out.println("Ввелите количество человек на тусовке: ");
        numberOfPersons = scanner.nextInt();

String names [] = new String[numberOfPersons];
double summaBabla [] = new double[numberOfPersons];
double chislo = 0;
double chislo2 = 0;
enterNamews(names);
enterSkinyli(summaBabla);
chislo=stoimostTysovki(summaBabla);
System.out.println("Стоимость тусовки: " + chislo);
chislo2=sredneeNaChelika(chislo, numberOfPersons);
itogovayaTema(summaBabla,chislo2);
conclusion(names, summaBabla);
    }

}

