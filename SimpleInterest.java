class SimpleInterest{
	public static void main(String[] args){
		int principal,rate,time;
		float simpleinterest;
		principal=Integer.parseInt(args[0]);
		rate=Integer.parseInt(args[1]);
		time=Integer.parseInt(args[2]);
		simpleinterest=(float)(principal*rate*time)/100;
System.out.println("Simple Interest is " +simpleinterest);
	}
}