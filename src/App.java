import java.text.DecimalFormat;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        
        double cash = sc.nextDouble();
        //Notas
        double note100 = (int)cash/100;
        double restOfNote100 = cash%100;

        double note50 = (int)restOfNote100/50;
        double restOfNote50 = restOfNote100 %50;
        
        double note20 = (int)restOfNote50/20;
        double restOfNote20 = restOfNote50 %20;

        double note10 = (int)restOfNote20/10;
        double restOfNote10 = restOfNote20%10;

        double note5 = (int)restOfNote10/5;
        double restOfNote5 = restOfNote10%5;

        double note2 = (int)restOfNote5/2;
        double restOfNote2 = restOfNote5%2;
        //Moedas
        double coin1 = (int)restOfNote2/1;
        double resCoin1 = restOfNote2%1;

        double coin50 = resCoin1/0.5;
        double resCoin50 = resCoin1%0.5;

        double coin25 = resCoin50/0.25;
        double resCoin25 = resCoin50%0.25;

        double coin10 = resCoin25/0.10;
        double resCoin10 = resCoin25%0.10;  
        
        double coin5 = resCoin10/0.5;
        double resCoin5 = resCoin10%0.5;
        
        double coin = resCoin5/0.1;

 
        System.out.println("NOTAS:");
        System.out.println(df.format(note100)+" notas(s) de R$ 100.00");
        System.out.println(df.format(note50)+" notas(s) de R$ 50.00");
        System.out.println(df.format(note20)+" notas(s) de R$ 20.00");
        System.out.println(df.format(note10)+" notas(s) de R$ 10.00");
        System.out.println(df.format(note5)+" notas(s) de R$ 5.00");
        System.out.println(df.format(note2)+" notas(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        System.out.println(df.format(coin1)+" moeda(s) de R$ 1.00");
        System.out.println(df.format(coin50) + " moeda(s) de R$ 0.50");
        System.out.println(df.format(coin25)+" moeda(s) de R$ 0.25");
        System.out.println(df.format(coin10)+" moeda(s) de R$ 0.10");
        System.out.println(df.format(coin5)+" moeda(s) de R$ 0.05");
        System.out.println(df.format(coin)+" moeda(s) de R$ 0.01");
        
        sc.close();
    }
}
