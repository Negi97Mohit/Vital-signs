
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing;

/**
 *
 * @author negis
 */
import com.sun.source.tree.BreakTree;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.time.*;

public class Patient{
    
    //Variabels USed

    private static String[] ages={"New Born","Infant","Toddler","Pre Schooler", "School Age","Adolescent"};      //Age group for display
    private static int age_grp;  //User input of age group
    private static String name;
    private static String vital_select;
    private static int count;
    private static ArrayList<String> hist_val=new ArrayList<String>();
    private static ArrayList<String> choice_val=new ArrayList<String>();
    
    //Main function    
    public static void main(String[] args) throws InterruptedException {
        Scanner input=new Scanner(System.in);
        outer:{
        for(;;){
            System.out.println("         Select the Options:          ");
            System.out.println("| 1.Start a new entry                  |");
            System.out.println("| 2.View Patient History               |");
            System.out.println("| 3.Check if vital sign is normal      |");
            System.out.println("| 4.Print vital's report               |");
            System.out.println("| 5.Specific patients vital's report   |");
            System.out.println("| 6.Community BP report                |");
            System.out.println("| 7.Exit                               |");
            System.out.println("----------------------------------------");
            int choice=input.nextInt();
            if(choice==1){
                choice_val =isPatientNormal();
                hist_val.addAll(choice_val);
            }
            else if(choice==2)
                history(hist_val);
            else if(choice==3){
                VitalSigns vit=new VitalSigns();
                vit.isThisVitalSignNormal();
            }
            else if(choice==4)
                history(choice_val);
            else if(choice==5)
                historySelect(hist_val);
            else if(choice==6)
                community_report(hist_val);
            else if(choice==7){
                System.out.println("Thank you for Using JAVA");
                break outer;
            }
                else
                System.out.println("Enter a valid input");
        }
        }
    }
    
    //Used for vital signs verification
    public static ArrayList<String> isPatientNormal() throws InterruptedException{
        //input for user input
        Scanner input=new Scanner(System.in);
        ArrayList<String> strlist=new ArrayList<String>();
        //Getting personal information
        count=count+1;
        System.out.println("Enter the patients name:");
        name=input.nextLine();
        strlist.add(String.valueOf(count));
        LocalDateTime time=LocalDateTime.now();
        strlist.add(String.valueOf(time));
        strlist.add(name);
        //Finding the Age grp     
        System.out.println("-------------------------------------------------------");
        System.out.printf("         Select %s's age group\n",name);
        System.out.println("-------------------------------------------------------");
        for(int i=0;i<ages.length;i++)
            System.out.printf("                %d.%s\n",i+1,ages[i]);
        do{
            System.out.println("Enter a valid value"); 
            age_grp=input.nextInt();
        }
        while(age_grp<=0 || age_grp>6);
        System.out.println("**********************************");   
        System.out.printf("     Your age group is:%s\n",ages[age_grp-1]);
        System.out.println("**********************************");
        VitalSigns vital=new VitalSigns(); //Initializying the objects from the cls VitalSigns
        strlist.add(String.valueOf(vital.weight_kg(age_grp)));//Calling weight_kg methods from VitalSigns
        strlist.add(String.valueOf(vital.respiratory_rate(age_grp)));//Calling respiratory_rate methods from VitalSigns
        strlist.add(String.valueOf(vital.heart_rate(age_grp)));//Calling heart_rate methods from VitalSigns
        strlist.add(String.valueOf(vital.bld_press(age_grp)));//Calling bld_press methods from VitalSigns        
        vital.health_check(age_grp);//Calling health_check for final report
        strlist.add(String.valueOf(vital.bp_comm()));
        System.out.println("");
        System.out.println("Enter your city");//Getting the bloodpressure for community check
        String city=input.nextLine();
        String cities=input.nextLine();
        System.out.println("Enter your community");
        String community=input.nextLine();
        System.out.println("Enter your House No.");
        String house_no=input.nextLine();
        strlist.add(cities);
        strlist.add(community);
        strlist.add(house_no);
        return strlist;
        
    }
    
    //Vital Signs History Functions
    public static void history(ArrayList<String> choice_view){
          int count=1;
          System.out.println("Sr.No.         Date/Time                            Name             Weight(in kg)     Respiratory Rate           Heart Rate         Blood Pressure  ");
          System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
          for(int i=0;i<choice_view.size();i++){
              if(count%7==0)
                  System.out.printf("   %s        %s           %s              %s                %s                      %s                  %s\n",choice_view.get(i-6),choice_view.get(i-5),choice_view.get(i-4),choice_view.get(i-3),choice_view.get(i-2),choice_view.get(i-1),choice_view.get(i));
              count=count+1;
          }
          System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
      }
    
    
    //Selected records for specific person
    public static void historySelect(ArrayList<String> select_view){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the patients full name");
        String name_select=input.nextLine();
        int count=0;
        System.out.println("Sr.No.         Date/Time                            Name             Weight(in kg)     Respiratory Rate           Heart Rate         Blood Pressure  ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        for(int i=0;i<select_view.size();i++){
            if(select_view.get(i).equals(name_select)){
                count=+1;
                System.out.printf("   %s        %s           %s              %s                %s                      %s                  %s\n",select_view.get(i-2),select_view.get(i-1),select_view.get(i),select_view.get(i+1),select_view.get(i+2),select_view.get(i+3),select_view.get(i+4));
            }
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
        if(count>0)
            System.out.println("These are the records");
        else
            System.out.println("Invalid Input");
    }
    
    //Community BP report
    public static void community_report(ArrayList<String> comm_rep){
        System.out.println("Sr.No.         Date/Time                            Name             Weight(in kg)     Respiratory Rate           Heart Rate         Blood Pressure  ");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
       for(int i=0;i<comm_rep.size();i++){
            if(i>5){
                if((i-6)%10==0){
                    if(!comm_rep.get(i).equals("0")){
                        System.out.printf("   %s        %s           %s              %s                %s                      %s                  %s\n",comm_rep.get(i-6),comm_rep.get(i-5),comm_rep.get(i-4),comm_rep.get(i-3),comm_rep.get(i-2),comm_rep.get(i-1),comm_rep.get(i));
                    }
                }
            }
       }
       System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}   