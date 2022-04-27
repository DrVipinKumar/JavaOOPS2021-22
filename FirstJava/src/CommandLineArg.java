
public class CommandLineArg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		if (args.length>0)
		{
         for(int i=0;i<args.length;i++) {
        	 sum =sum+Integer.parseInt(args[i]);
         }
        System.out.println("Sum=%d".formatted(sum));
		} else 
		{
			System.out.println("No Arguments Passed");
			System.out.println("Pass arguments like: CommandLineArg 23 45 .....");
		}
	}

}