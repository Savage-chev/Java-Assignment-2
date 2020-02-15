
/**
 * @author (Plamen Savchev @00533641 Group 1.1) 
 * 
 * @version (0.3 25/10/19)
 * 
 * Class CD simulates creating an entry for a CD in a library. The class have a 
 * default hard-coded constructor and one that expect entries for title, artist,
 * number of tracks and cost. On both costructor there is variable for 
 * borrower with default value of null and boolean variable if the CD is
 * in stock with default value - true.
 * 
 * There are 5 Accessor moethod which allow you to check to title, artist, number of 
 * tracks, cost and to print a full report.
 * 
 * The following mutator method borrow() adds the functionality CD to be borrowed.
 * Initially the the method had an actual parameter that was expecting surname entry
 * in the CD class. However, the method has been modify as expected in the homework
 * sheet and now once the method is used, expect an selection of an existing borrower
 * from the object bench created by the Borrower class. Once done, 
 * 
 * The last 3 mutator methods have the functionality to return the CD, report the 
 * CD is currently in stock or not and calculate the earnings from a CD respectively. 
 * The first 2 are using "if" statement while the last one return simple arithmetics to
 * determine the earnings.
 */

public class CD
{
    // instance variables
    
    private String title;            //Title of the CD
    
    private String artist;           //Artist of the CD
    
    private int noOfTracks;          //The number of tracks on the CD
    
    private double cost;             //Cost of the CD
    
    private boolean inStock;         //Determine if the CD is in stock
    
    private int timesBorrowed;       //Variable counting time CD has been borrowed
    
    //private String borrower;       //Name of the borrower. Variable from the CD class
    
    private Borrower borrower;       //Name of the borrower. Variable from Borrower class
    
    /**
     * Default hard-coded constructor to create objects of class CD 
     */
    
    public CD()
    {
        // initialise instance variables
        title = "default title";
        artist = "default artist";
        noOfTracks = 16;
        cost = 1.5;
        borrower = null;
        inStock = true;     
    }
    
    /**
     * Constructor for objects of class CD which expects entries for 
     * title, artist, number of the tracks and price of the CDs.
     */
    
    public CD(String newTitle, String newArtist, int numbertracks, double cdPrice)
    {
        // initialise instance variables
        title = newTitle;
        artist = newArtist;
        noOfTracks = numbertracks;
        cost = cdPrice;
        borrower = null;
        inStock = true;
    }
    
    /**
     * Accessor method that returns the title of the CD
     */
    
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Accessor method that returns the artist of the CD
     */
    
    public String getArtist()
    {
        return artist;
    }
    
    /**
     * Accessor method that returns the number of tracks on the CD
     */
    
    public int getNoOfTracks()
    {
        return noOfTracks;
    }
    
    /**
     * Accessor method that returns the cost of the CD
     */
    
    public double getCost()
    {
        return cost;
    }
    
    /**
     * Accessor method that print a full report on the CD in the terminal window
     */
    
    public void printReport()
    {
        System.out.print('\u000C');
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Tracks: " + noOfTracks);
        System.out.println("Price: " + cost);
        System.out.println("Times Borrowed: " + timesBorrowed);
        System.out.println("This CD has earned £" + calculateEarnings() + " so far.");
        if (inStock == true)
        {
            System.out.println("This cd is currently in stock.");
        }
        else 
        {
            System.out.println("This CD is currently unavailable.");
            
            //Print out that statement if the borrower is inherited from the Borrower class
            System.out.println("The CD has been borrowed by " + borrower.getSurname() + " - ID: " + borrower.getLibraryID() + ".");
            
            //Print out that statement when borrower is created in the CD class
            //System.out.println("The CD has been borrowed by " + borrower + ".");
        }
    }
    
    /**
     * There are 2 mutotar method within here. The first one has been commented out and modified
     * in order to be able to pick an existing borrower from the object bench created by the class
     * borrower. Therefore, instead of string the name of the borrower from CD class, the name and
     * the library ID are inherited from the selected Borrower object. The method also add to the
     * borrowing count and sitching boolean statement inStock from true to false. In case the CD 
     * is currently not available message will be displayed in the terminal window.
     */
    
    //Currently this method header has been commented out in order to be modified and allow you to pick a an existing user from the object bench
    //public void borrow(String name)
    
    public void borrow(Borrower borrower)
    {
        if (inStock == true)      //if cd available do the following
        {
            //the following line belong to the original mutator method allowind you to string borrower name directly from the CD class
            //borrower = name;
            
            this.borrower = borrower;
            inStock = false;
            timesBorrowed++;
        }
        else                      //if cd not available do the following
        {
            System.out.print('\u000C');
            System.out.println("The CD is currently unavailable.");
        }
    }
    
    /**
     *Mutator method allowing you to return the CD by switching 
     *the boolean variable inStock and return barrower back to null
     */
    
    public void returnCD()
    {
        if (borrower != null)
        {
            inStock = true;
            borrower = null;
        }
        else
        {
            System.out.println("This CD has been returned already.");
        }
    }
    
    /**
     * Mutator method adding functionality to check if the CD is currently in stock.
     * The method is using if in a if statement and in both cases will present the 
     * results in the terminal window. The second if statemnt is used due to the
     * 2 different type of borrowers in the class. In both cases if the CD is currently
     * unavailable will print out the current borrower.
     */
    
    public void reportInStock()
    {
        if (inStock == true)
        {
            System.out.print('\u000C');
            System.out.println("This cd is currently in stock.");
        }
        else 
        {
            System.out.print('\u000C');
            System.out.println("This CD is currently unavailable.");
            
            //Print out that statement if the borrower is inherited from the Borrower class
            System.out.println("The CD has been borrowed by " + borrower.getSurname() + " - ID: " + borrower.getLibraryID() + ".");
            
            //Print out that statement if borrower is created in the CD class
            //System.out.println("The CD has been borrowed by " + borrower + ".");
        }
    }
    
    /**
     * Mutator method that calculate the earnings to the moment. 
     * As requested in the homework sheet the operation is carried 
     * only if the method is called from the object.
     */
    
    private double calculateEarnings()
    {
        return cost * timesBorrowed;
    }
}
