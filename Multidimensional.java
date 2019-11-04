import java.util.*;
class Multidimensional{

	 static void fillarray(int arr[][],int row,int col)
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					arr[i][j]=(int)(Math.random()*100);
				}
			}
		}

	static void displayarray(int arr[][],int row,int col)
		{
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}

			static void primenumber(int arr[][],int row,int col)
			{ int k;
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						k=2;
            while(arr[i][j]%k!=0)
            {
            	k++;
            }
            if(k==arr[i][j])
            {
            	System.out.println("Cell Coordinates: "+i+" "+j);
            }
					}
				}

			}

	public static void main(String[] args) {
int row,col;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no. of rows:");
row=sc.nextInt();
System.out.println("Enter the no. of columns:");
col=sc.nextInt();
int arr[][]=new int[row][col];
fillarray(arr,row,col);
displayarray(arr,row,col);
primenumber(arr,row,col);
	}
}