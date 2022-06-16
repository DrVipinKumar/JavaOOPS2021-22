package genericex;
class Add<T extends Number>
{
	T[] num;
	Add(T[] ob)
	{
		num=ob;
	}

	T sum()
	{	double sums=0;
	  //  T sums;
		for(int i=0;i<num.length;i++)
		  sums	=sums+num[i].doubleValue();
		
		return (T)Double.valueOf(sums);
			
	}
}

class BoundClass
{	
	public static void main(String []str)
	{
		Double ar[]={1223.2,2.0,33.0,4.6,5.555};
		Add<Double> ob1=new Add<Double>(ar);
		System.out.println(ob1.sum());
	}
}

