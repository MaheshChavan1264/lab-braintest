package service;

public class PersonalityCalculator{
	public String findYourBrainType(String options) {
		int array[] = findAnswers(options);
		int a=array[0]+array[1]+array[2]+array[4]+array[7]+array[9]+array[10]+array[11]+array[13]+array[17]+array[19];
		int b=array[3]+array[5]+array[6]+array[12]+array[14]+array[15]+array[16]+array[18];
		int x=66-a+b;
		System.out.println("Your total score "+x);
		if((x>=22)&&(x<=55))
			return "Left-brained ";
		if((x>=56)&&(x<=64))
			return "No clear preference ";
		if((x>=65)&&(x<=100))
             return "Right-brained";
		return "false";	
	}

	public int[] findAnswers(String options) {
		String c[]=options.split(",");
		int value=c.length;
		int array[]=new int[value];
		int i=0;
		for(String s:c) //for-each loop
		{
			array[i]=Integer.parseInt(s);
			i++;
		}

		return array;
	}
}