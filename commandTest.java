class commandTest{
public static void main(String[] args)
{
int s=0;
for(int i=0;i<args.length;i++)
{
if(args[i].matches("[0-9\\.]"));
	s+=Double.parseDouble(args[i]);
}
System.out.println(s);
}
}