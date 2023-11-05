package com.competitiveprog;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());		
		int t=Integer.parseInt(st.nextToken());
		while(t-->0){
		    int length=Integer.parseInt(st.nextToken());
		    String s=st.nextToken();
		    int count=getOnesCount(s);
		    System.out.println(noOfWays(count));
		}
	}
	private static int getOnesCount(String s){
	    int count =0;
	    int number=Integer.parseInt(s);
	    while(number!=0){
	        if(number%10!=0){
	            count++;
	        }
	        number/=10;
	    }
	    return count;
	}
	private static int noOfWays(int count){
	    int sum=0;
	    if(count==0) return 0;
	    else{
	        sum+=count+noOfWays(count-1);
	    }
	    return sum;
	    
	}
}
