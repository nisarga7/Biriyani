class Fibbo
{
public static void main(String []args)
{
int first=0,n=10,second=1;
for(int i=1;i<=n;i++)
{
System.out.println(first+"\t");
int next=first+second;
first=second;
second=next;
}
}
}