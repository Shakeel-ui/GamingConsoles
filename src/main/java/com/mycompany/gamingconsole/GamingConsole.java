
package com.mycompany.gamingconsole;

public class GamingConsole {

    public static void main(String[] args) {
        
        String[] console = {"PS5","XBOX","SWITCH"};
        String[] city = {"CAPE TOWN","PORT ELIZABETH","PRETORIA"};
        int[][] sales = {{1000,2000,3000},{2000,3000,4000},{1500,1100,1200}};
        
         //==============DISPLAY==================
        
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("---------------------------------------------------------------------------");
        
        System.out.printf("%-24s","");  
        
       for (int i=0; i < console.length;i++) { 
               System.out.printf("%-18s",console[i]);
    }
       
        System.out.println("");
       
       for (int i = 0; i < city.length;i++){
            System.out.printf("%-24s",city[i]);
           
           for (int j = 0; j < console.length;j++){
               System.out.printf("%-18d",sales[i][j]);
                         
           }
           
           System.out.println("");
       }
       
        //=================TOTALS=================
       
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------------------------------");

        for (int i = 0; i < console.length; i++) {
              int total = 0;
            System.out.printf("%-16s" , city[i]); 
            for (int j = 0; j < sales.length; j++) {
                
        total += sales[i][j];
         
            }
            System.out.printf("%-14d" , total);
            System.out.println("");
            
}
        System.out.println("");

   //===============FIND CITY WITH MOST SALES=================
        int highestTotal = 0;
         String highestTown = "";

       for (int i = 0; i < city.length; i++) {

    int total = 0;

    for (int j = 0; j < sales[i].length; j++) {
        total += sales[i][j];
    }

    if (total > highestTotal) {
        highestTotal = total;
        highestTown = city[i];
    }
}
         System.out.println("CITY WITH THE MOST SALES: " + highestTown); 
        }
}
   

