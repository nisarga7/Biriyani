class Hills
{
public static void main(String []hello)
{
System.out.println("main method is started");
int num=0;
for(int index=0;index<=hello.length;index++)
{
if(num==8)
{
System.out.println();
num=0;
}
hello[2] = "Agombe";
System.out.println(hello[index]+"\t");
num=num+1;
}
}
}


