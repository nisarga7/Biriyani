class Student
{
static String names[]={"Deepa","Rani","Soumya","Nisarga","Pooja","Shweta","Lakshmi","Radhika","Anita","Muskan"};
static void printAll()
{
for(int index=0;index<names.length;index++)
{
	System.out.println(names[index]);
}
System.out.println();
}
static void updateAll(String oldNames,String newNames)
{
	for(int index=0;index<names.length;index++){
		if(oldNames.equals(names[index]))
		{
			names[index]=newNames;
			
		}
}
}
}