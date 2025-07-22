

package roadaccidentsreports;
//import java.text.DecimalFormat;
//import java.text.NumberFormat;
import java.util.Scanner;

public class RoadAccidentsReports {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       //NumberFormat formatter = new DecimalFormat("#0");
       String[] accidentType = {"car", "motor bike"};
       String[] city = {"Cape Town", "Johannesburg","Port Elizabeth"};
       int[] totals = new int[city.length];
       int accidentData[][] = new int[3][2];//{{155, 121},{178, 145},{112 , 89}};
       
       for(int x = 0;x<3;x++)
       {
           for(int y = 0;y<2;y++){
               System.out.print("Enter the number of " + accidentType[y] + " accidents for " + city[x] + ": ");
               accidentData[x][y] = scan.nextInt();
           }
       }
       System.out.println("----------------------------------------------------");
       System.out.println("ROAD ACCIDENT REPORT");
       System.out.println("----------------------------------------------------");
        System.out.println("\t\t\t");
        for(String type : accidentType){
         System.out.println(type.toUpperCase() + "\t\t");
        }
        System.out.println();
        int maxCityAccident = 0;
        String cityWithMostAccidents = "";
        for(int x = 0;x<city.length;x++){
               System.out.print(city[x] + "\t\t");
               for(int y = 0; y < accidentType.length; y++){
                   System.out.print((accidentData[x][y]) + "\t\t");               
               }
               int accidentTotal = accidentData[x][0] + accidentData[x][1];
               if(accidentTotal > maxCityAccident){
                   cityWithMostAccidents = city[x];
                   maxCityAccident = accidentTotal;
               }
               totals[x] = accidentTotal;
               System.out.println();
        }
        System.out.println();
        System.out.println("------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------");
        
        for(int x = 0; x < city.length; x++){
                   System.out.println(city[x] + "\t" + (totals[x]));               
               }
          System.out.println();
           System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS :" + cityWithMostAccidents);
            System.out.println("------------------------------------------------------");
    }
    
}
