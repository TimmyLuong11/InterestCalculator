import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class main 
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    DecimalFormat df=new DecimalFormat("0.00");
    
    double money;
    double years;
    double interest;
    double cal;
    double cal1;
    double cal2;
    double count;
    double count1;

    System.out.print("Enter the amount of money: ");
    money = input.nextDouble();
    System.out.print("Enter the amount of years: ");
    years = input.nextDouble();
    System.out.print("Enter the amount of interest: ");
    interest = input.nextDouble();
    

    for(int i = 1; i <= years; ++i)
    {
    	cal = money*Math.pow(1 + (interest/100)/years, 0.25*years);
    	count = cal - money; 
        for(int j = 1; j <= years; ++j)
        {
        	System.out.println("In year " + i + " quarter " + j + " you earned $"+ df.format(count));
        		count = count+money;
            	cal = count*Math.pow(1 + (interest/100)/years, 0.25*years);
                count = cal - count; 
        }
        
        cal2 = money*Math.pow(1 + (interest/100)/years, (i*years));
        System.out.println("At the end of year " + i + " you had $" + df.format(cal2));
        
    }
  }
}