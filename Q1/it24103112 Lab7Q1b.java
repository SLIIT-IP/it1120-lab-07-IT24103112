import java . util . scanner ;
public class IT24103112 Lab7Q1b {
public static void main(string[] args){
int count =1;
int total =0;
double avg =0.0;
for (i=1;i<=3;i++)
{
System.out.println("Student"+i);
for(count =0;count<4;count=count+1)
System.out.print("Enter the marks of subject");
intsubject=keyboard.nextInt;
total=total+subject;
}
avg =total/4
System.out.println("The average marks is :"+avg);
if (avg>=75&& avg >=100)
{
System.out.println("The grade is destinction");
}
elseif (avg>=75&& avg >=50)
{
System.out.println("The grade is credit");
}
else
{
System.out.println("The grade is pass")
}
}
}