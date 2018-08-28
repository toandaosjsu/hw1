public class Strings
{
   public static String uniqueLetters(String str)
   {
       // Create an array of size 256 and count of
        // every character in it
        int NO_OF_CHARS = 256;
        String str2 = "";
        int[] count = new int[NO_OF_CHARS];
      
        /* Count array with frequency of characters */
        int i;
        for (i = 0; i < str.length(); i++)
            if(str.charAt(i)!=' ')
                count[(int)str.charAt(i)]++;
        int n = i;
      
        // Print characters having count more than 0
        for (i = 0; i < n; i++)
            if (count[(int)str.charAt(i)] == 1)
            {
                System.out.print(str.charAt(i));
                str2 = str2 + str.charAt(i);
                
            }
   return str2;
   }
}