class Temperature
{
public static void main(String args[])
{
double c,f;
Scanner sc=new Scanner(System.in);
System.out.println("Enter temperature in celsius");
c=sc.nextDouble();
f=c*(9.0/5.0)+32;
System.out.println(" temperature in farenheit"+f);
}
}