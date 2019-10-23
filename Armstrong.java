// import java.lang.Math;
class Armstrong{
 public static void main(String[] args) {
int num,sum=0,temp,digit,count=0;
num=Integer.parseInt(args[0]);
temp=num;
while(num>0)
{
	num/=10;
	count++;
}
num=temp;
while(num!=0)
{ digit=num%10;
	sum+=Math.pow(digit,count);
	num=num/10;
}
if(sum==temp)
{
	System.out.println("Armstrong Number");
}
else
{
	System.out.println("Not a Armstrong Number");
}

	}
}