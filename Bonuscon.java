import java.util.Scanner;
public class Bonuscon {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int  performancerating = sc.nextInt();
        int yearsofservice = sc.nextInt();
        String departmenttype = sc.next();
        double bonuspercentage = 0;
        double basesalary = sc.nextDouble();
        String status;
        if(performancerating>=3){
            if(departmenttype.equals("Critical")){
                if(performancerating == 5 && yearsofservice >=5){
                    bonuspercentage = 25;
                }
                else if(performancerating==4 && yearsofservice >=10){
                    bonuspercentage = 22;
                }
                else if(performancerating==4){
                    bonuspercentage = 15;
                }
                else if(performancerating==3){
                    bonuspercentage = 10;
                }
                }
                else{
                    if(performancerating ==5){
                        bonuspercentage =18;
                    }
                    else if(performancerating ==4){
                        bonuspercentage = 12;
                    }
                    else if(performancerating ==3){
                        bonuspercentage = 8;
                    }
                }
                status = "Eligible";
            }
            else{
                bonuspercentage = 0;
                status = "Not eligible";
            }
            double bonusAmount = basesalary*(bonuspercentage/100);
            System.out.println("performancerating:"+performancerating);
            System.out.println("yearsofservice:"+yearsofservice);
            System.out.println("Department:"+departmenttype);
            System.out.println("Bonuspercentage:"+bonuspercentage+"%");
            System.out.println("BonusAmount:$"+bonusAmount);
            System.out.println("Status:"+status);
            sc.close();
        }

    }
