import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Meyveler ve KG Fiyatları
        //
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL
        //Örnek Çıktı;
        //
        //Armut Kaç Kilo ? :0
        //Elma Kaç Kilo ? :1
        //Domates Kaç Kilo ? :1
        //Muz Kaç Kilo ? :2
        //Patlıcan Kaç Kilo ? :3
        //Toplam Tutar : 21.68 TL

        double armut, elma, domates, muz, patlıcan, kilo;

        Scanner inp = new Scanner(System.in);

        System.out.println("Armut kaç kilo : ");
        kilo = inp.nextDouble();
        armut = kilo * 2.14;

        System.out.println("Elma kaç kilo: ");
        kilo = inp.nextDouble();
        elma = kilo * 3.67;

        System.out.println("Domates kaç kilo : ");
        kilo = inp.nextDouble();
        domates = kilo * 1.11;

        System.out.println("Muz kaç kilo : ");
        kilo = inp.nextDouble();
        muz = kilo * 0.95;

        System.out.println("Patlıcan kaç kilo : ");
        kilo = inp.nextDouble();
        patlıcan = kilo * 5.0;

        System.out.println("Toplam fiyat" +(armut + elma + domates + muz + patlıcan));



















    }

}