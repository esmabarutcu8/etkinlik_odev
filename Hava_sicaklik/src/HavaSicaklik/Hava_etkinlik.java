package HavaSicaklik;
import java.util.Scanner;
public class Hava_etkinlik {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int sicaklik;
        System.out.println("Sıcaklık giriniz:");
        sicaklik=input.nextInt();

        String oneri1=(sicaklik<5)?"Kayak":"Kayak dışında bir etkinlik yapabilirsiniz";
        String oneri2=(sicaklik>5 && sicaklik<25)?"Sinemaya gidebilirsiniz":"Sinema dışında bir etkinliğe gidin";
        String oneri3=(sicaklik>10&&sicaklik<25)?"Pikniğe  gidebilirsiniz":"Piknik dışında bir etkinliğe gidin";
        String oneri4=(sicaklik>25)?"Yüzmeye gidebilirsiniz":"Yüzme dışında bir etkinkiğe gidin";





    }
}
