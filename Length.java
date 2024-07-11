class Length
{
public static void main(String args[])
{
int length;  //2
int breadth;  //3
int height;  //4
Scanner sc=new Scanner(System.in);
length=sc.nextInt();
breadth=sc.nextInt();
height=sc.nextInt();
int Volume = length*breadth*height;  //24
System.out.println(Volume + "Enter a volume of cuboid");
		
int Area =2*(length*breadth+breadth*height+height*length);
System.out.println(Area + "Enter a Area");
}
}