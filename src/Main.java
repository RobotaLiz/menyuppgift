import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      while (true) {



        System.out.println("Vad vill du göra?");
        System.out.println("1 Addera två tal");
        System.out.println("2 Räkna bokstäver i en sträng");
        System.out.println("3 Spegelvänd en sträng");
        System.out.println("4 Summera alla tal i en sträng");
        System.out.println("e avsluta");

        Scanner scan = new Scanner(System.in);
        char menyVal = scan.nextLine().charAt(0);
        
        if (menyVal == '1') {
          System.out.println("Här adderar vi två tal");
          Addera(scan);

        } else if (menyVal == '2') {
          System.out.println("Räkna bokstäverna i en sträng");
          abccount(scan);
        } else if (menyVal == '3') {
          System.out.println("Spegelvänd en sträng");
          mirroraString(scan);
        } else if (menyVal == '4') {
          System.out.println("Summera alla tal i en sträng");
          sumOfString(scan);
        }else if (menyVal == 'e') {
          System.out.println("Hej då!");
          break;
        }
        else {
          System.out.println("Angivet menyVal existerar inte");
        }
      }

    }
    public static void Addera(Scanner addscan){
      System.out.println("Första talet ");
      int one = addscan.nextInt();
      System.out.println("Andra talet ");
      int two = addscan.nextInt();
      int sum = one + two;
      System.out.println("Summan är "+ sum);

    }
    public static void abccount (Scanner abcscan) {
      System.out.println("Ange ordet du vill leta i");

      String word = abcscan.nextLine();

      System.out.println("ange bokstaven du letar");
      char bokstav = abcscan.nextLine().charAt(0);
      int count = 0;
      for (int i = 0; i < word.length(); i++) {
        char c = word.charAt(i);
        if (bokstav == c){
          count ++ ;
        }
      }
      System.out.println("Det finns " + count +" "+ bokstav + " i ordet " + word);


    }
    public static void mirroraString (Scanner mirrorscan){
      System.out.println("Skriv in en sträng");
      String mirrorString = mirrorscan.nextLine();
      mirrorString = new StringBuilder(mirrorString).reverse().toString();
      System.out.println(mirrorString);


    }
    public static void sumOfString(Scanner sumScan){
      System.out.println("Ange en sträng av siffror:");
      String numberString = sumScan.nextLine();
      String[] splittedString = numberString.split("");

      int sum = 0;
      for(int i = 0; i < splittedString.length; i++){
        sum += Integer.parseInt(splittedString[i]);
      }
      System.out.println("Summan av siffrorna blev: "+sum);

    }





}