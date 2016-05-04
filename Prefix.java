
package prefix;
public class Prefix
{
    public static void main(String[] args)
    {
        String str1 = "fred is my name.";
        String str2 = "Xiao Mei is my name.";

        // The String to check the above two Strings to see
        // if they start with this value (Xi).
        String startStr = "Xi";

        // Do either of the first two Strings start with startStr?
        boolean starts1 = str1.startsWith(startStr);
        boolean starts2 = str2.startsWith(startStr);

        // Display the results of the startsWith calls.
        System.out.println("\"" + str1 + "\" starts with " +
            "\"" + startStr + "\"? " + starts1);
        System.out.println("\"" + str2 + "\" starts with " +
            "\"" + startStr + "\"? " + starts2);
        
        
        if ((starts1) && (starts2))
        	
        System.out.println("Prefix");
        else
            System.out.println("NO PREFIX");

        	
        
        
        
    }
}