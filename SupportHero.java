


import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class SupportHero
{
    public static void main(String args[])
    {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        boolean loopAgain = true;
	Scanner scan = new Scanner(System.in);
        
        //1st week
        hmap.put(803, "Sherry");
        hmap.put(804, "Borris");
        hmap.put(805, "Vicente");
        hmap.put(806, "Matte");
        hmap.put(807, "Jack");
        //2nd week
        hmap.put(810, "Sherry");
        hmap.put(811, "Matte");
        hmap.put(812, "Kevin");
        hmap.put(813, "Kevin");
        hmap.put(814, "Vicente");
        //3rd week
        hmap.put(817, "Zoe");
        hmap.put(818, "Kevin");
        hmap.put(819, "Matte");
        hmap.put(820, "Zoe");
        hmap.put(821, "Jay");
        //4th week
        hmap.put(824, "Borris");
        hmap.put(825, "Eadon");
        hmap.put(826, "Sherry");
        hmap.put(827, "Franky");
        hmap.put(828, "Sherry");
        //5th week
        hmap.put(831, "Matte");
        hmap.put(901, "Franky");
        hmap.put(902, "Franky");
        hmap.put(903, "Kevin");
        hmap.put(904, "Borris");
        //6th week(907 Labor day)
        hmap.put(908, "Franky");
        hmap.put(909, "Vicente");
        hmap.put(910, "Luis");
        hmap.put(911, "Eadon");
        //7th week
        hmap.put(914, "Borris");
        hmap.put(915, "Kevin");
        hmap.put(916, "Matte");
        hmap.put(917, "Jay");
        hmap.put(918, "James");
        //8th week
        hmap.put(921, "Kevin");
        hmap.put(922, "Sherry");
        hmap.put(923, "Sherry");
        hmap.put(924, "Jack");
        hmap.put(925, "Sherry");
        //9th week
        hmap.put(928, "Jack");
        
//******************************************************************************
       
        System.out.print("\nWelcome to Main.java");
        
        boolean continueLoop = true;
        int date;
        
        do{
            try
            {
                System.out.println("\n\nEnter Y or N to display daily schedule");
                String answer6 = scan.next();
                
                if (answer6.equalsIgnoreCase("y"))
                {
                    System.out.print("\n\nEnter date E.g (MONTHDATE):");
                    date = scan.nextInt();
                
                    if(date>=803 && date<=928)
                    {
                        System.out.print(hmap.get(date));
                        
                    }else
                    {
                        System.out.println("\n***Warning please enter "
                                + "a valid date***");
                        
                    }
                    System.out.print("\n\nEnter another date (y/n)?");
                    String answer = scan.next();
                
                    if (answer.equalsIgnoreCase("y"))
                    {
                        continue;
                    }else
                    {
                       break; 
                    }
                }
                else
                {
                   
                }
                continueLoop = false;
            }
            catch (java.util.InputMismatchException e)
            {
                String bad_input = scan.next();
                System.out.println("\n***Warning the "
                        + "input "+bad_input+" is not valid"
                        + " please try again with integers "
                        + "between 803 and 928 only***");
            
            }
        }while(continueLoop);
        
        
//******************************************************************************       
        
        boolean loop1 = true;
      do{
            System.out.println("\nEnter Y or N to display a "
                    + "single users overall schedule");
            String answer7 = scan.next();
            
            if (answer7.equalsIgnoreCase("y"))
            {
                String user;
                System.out.println("\nEnter users name :");
                user = scan.next();
            
                for (Entry<Integer, String> entry : hmap.entrySet())
                {
                    if( entry.getValue().equalsIgnoreCase(user))
                    {
                        System.out.println(entry.getKey());
                    }
                }
                System.out.print("\n\nEnter another user (y/n)?");
                String answer4 = scan.next();
                 
                if (answer4.equalsIgnoreCase("y"))
                {
                    continue;   
                }
                else
                {
                    break;
                }
            }
            else
            {
            }
            loop1 = false;
       }while(loop1);
            
            
      
        
//******************************************************************************       
        
        
            System.out.print("\nEnter Y or N to display full schedule\n");
            String answer2 = scan.next();
        
            if (answer2.equalsIgnoreCase("y"))
            {
                System.out.println("\n\n**********************************");
                System.out.println("The following Users are in Schedule");
                System.out.println("   Date:  "+ " User:");
        
                for(int id:hmap.keySet())
                {
                    System.out.println("   "+id+"     "+hmap.get(id));
                }
                System.out.println("\n**********************************");
            }
            else
            {    
            }
        
//****************************************************************************** 
        
       
            System.out.println("\nEnter Y or N to remove shift");
            String answer3 = scan.next();
            
            try
            {
            
        
            if (answer3.equalsIgnoreCase("y"))
            {
                System.out.println("\nEnter input as ~monthDAY~");
                int removeUser = scan.nextInt();
                System.out.print(hmap.remove(removeUser)+" has been removed.");
                
                System.out.println("\n\n**********************************");
                System.out.println("The following Users are in Schedule");
                System.out.println("   Date:  "+ " User:");
        
                for(int id:hmap.keySet())
                {
                    System.out.println("   "+id+"     "+hmap.get(id));
                }
                System.out.println("\n**********************************");
            }
            else
            {
            }
            }
            
            catch (java.util.InputMismatchException e)
            {
                String bad_input = scan.next();
                System.out.println("\n***Warning the "
                        + "input "+bad_input+" is not valid"
                        + " please try again with integers "
                        + "between 803 and 928 only***");
            }
            
//******************************************************************************             
            
            
                System.out.println("\nEnter Y or N to add shift");
                String answer5 = scan.next();
                
                if (answer5.equalsIgnoreCase("y"))
                {
                    System.out.print("\n\nEnter the date with format "
                            + "~monthDAY~ :");
                    int date1 = Integer.parseInt(scan.next());
            
                    System.out.print("Enter User:");
                    // ask for user input which corresponds to student name
                    String user1 = scan.next();
            
                    String oldVal = hmap.put(date1, user1);
                    // add the key value pair from user input to the hashmap
            
                    if (oldVal!=null) 
                    {
                        System.out.println("Date" + date1 + " is " + oldVal + 
                            " and has been overwritten by " + user1);
                    }
                    
                    System.out.print("Enter another user (y/n)?");
                    // ask user to check if another entry is required
                    String answer = scan.next();
                
                    if (answer.equalsIgnoreCase("y")) 
                    // condition to satisfy in order to loop again
                    {
                        
                    }else
                    {
                        System.out.println("");
                        
                    }    
                }
                else
                {
                }   
                
                System.out.println("\n\n**********************************");
                System.out.println("The following Users are in Schedule");
                System.out.println("   Date:  "+ " User:");
        
                for(int id:hmap.keySet())
                {
                    System.out.println("   "+id+"     "+hmap.get(id));
                }
                System.out.println("\n**********************************");
    }
   
}
    




