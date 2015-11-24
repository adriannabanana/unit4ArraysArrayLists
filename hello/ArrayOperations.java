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
}