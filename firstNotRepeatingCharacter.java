package codefights;

public class firstNotRepeatingCharacter 
{
	char firstNotRepeatingCharacter(String s) 
	{
		int i=0,j=0;
		int k=1;
		while(i<s.length())
		{
	        if(s.charAt(i)!='0')
	        {
	            j = i+1;
	            k=0;
	            while(j<s.length())
	            {
	                if( s.charAt(i) == s.charAt(j)) 
	                {
	                    s=s.replace(s.charAt(j),'0');
	                    k++;
	                }
	                j++;
	            }
	        }
	        if(k==0) return s.charAt(i);
	        i++;
		}
	    return '_';
	}

}
