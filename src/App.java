import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double cash = sc.nextDouble();
        int notas = (int) cash;
        int coins = (int) ((cash - notas)*100);
        sc.close();
        //Notas
        int note100 = notas /100;
        notas -= note100 * 100;
        int note50 = notas/50;
        notas -= note50 *50;
        int note20 = notas/20;
        notas -= note20 * 20;
        int note10 = notas /10;
        notas -= note10 * 10;
        int note5 = notas /5;
        notas -= note5 * 5;
        int note2 = notas/2;
        notas -= note2 * 2;
        //Moedas
        int coin1 = notas;
        notas-= coin1 * 1;
        int coin50 = coins/50;
        coins -= coin50 * 50;
        int coin25 = coins/25;
        coins -= coin25 * 25;
        int coin10 = coins/10;
        coins -= coin10 * 10;
        int coin5 = coins/5;
        coins -= coin5 * 5;
        int coin = coins;

        System.out.println("NOTAS:");
        System.out.println(note100+" nota(s) de R$ 100.00");
        System.out.println(note50+" nota(s) de R$ 50.00");
        System.out.println(note20+" nota(s) de R$ 20.00");
        System.out.println(note10+" nota(s) de R$ 10.00");
        System.out.println(note5+" nota(s) de R$ 5.00");
        System.out.println(note2+" nota(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        System.out.println(coin1+" moeda(s) de R$ 1.00");
        System.out.println(coin50+" moeda(s) de R$ 0.50");
        System.out.println(coin25+" moeda(s) de R$ 0.25");
        System.out.println(coin10+" moeda(s) de R$ 0.10");
        System.out.println(coin5+" moeda(s) de R$ 0.05");
        System.out.println(coin+" moeda(s) de R$ 0.01");
        
        
    }
}
