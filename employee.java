class employee{
public static void main(String args[]){
System.out.println("employee application"+"\n"+"_______________________________________________");
int employee_id=12345;
String e_name="shekar";
String edept="hr";
double basic_salary=20000;
double total_salary;
double d_allowance=10*basic_salary/100;
double t_allowance=15*basic_salary/100;
double food_allowance=5*basic_salary/100;
total_salary=basic_salary+d_allowance+t_allowance+food_allowance;
System.out.println("total_salary"+total_salary+"\n"+"________________________________________________________");
double gst=18*total_salary/100;
double pf=5*total_salary/100;
double gross_salary=total_salary-(gst+pf);
System.out.println("gross salary="+gross_salary+"\n__________________________________________\n___________________________________"); 

}
}



