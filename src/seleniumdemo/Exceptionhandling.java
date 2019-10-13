package seleniumdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		
		try
		{
			int i = 1/0;
			System.out.println(i);
			}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
			
		}
		try
		{
			String s = "vmetry";
			System.out.println(s);
		}
		catch(NullPointerException ex)
		
		{
			System.out.println(ex.getMessage());
		}
		try
		{
			int []a = new int [1];
			a[2]= 20;
			System.out.println(a[0]);	
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex.getMessage());
			
		}
        try
        {
        	File f = new File("");
        	FileInputStream fis = new FileInputStream(f);
        }
        catch(FileNotFoundException ex)
        {
        	System.out.println(ex.getMessage());
        }

	}

}
