class Threeintegers
{
public static void main(String args[])
{
int a=5,b=6,c=7;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		int sum=a+b+c;  //18
		System.out.println(sum + " is a sum");
		
		int average=sum/3; //6
		System.out.println(average + " is avg");
}
}