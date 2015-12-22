
/**
 * PersonWithZip class contains a person's name and zipcode
 * 
 * @author Adrianna Fu
 * @version 12/21/15
 */
public class PersonWithZip
{
    private String firstName;
    private String lastName;
    private int zipCode;

    /**
     * Default constructor for objects of class PersonWithZip
     */
    public PersonWithZip(String firstName, String lastName, int zipCode)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }
    
    // returns the value of the zip code
    public int getZip()
    {
        return this.zipCode;
    }
    
    //returns a string of all the instance variables with labels
    public String toString()
    {
        String val = "Name: " + firstName + " " + lastName;
        val += ("\nZip Code: " + zipCode);
        return val;
    }
    
}
