import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deneme{
    static Scanner scanner = new Scanner(System.in);
    static List<Integer> list = new ArrayList<>();

  /*
  kullanıcııdan alınan listedeki elemanların
  1.tüm elemanların toplamını yazdıralım
  2.karelerini aldıralım
  3. tek eleman varsa küpünü alıp 3 fazlasının listesini yazdıralım
  4.cift elemanların kareköklerini ve aynı eleman tekrar etmiyecek şekilde kücükden büyüge yazdıralım
  5. tek olan eleamnları kücükden büyüge tekrarsız yazdıralım


   */

    public static void main(String[] args) {
        System.out.println("Listedeki elemanlari aralarinda bosluk birakarak giriniz :");
   String ListeEl =scanner.nextline();
        String[] liste;
        liste = listeEl.split(" ");
        for (String w:liste) {
            list.add(Integer.valueOf(w));
        }
        System.out.println(list);

    }

}
