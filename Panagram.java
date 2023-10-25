package com.pro.java;
import java.util.*;
public class Panagram {
	public static void main(String args[])
	{
		Scanner Sc = new Scanner (System.in);
		System.out.println("Enter a String");
		String s = Sc.nextLine();
		System.out.println(check(s.toLowerCase()));
	}
		static Boolean check(String s)
	{
		if (s.length() < 26)
		{
			return false ;
		}
		else
		{
			for (char ch = 'a'; ch <= 'z'; ch++)
			{
				if(s.indexOf(ch) < 0)
				{
					return false;
				}
			}
		}
		return true;
	}
}
