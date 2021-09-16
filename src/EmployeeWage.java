public class EmployeeWage {
    public static  final int IS_PART_TIME=1;
    public static final int IS_FULL_TIME=2;



    public static int computeEmpwage(String company,int EMP_RATE_PER_HOURS,int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH){
        int empHrs=0;
        int totalWorkingDays=0;
        int totalEmpHrs=0;

        while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays< NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;

            }

            totalEmpHrs+=empHrs;
            System.out.println("working days:"+totalWorkingDays + "total hours:" +empHrs);
        }
        int totalEmpWage=totalEmpHrs * EMP_RATE_PER_HOURS;
        System.out.println("total wage:" + totalEmpWage);
        return totalEmpWage;

    }
    public static void main(String[] args) {
	// write your code here
        computeEmpwage("techM",20,15,10);
        computeEmpwage("Atos",15,20,15);




    }
}
