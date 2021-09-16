class CompanyEmpWage{

    public final String company;
    public final int EMP_RATE_PER_HOURS;
    public final int NUM_OF_WORKING_DAYS;
    public final int MAX_HRS_IN_MONTH;
    public   int totalEmpWage;

    public CompanyEmpWage(String company,int EMP_RATE_PER_HOURS,int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH){
        this.company=company;
        this.EMP_RATE_PER_HOURS=EMP_RATE_PER_HOURS;
        this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
        this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
    }

    public void setToTotal(int totalEmpWage){
        this.totalEmpWage=totalEmpWage;
    }

    public String toString(){
        return "total wage per comp" +company+ " is:" +totalEmpWage;
    }

}
public class EmployeeWage {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int noOfCompany=0;
    private final  CompanyEmpWage[] CompanyEmpWageArray;
    public EmployeeWage(){
        CompanyEmpWageArray=new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(String company, int EMP_RATE_PER_HOURS, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
       CompanyEmpWageArray[noOfCompany]=new CompanyEmpWage(company,EMP_RATE_PER_HOURS,NUM_OF_WORKING_DAYS,MAX_HRS_IN_MONTH);
       noOfCompany++;
    }
    private void computeEmpWage(){
        for(int i=0;i<noOfCompany;i++){
            CompanyEmpWageArray[i].setToTotal(this.computeEmpwage(CompanyEmpWageArray[i]));
            System.out.println(CompanyEmpWageArray[i]);
        }
    }

    private int computeEmpwage(CompanyEmpWage companyEmpWage) {
        int empHrs ;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        while (totalEmpHrs <= companyEmpWage.MAX_HRS_IN_MONTH && totalWorkingDays < companyEmpWage.NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;

            }

            totalEmpHrs += empHrs;
            System.out.println("working days:" + totalWorkingDays + "total hours:" + empHrs);
        }
        return  totalEmpHrs * companyEmpWage.EMP_RATE_PER_HOURS;
    }



    public static void main(String[] args) {
	// write your code here
        EmployeeWage employeeWage=new EmployeeWage();
        employeeWage.addCompanyEmpWage("Atos",15,20,15);
        employeeWage.addCompanyEmpWage("techM",10,15,10);
        employeeWage.computeEmpWage();




    }
}
