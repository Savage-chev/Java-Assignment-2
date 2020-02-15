
/**
 * @author (Plamen Savchev @00533641 Group 1.1) 
 * @version (0.3 25/10/19)
 * 
 * Class Borrower adds functinality to create borrower objects on the object bench
 * which my inherited by CD class by slecting in case of borrowing CD. The class 
 * contain just 2 variables for the surname and the library ID of the borrower.
 * 
 * There are 2 constructor, first of which is default and is hard-coded while the
 * second constructor string inputed entry to surname and library ID.
 * 
 * 2 accessor method allows to check the surname and the library id of the object.
 * Also, this methods have been used in certain cituation by the CD class.
 */

public class Borrower
{
    // instance variables
    
    private String surname;                 //Surname of the borrower
    
    private String libraryID;               //Library ID of the borrower

    /**
     * Default hard-coded constructor for objects of class Borrower
     */
    
    public Borrower()
    {
        // initialise instance variables
        surname = "default surname";
        libraryID = "default libraryID";
    }
    
    /**
     * Constructor for objects of class Borrower which wxpect entries
     * for variables surname and library ID.
     */
    
    public Borrower(String newSurname, String newLibraryID)
    {
        // initialise instance variables
        surname = newSurname;
        libraryID = newLibraryID;
    }

    /**
     * Accessor method that return the surname of the borrower object
     */
    
    public String getSurname()
    {
        return surname;
    }
    
    /**
     * Accessor method that return the library ID for the borrower object
     */
    
    public String getLibraryID()
    {
        return libraryID;
    }
}
