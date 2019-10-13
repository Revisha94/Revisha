package seleniumdemo;

public class Throwthrows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		final int i= 1;
		System.out.println(i);
		
		int age = 17;
		if (age<18)
		{
			throw new Exception();
			
		}
		else
		{
			System.out.println("allow to vote");
		}

	}

}
