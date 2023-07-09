import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
            int sal=0;
            int bonus=0, weeklyBonus=0, extra=0;
            int salaryMon, salaryTues, salaryWed, salaryThur, salaryFri, extraHour=0;
            Scanner scanner = new Scanner(System.in);
            int sun =scanner.nextInt();
            int mon = scanner.nextInt();
            int tues= scanner.nextInt();
            int wed= scanner.nextInt();
            int thur= scanner.nextInt();
            int fri= scanner.nextInt();
            int sat= scanner.nextInt();


            int salarySat= sat * 125;
            int salarySun= sun * 150;

            if(mon > 8){
                extraHour = mon-8;
                bonus = extraHour*115;
                salaryMon= bonus + 800;
            }
            else{
                salaryMon= mon*100;
            }
            if(tues> 8){
                extraHour = tues-8;
                bonus = extraHour*115;
                salaryTues= bonus + 800;
            }
            else{
                salaryTues= tues*100;
            }
            if(wed> 8){
                extraHour = wed-8;
                bonus = extraHour*115;
                salaryWed= bonus + 800;
            }
            else{
                salaryWed= wed*100;
            }
            if(thur> 8){
                extraHour = thur-8;
                bonus = extraHour*115;
                salaryThur= bonus + 800;
            }
            else{
                salaryThur= thur*100;
            }
            if(fri > 8){
                extraHour = fri-8;
                bonus = extraHour*115;
                salaryFri= bonus + 800;
            }
            else{
                salaryFri= fri*100;
            }
            int sum = mon + tues+wed+ thur+ fri;
            if(sum > 40){
                weeklyBonus  = sum-40;
                extra = weeklyBonus * 125;
            }
            sal = salaryMon + salaryTues + salaryWed+ salaryThur + salaryFri + salarySat+ salarySun + extra;
            System.out.println(sal);
    }
}
