public class Main {

    public static void main(String[] args) {
        double currentAPR = 17;
        double monthlyBalance = 5000;
        double monthlyPeriodic_rate = 0;
        double firstMonth_interest = 0;
        double secondMonth_interest = 0;

        monthlyPeriodic_rate = (currentAPR * 12)/100;
        firstMonth_interest = (monthlyBalance * monthlyPeriodic_rate)/100;
        monthlyBalance = monthlyBalance + firstMonth_interest;
        secondMonth_interest = (monthlyBalance * monthlyPeriodic_rate)/100;

        System.out.println("The first month interest is:" + firstMonth_interest + " and the second month interest is: " + secondMonth_interest);

	// write your code here
    }
}
