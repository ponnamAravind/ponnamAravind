package task_1;

public class arithmetic_operations {

	public static void main(String[] args) {
		
		arithmetic_operations ap = new arithmetic_operations() ;
		
		
		
		ap.addition();
		ap.subtration();
		ap.multiplication();
		ap.division();
		

	}
	
	public static void addition()
	{
		int ad_num1=9,ad_num2=23;
		
		int total=ad_num1+ad_num2;
	  System.out.println(ad_num1+"+"+ad_num2+"="+total);
		
	}
	public static void subtration()
	{
		int sub_num1=5,sub_num2=46;
		
		int total=sub_num1-sub_num2;
	  System.out.println(sub_num1+"-"+sub_num2+"= "+total);
		
	}

	public static void multiplication()
	{
		int mut_num1=7,mut_num2=5;
		
		int total=mut_num1*mut_num2;
	  System.out.println(mut_num1+"*"+mut_num2+"= "+total);
		
	}
	public static void division()
	{
		double div_num1=11,div_num2=3;
		
		if(div_num2!=0)
		{
		double total=div_num1/div_num2;
	  System.out.println(div_num1+"/"+div_num2+"= "+total);
		}
		else
		{
			System.out.println("error: division by zero not allowed");
		}
		
	}
}
