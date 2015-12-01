public class ArrayOperations
{
    private int[] values;
    public ArrayOperations(int[] initialValues) 
    { 
        values = initialValues; 
    }
    
    public void swapFirstAndLast() 
    {
        int last = values[values.length - 1];
        int first = values[0];
        values[0] = last;
        values[values.length-1] = first;
    }
    
    public void shiftRight() 
    {
        int last = values[values.length-1];
        for (int i = (values.length-1); i > 0; i--)
        {
            values[i] = values[i-1];
        }
        values[0]=last;
    }
    
    public void evenToZero()
    {
        for (int i: values)
        {
            if (i%2 == 0)
            {
                values[i] = 0;
            }
        }
    }
    
    public void largerNeighbor()
    {
        int[] original = values;
        for (int i = 1; i < values.length-1; i++)
        {
            int neighbor1 = original[i-1];
            int neighbor2 = original[i+1];
            if (neighbor1>neighbor2)
            {
                values[i] = neighbor1;
            }
            else if (neighbor2>neighbor1)
            {
                values[i] = neighbor2;
            }
        }
    }
    
    public void removeMiddle()
    {

        if (values.length%2==0)
        {
            int[] removedMiddle = new int[values.length-2];
            int middle = values.length/2;
            for (int i = 0; i < values.length; i++)
            {
                if ( i== middle || (i == (middle+1)))
                {
                }
                else
                {
                    removedMiddle[i] = values[i];
                }
            }
                    
            
             
        }
    }
    
}