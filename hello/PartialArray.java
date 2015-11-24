public class PartialArray
{
    
    /** instance variable values */
    private int[] values;
    private int currentSize;
    
    /**
     * Constructor for objects of class PartialArray
     * 
     */
    public PartialArray()
    {
        //initialize instance variables
        this.values = new int[100];
        
        for ( this.currentSize = 0; this.currentSize <20; this.currentSize ++)
        {
            this.values[this.currentSize] = this.currentSize * this.currentSize;
        }
        
    }
    
    public void remove(int pos)
    {
        for ( int i = pos + 1; i < this.currentSize; i++ )
        {
            this.values[i-1] = values[i];
        }
        this.currentSize--;
        
    }
    
    public void insert(int pos, int newValue)
    {
        if (this.currentSize < this.values.length)
        {
            this.grow() ;
        }
        for (int i = currentSize; i>pos; i--)
        {
            this.values[i] = this.values[i-1];
            {
                this.grow();
            }
        }
        this.values[pos] = newValue;
        currentSize ++;
    }
    
    public void grow()
    {
        int[] newValues = new int[this.currentSize *2];
        for (int i = 0; i< this.currentSize; i++)
        {
            newValues[i] = this.value[i];
        }
        this.values[posA];
    }
    
    public static void main (String[] args)
    {
        int[] new
    }
}




    