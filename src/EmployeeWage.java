

public class EmployeeWage {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int EMP_RATE_PER_HOURS;
    private final int NUM_OF_WORKING_DAYS;
    private final int MAX_HRS_IN_MONTH;
    private  int totalEmpWage;

    public EmployeeWage(String company, int EMP_RATE_PER_HOURS, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTH) {
        this.company = company;
        this.EMP_RATE_PER_HOURS = EMP_RATE_PER_HOURS;
        this.MAX_HRS_IN_MONTH = MAX_HRS_IN_MONTH;
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
    }

    public void computeEmpwage() {
        int empHrs ;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
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
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOURS;
    }

    public String toString(){
        return "total wage per comp" +company+ " is:" +totalEmpWage;
    }

    public static void main(String[] args) {
	// write your code here
        EmployeeWage atos=new EmployeeWage("techM",10,15,10);
        EmployeeWage techM=new EmployeeWage("Atos",15,20,15);
        atos.computeEmpwage();
        System.out.println(atos);
        techM.computeEmpwage();
        System.out.println(techM);




    }
}
