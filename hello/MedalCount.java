public class MedalCount
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    int[][] counts=
    {
        {1,0,1},
        {1,1,0},
        {0,0,1},
        {1,0,0},
        {0,1,1},
        {1,1,0},
        
    };

   

    
    public void printTable()
    {
        for (int i = 0 ; i<counts.length ; i++)
        {                
            for (int j = 0 ; j<counts[i].length ; j++)
            {
                System.out.print(counts[i][j] +"\t");
            }
            System.out.println();
        }
    }

            
    public int CountMedals (int countryIndex)
    {
        int total = 0;

        for (int j = 0; j< counts[countryIndex].length;j++)
        {
            total +=counts[countryIndex][j];
        }
        return total;
    }
        
    public int countPerMedal(int medalIndex)
    {
        int total = 0;
        for (int i = 0; i<counts.length ; i++)
        {
            total += counts[i][medalIndex];
        }

        return total;
        
    }
}
