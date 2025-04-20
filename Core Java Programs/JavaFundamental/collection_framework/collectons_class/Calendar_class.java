package collection_framework.collectons_class;

import java.util.Calendar;

public class Calendar_class {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //As Calendar is an abstract class..we cannot create the object of Calendar class by using new keyword...so getInstance() method returns object of calendar class

        
        Calendar cal=Calendar.getInstance();         // instantiate => object creation
                         //here, Calendar.getInstance() returns an object of abstract class Calendar
        
        System.out.println(cal.getTime());
        
       
        //cal.add(Calendar.DATE, 5);     //5 means it will return 5days AFTER date from current date
         //System.out.println(cal.getTime());
            
        
        // cal.add(Calendar.DATE, -5);
         //System.out.println(cal.getTime());
        
        
         //cal.add(Calendar.MONTH,2);
         //System.out.println(cal.getTime());
        
        
         //cal.add(Calendar.YEAR, -3);
         //System.out.println(cal.getTime());
        
        //cal.add(Calendar.HOUR, -3);           //-3 means it will return HOUR which is 3 hours back date from current date 
        //System.out.println(cal.getTime());
        
        
        //System.out.println(cal.get(Calendar.DATE));
        //System.out.println(cal.get(Calendar.MONTH));     //0= Jan, 1= FEb, 2=march,3=Apr
        
        //System.out.println(cal.get(Calendar.YEAR));

        //System.out.println(cal.get(Calendar.DAY_OF_MONTH));    //12
        
        
        //System.out.println(cal.get(Calendar.DAY_OF_WEEK));   //sun=1,mon=2.....sat=7
        
    //    System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));  //2  //returns current week number  in month starting from sunday
        
        //System.out.println(cal.get(Calendar.WEEK_OF_MONTH));    //2
        
        //System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        
        //System.out.println(cal.get(Calendar.ERA));
        
        //System.out.println(cal.get(Calendar.WEEK_OF_YEAR));      //returns current week number in year
        
        
        //System.out.println(cal.get(Calendar.MINUTE));
        
        //System.out.println(cal.get(Calendar.HOUR_OF_DAY));   //return current hour number
        
        //System.out.println(cal.getMaximum(Calendar.WEEK_OF_MONTH)); 
        //System.out.println(cal.getMinimum(Calendar.WEEK_OF_MONTH));  
        
        
        
        //System.out.println(cal.getMaximum(Calendar.WEEK_OF_YEAR));   //53
       // System.out.println(cal.getMinimum(Calendar.WEEK_OF_YEAR));  //1
                
        
        //System.out.println(cal.getMinimalDaysInFirstWeek());  //1//returns miminum days in first week of the month
        
        
        
        //    System.out.println(cal.getMaximum(Calendar.DAY_OF_MONTH)); //31
            //System.out.println(cal.getMinimum(Calendar.DAY_OF_MONTH)); //1
           
        //System.out.println(cal.getMaximum(Calendar.DAY_OF_YEAR));   //366
        //System.out.println(cal.getMinimum(Calendar.DAY_OF_YEAR)); //1
        
        
        //System.out.println(cal.getMaximum(Calendar.HOUR));  //11
        //System.out.println(cal.getMinimum(Calendar.HOUR));   //0
        
        
        //System.out.println(cal.getAvailableCalendarTypes());
        
         System.out.println(cal.getCalendarType());
            
        
        
    }

}