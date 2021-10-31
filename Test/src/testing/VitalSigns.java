

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;
import java.util.*;

/**
 *
 * @author negis
 */

public class VitalSigns {
    
    //Variabels used
    private static int weigh_kg_check = 0;
    private static int weigh_kg;
    private static  int resp_rate_check = 0;
    private static  int resp_rate;
    private static  int heart_rate_check = 0;
    private static  int heart_rate;
    private static  int blood_press_check = 0;
    private static  int blood_press;
   
      
//Weight in kilos
    
    public static double weight_kg(int age_grp){
        Scanner input=new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("  Enter the Weight in kilos");
        System.out.println("----------------------------------------");
        weigh_kg=input.nextInt();
        switch(age_grp){
            case 1:{
                if (weigh_kg>=2 && weigh_kg<=3)
                    weigh_kg_check=0;
                else if (weigh_kg<2) 
                    weigh_kg_check=-1;
                else
                    weigh_kg_check=1;
                break;
            }
            case 2:{
                if (weigh_kg>=4 && weigh_kg<=10)
                    weigh_kg_check=0;
                else if (weigh_kg<4) 
                    weigh_kg_check=-1;
                else
                    weigh_kg_check=1;
                break;
            }
            case 3:{
                if (weigh_kg>=10  && weigh_kg<=14)
                    weigh_kg_check=0;
                else if (weigh_kg<10) 
                    weigh_kg_check=-1;
                else
                    weigh_kg_check=1;
                break;
            }
            case 4:{
                if (weigh_kg>=14 && weigh_kg<=18)
                    weigh_kg_check=0;
                else if (weigh_kg<14) 
                    weigh_kg_check=-1;
                else
                    weigh_kg_check=1;
                break;
            }
            case 5:{
                if (weigh_kg>=20 && weigh_kg<=42)
                    weigh_kg_check=0;
                else if (weigh_kg<20) 
                    weigh_kg_check=-1;
                else
                    weigh_kg_check=1;
                break;
            }
            default:{
                if (weigh_kg>=50)
                    weigh_kg_check=0;
                else
                    weigh_kg_check=-1;
                break;
            }
        }
        if(weigh_kg_check==0 || weigh_kg_check==1)
            System.out.printf("Weight in kilos is:  %d\n",weigh_kg); 
        else 
            System.out.println("Low weight");
        return weigh_kg;

    }
    
//Respiratory rate check
 
    public static double respiratory_rate(int age_grp) throws InterruptedException{
        Scanner input=new Scanner(System.in);
        if(age_grp!=1){
            System.out.println("----------------------------------------");
            System.out.println("  Enter the respiratory rate");
            System.out.println("----------------------------------------");
            resp_rate=input.nextInt();
        }
        else{
            System.out.println("----------------------------------------------------------------");
            System.out.println("                     Wait for the alert");
            System.out.println("----------------------------------------------------------------");            
            Thread.sleep(6000);
            System.out.println("Now Enter the respiratory rate:");
            resp_rate=input.nextInt();
        }
        
        switch(age_grp){
            case 1:{
                if (resp_rate>=30 && resp_rate<=50)
                    resp_rate_check=0;
                else if (resp_rate<30) 
                    resp_rate_check=-1;
                else
                    resp_rate_check=1;
                break;
            }
            case 2:
            case 3:
            case 4:
            case 5:{
                if (resp_rate>=20&& resp_rate<=30)
                    resp_rate_check=0;
                else if (resp_rate<30) 
                    resp_rate_check=-1;
                else
                    resp_rate_check=1;
                break;
            }
            default:{
                if (resp_rate>=12&& resp_rate<=20)
                    resp_rate_check=0;
                else if (resp_rate<30) 
                    resp_rate_check=-1;
                else
                    resp_rate_check=1;
                break;
            }
        }
        return resp_rate;
    }
            
//Heart Rate Check
    
    public static int heart_rate(int age_grp){
        Scanner input=new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("  Enter the heart rate");
        System.out.println("----------------------------------------");
        heart_rate=input.nextInt();
        switch(age_grp){
            case 1:{
                if (heart_rate>=120 && heart_rate<=160)
                    heart_rate_check=0;
                else if (heart_rate<30) 
                    heart_rate_check=-1;
                else
                    heart_rate_check=1;
                break;
            }
            case 2:{
                if (heart_rate>=80 && heart_rate<=140)
                    heart_rate_check=0;
                else if (heart_rate<80) 
                    heart_rate_check=-1;
                else
                    heart_rate_check=1;
                break;
            }
            case 3:{
                if (heart_rate>=80 && heart_rate<=130)
                    heart_rate_check=0;
                else if (heart_rate<80) 
                    heart_rate_check=-1;
                else
                    heart_rate_check=1;
                break;
            }
            case 4:{
                if (heart_rate>=80 && heart_rate<=120)
                    heart_rate_check=0;
                else if (heart_rate<80) 
                    heart_rate_check=-1;
                else
                    heart_rate_check=1;
                break;
            }
            case 5:{
                if (heart_rate>=70 && heart_rate<=110)
                    heart_rate_check=0;
                else if (heart_rate<70) 
                    heart_rate_check=-1;
                else
                    heart_rate_check=1;
                break;
            }
            default:{
                if (heart_rate>=55 && heart_rate<=105)
                    heart_rate_check=0;
                else if (heart_rate<50) 
                    heart_rate_check=-1;
                else
                    heart_rate_check=1;
                break;}
        }
        return heart_rate;
    }
     
//Systolic Blood Pressure
    
