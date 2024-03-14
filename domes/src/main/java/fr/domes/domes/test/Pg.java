package fr.domes.domes.test;

/* 
import fr.domes.domes.controller.ClientController;

 
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;


import fr.domes.domes.entities.Adresse;
import fr.domes.domes.entities.Client;
import fr.domes.domes.entities.Commande;
import fr.domes.domes.entities.Login;
//import fr.domes.domes.services.ClientService;
//import fr.domes.domes.services.LoginService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
//import java.util.Locale;
//import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Pg {
    public static void main(String[] args) throws ParseException {





/* 
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
    try {  
        Date d1 = formatter.parse("31/03/2015");  
        System.out.println("Date is: "+d1);  
    } catch (ParseException e) {e.printStackTrace();}  
    


    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");   
        Date d1 = formatter.parse("20/09/2015"); 
        Date d2 = formatter.parse("12/03/2023");
        Date d3 = formatter.parse("13/03/2023");
        Date d4 = formatter.parse("05/11/2000");



        

         Date date = new Date();  
    SimpleDateFormat d1 = new SimpleDateFormat("02/05/2020");  
    String strDate= d1.format(date);  
    System.out.println(strDate);  
}  






        // creating an object of the class Date  
Date d = new Date(2-3-2020);  
  
// getting the instance by invoking the getDateInstance(int) method  
// here default locale is used  
DateFormat dFormat = DateFormat.getDateInstance(DateFormat.SHORT);  
  
String str = dFormat.format(d);  
System.out.println(str);  
}  






         Commande com1 = new Commande(null,d1,d2);
        Commande com2 = new Commande(null,d3,d4);
        

        Collection <Commande> collcom1 = new ArrayList<Commande>(){{add(com1);add(com2);}};
       // collcom1.add(com1);
       // collcom1.add(com2);
 


        //Commande com1 = new Commande(null, new LocalDate(2023, 3, 1), new LocalDate(2023,5,6));
       // ClientService cliserv = new ClientService();
       // LoginService logserv = new LoginService();
        Login log1 = new Login("nom@email.com", "1236987");
        Adresse ad1 = new Adresse("10 rue de rome", "Paris", "75000");

       // Collection <Commande> com1 = new ArrayList<Commande>(){{ add(null,d1, d2);
       //                                                         add(null,d1,d3)               }};
       // logserv.addLogin(log1);

       

        //Client cli1 = new Client("marc", "aurele", d4, "0102030255" , ad1, collcom1, log1);

        Client cli1 = new Client();
        cli1.setNom("marc");
        cli1.setPrenom("aurele");
        cli1.setDateNaissance(d4);
        cli1.setAdresse(ad1);
        cli1.setCommande(collcom1);
        cli1.setLogin(log1);
        cli1.setNumTel("0102030405");

        System.out.println(cli1);


        ClientController daoCli = new ClientController();
       daoCli.addClient(cli1);

        









    
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM d, yyyy");
   Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY , 25);
   Calendar date1 = new GregorianCalendar(2023, Calendar.JANUARY, 20);
   calendar.set(Calendar.HOUR, 10);
   calendar.set(Calendar.MINUTE, 42);
   calendar.set(Calendar.SECOND, 12);

   calendar.roll(Calendar.MONTH, -2);
   System.out.println(dateFormat.format(calendar.getTime()));


   


    }
}    

*/