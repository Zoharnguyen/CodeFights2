package codefights;

public class isCryptSolution 
{
	boolean isCryptSolution(String[] crypt, char[][] solution) 
	{
	    int i,j,n=0,m=0,k=0,x=0;
	    char[] saveChar = new char [100];
	    long [] arr = new long[4];
	    // Chep all character vao 1 arraychar
	    for(i=0;i<3;i++)
	    {
	        for(j=0;j<crypt[i].length();j++)
	        {
	            saveChar[n] = crypt[i].charAt(j);
	            n++;
	        }
	    }
	    // Lay so ky tu khac nhau
	    while(m<n)
	    {
	        k = 1+m;
	        while(k<n)
	        {
	            if(saveChar[m]!='0')
	            {
	                if(saveChar[m] == saveChar[k])
	                {
	                    saveChar[k] = '0';
	                    x++;
	                }
	            }
	            k++;
	        }
	        m++;
	    }
	    n = n-x;
	    // gan anh xa so vao ky tu tuong ung trong solution
	    for(i=0;i<3;i++)
	    {
	        for(j=0;j<crypt[i].length();j++)
	        {
	            for(k=0;k<n;k++)
	            {
	                if(crypt[i].charAt(j) == solution[k][0])
	                {
	                    crypt[i] = crypt[i].replace(crypt[i].charAt(j),solution[k][1]);
	                }
	            }
	        }
	    }
	    int y = 0;
	    // Chuyen string thanh int
	    for(i=0;i<3;i++)
	    {
	        arr[y] = Long.parseLong(crypt[i]);
	        y++;
	    }
	    // So sanh dieu kien tra ve gia tri
	    if(arr[0]==0 && arr[1]==0 && arr[2]==0 && crypt[0].length()==1) return true;
	    if(arr[0]+arr[1]==arr[2] && 
	     crypt[0].charAt(0)!='0' && crypt[1].charAt(0)!='0' && crypt[2].charAt(0)!='0') 
	    {
	        return true;
	    }
	    return false;
	}

}