    public static int bld_press(int age_grp){
        Scanner input=new Scanner(System.in);
        System.out.println("----------------------------------------");
        System.out.println("  Enter the Blood Pressure");
        System.out.println("----------------------------------------");
        blood_press=input.nextInt();
        switch(age_grp){
            case 1:{
                if (blood_press>=50 && blood_press<=70)
                    blood_press_check=0;
                else if (blood_press<70) 
                    blood_press_check=-1;
                else
                    blood_press_check=1;
                break;
            }
            case 2:{
                if (blood_press>=70 && blood_press<=100)
                    blood_press_check=0;
                else if (blood_press<50) 
                    blood_press_check=-1;
                else
                    blood_press_check=1;
                break;
            }
            case 3:
            case 4:{
                if (blood_press>=80 && blood_press<=110)
                    blood_press_check=0;
                else if (blood_press<80) 
                    blood_press_check=-1;
                else
                    blood_press_check=1;
                break;
            }
            case 5:{
                if (blood_press>=80 && blood_press<=120)
                    blood_press_check=0;
                else if (blood_press<80) 
                    blood_press_check=-1;
                else
                    blood_press_check=1;
                break;
            }
            default:{
                if (blood_press>=110 && blood_press<=120)
                    blood_press_check=0;
                else if (blood_press<110) 
                    blood_press_check=-1;
                else
                    blood_press_check=1;
                break;}
        }
        return blood_press;
    }
  
//Health Checkup
    
      public static void health_check(int age_grp){
          @SuppressWarnings("MismatchedReadAndWriteOfArray")
          int[] health_rates={resp_rate_check, heart_rate_check,blood_press_check};
          String[] health_status={"Respiratory rate","Heart Rate","Blood Pressure", "Weight in kg"};
        switch(age_grp){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:{
                if(health_rates[0]==1 && health_rates[1]==-1)
                    System.out.println("Condition Critical. Need Immediate Attention.");
                else if(health_rates[0]==0 && health_rates[1]==0 && health_rates[2]==0 )
                    System.out.println("Patient is perfectly fine");
                else{
                    for(int i=0;i<3;i++){
                        if(health_rates[i]==-1)
                            System.out.printf("%s is Low\n",health_status[i]);
                        else if(health_rates[i]==1)
                            System.out.printf("%s is High\n", health_status[i]);
                        else
                            System.out.printf("%s is in normal range\n",health_status[i]);
                    }
                }
                break;
            }
            default:{
                if(health_rates[0]==0 && health_rates[1]==0 && health_rates[2]==0 )
                    System.out.println("Patient is perfectly fine");
                else{
                    for(int i=0;i<3;i++){
                        if(health_rates[i]==-1)
                            System.out.printf("%s is Low\n",health_status[i]);
                        else if(health_rates[i]==1)
                            System.out.printf("%s is High\n", health_status[i]);
                        else
                            System.out.printf("%s is in normal range\n",health_status[i]);
                    }
                }
                break;
            }
        }
      }

//isThisVitalSignNormal methos
      
      public static void isThisVitalSignNormal(){
          Scanner input=new Scanner(System.in);
          System.out.println("Enter the Vital sign to be checked (in lower case):");
          System.out.println("              blood pressure");
          System.out.println("              heart rate");
          System.out.println("              respiratory rate");
          System.out.println("              weight");
          String str=input.nextLine();
          System.out.println("-----------------------------------------------------");
          
              if(str.equals("blood pressure")){
                  if(blood_press_check==-1)
                      System.out.println("Low Blood Pressure");
                  else if(blood_press_check==1)
                      System.out.println("Hight Blood Pressure");
                  else
                      System.out.println("Normal Blood Pressure");
              }
              else if(str.equals("heart rate")){
                  if(heart_rate_check==-1)
                      System.out.println("Low Heart rate");
                  else if(heart_rate_check==1)
                      System.out.println("Hight heart rate");
                  else
                      System.out.println("Normal heart rate");
              }
              else if(str.equals("respiratory rate")) {
                  if(resp_rate_check==-1)
                      System.out.println("Low respiratory rate");
                  else if(resp_rate_check==1)
                      System.out.println("Hight respiratory rate");
                  else
                      System.out.println("Normal respiratoryrate");
              }
              else if(str.equals("weight")){
                  if(weigh_kg_check==-1)
                      System.out.println("Low Weight");
                  else if(weigh_kg_check==1)
                      System.out.println("Hight weight");
                  else
                      System.out.println("Normal weight");
              }
              else{
              System.out.println("Enter a valid input");
              }
      }

//Storing community BP values
      
      public static int bp_comm(){
      return blood_press_check;
      } 
      
}

    
