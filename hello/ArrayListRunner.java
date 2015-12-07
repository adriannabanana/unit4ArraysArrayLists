import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       
       names.add("Alice");
       names.add("Bob");
       names.add("Connie");
       names.add("David");
       names.add("Edward");
       names.add("Fran");
       names.add("Gomez");
       names.add("Harry");
       System.out.println(names);
       System.out.println();
       
       String first = names.get(0);
       String last = names.get(names.size()-1);
       System.out.println("First name in the list: "+first);
       System.out.println("Last name in the list: "+last);
       System.out.println();
       
       System.out.println("List size: "+names.size());
       System.out.println();
       
       names.set(0,"Alice B. Toklas");
       System.out.println(names);
       
       names.add(4,"Doug");
       System.out.println(names);
       System.out.println();
       
       for (String i : names)
       {
           System.out.println(i);
       }
       System.out.println();
       System.out.println();
       
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.print(names2);
       System.out.println();
       names.remove(0);
       System.out.println(names);
       System.out.println(names2);
   }
   

} 
