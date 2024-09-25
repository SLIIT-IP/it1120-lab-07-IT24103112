import java . util . scanner ;
public class IT24103112 Lab7Q1a {
public static void main(string[] args){
scanner keyboard =new scanner(system.in);

int count = 1;
int total = 0;
doubleavg = 0.0;
while (count <= 4)
{
System.out.println("Enter the marks of subject:");
int subject =keyboard . nextInt();
total=total + subject ;
count = count + 1 ;
}
avg = total/4 ;
System.out.println("The average marks is :"+avg);
if (avg >+75 && avg <=100)
{
System.out.println("The grade is Distinction");
}
else if (avg >=74 && avg >= 50 )
}
System .out.println(The grade is cradit");
}
else
{
System.println("The grade is pass ");
}
}
}

