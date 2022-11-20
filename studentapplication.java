class student{
public static void main(String[] args){
String name="shekar";
char section='b';
int roll=458;
double s1=90,s2=80,s3=78,s4=80;
double percentage;
boolean status=false;
double total_marks=s1+s2+s3+s4;
if(s1>35&s2>35&s3>35&s4>35){
status=true;
percentage=total_marks/400*100;

System.out.println("student has passed"+"and percentage is\n"+percentage);

}
else{
System.out.println("student has failed");}
}
}

