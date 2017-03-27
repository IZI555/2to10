import java.util.Scanner;

public class main {
	public static int pot(int s)
	{
		int wynik =1;
		 int n =2;//podtsawa
        
      
         int w =s; //wyk³adnik
         if(w<0){
             w = w * -1;
             for(int i= 1;i<=w; i++)
             {

                 wynik=wynik*n;

             }
             wynik =1/wynik;

         }
         else{
             for(int i= 1;i<=w; i++){

                 wynik*=n;

             }
         }
     
		
		return wynik;
	}
	public static  void licz( )
	{
		Scanner in = new Scanner (System.in);
		int x[] =new int[8];
		int suma =0;
		//int err = 0;//zmienna do wskazania ze wsprowdzona warotsc nie jest 1 ANI 0
		boolean err=false;
		System.out.println("Podaj liczbe w zapisie binarnym");
		try
		{
			int bin = in.nextInt();
		
		
		int j=0;
		
			do
			{
				
					x[j]=bin%10;
					bin/=10;
					j++;	
				
				
			} while(bin!=0);
			//
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
		
		
		//System.out.println(pot(4));
		
		//System.out.println("podaj oœmio liczbowy ci¹g zer i jedynek.");
		for(int i = 0; i<x.length; i++ )
		{
			
			//System.out.println("Miejsce o potedze "+i);
			//int temp = in.nextInt();
			//if(temp==0 || temp==1)
			if(x[i]==0 || x[i]==1)
			{
				//x[i] = temp;
				if(x[i]==1)
				{
					suma+=pot(i);	
				}
			}
			else
			{
				//System.out.println("miales podac 0 lub 1");
				err=true;
				break;
				//System.out.println("mia³eœ podac 0 albo 1");
				//i--;
			}
		}
		
	
		
		
		
	if (!err)
	{
	  		System.out.println(""+suma);
			
			/*for(int i = 0; i<x.length; i++ )
			{
				System.out.print(x[i]+","); 
			}
			*/
	}
	else	
		{
			System.out.println("Wprowdzona wartoœæ jest b³êdna");
		}
}
		
		
	
	
	
	public static void main(String[] args)
	{
		licz();
	}
}