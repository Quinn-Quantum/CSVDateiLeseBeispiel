import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public  static void main(String[] args)  {
     // try {
       //   BufferedReader reader = new BufferedReader(new FileReader("artikelliste.csv"));
         // String zeile="";
          //zeile = reader.readLine();

        //while((zeile = reader.readLine()) != null){
         //   String[] token = zeile.split(";");

          //  System.out.println("Datensätze:" + Arrays.toString(token));}
            //System.out.println("Datensätze:" + zeile);
     // } catch (IOException e){
      //    e.printStackTrace();
      //}

        try {
            BufferedReader reader = new BufferedReader(new FileReader("studentNameCSV.csv"));
            String zeile="";
            zeile = reader.readLine();

            while((zeile = reader.readLine()) != null){
                String[] token = zeile.split(";");
                System.out.println(token[0] + " | "+ token[1]+ " | "+ token[2]+ " | "+ token[3] + "|" + token[4]);
                //s = new Schueler ((token[0] + token[1]) ,joker = Integer.parseInt(token[2]), blamiert = Integer.parseInt(token[3]), fragen= Integer.parseInt(token[4]));
            }
            //System.out.print(s);

        } catch (IOException e){
            e.printStackTrace();
        }

    }

}
