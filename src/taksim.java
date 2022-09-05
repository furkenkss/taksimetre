import java.util.Scanner;
//Taksimetre KM başına 2.20 TL tutmaktadır.
//Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
//Taksimetre açılış ücreti 10 TL'dir.


public class taksim {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Gidilen mesafe ne kadar");
        int gm=inp.nextInt();
        int au=10,mu=20;
        double kmb=2.20,ott=0;
        ott=gm*kmb+10;

        if(ott<20){
            System.out.println("Açılış ücreti 10 TL dir\nÖdenecek ücret: "+mu+" TL");
        } else {
            System.out.println("Ödenecek ücret: "+ott+" TL");
        }
    }
}
