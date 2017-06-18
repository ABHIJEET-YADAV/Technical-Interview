/*    *
      * * *
      * * * * *
      * * * 
      *
*/
public class First {

	public static void main(String[] args) {
	int i;
	int j;
	int k=0;
	
	for(i=1;i<=5;i++)
	{
		if(i<=3)
		{
			k++;
		}
		else{
			k--;
		}
		if(i<=3){
		for(j=1;j<=((2*k)-1);j++)
		{
			System.out.print("*\t");
		
		}
		System.out.println();
		}
		else{
			for(j=1;j<=((2*k)-1);j++)
			{
				System.out.print("*\t");
				
			}
			System.out.println();
		}
	}


		
	}

}