package comp127;

public class BasicStuff {

    public static void main(String[] args) {
        double age0;
        double age1;

        age0 = 19;
        age1 = 19;

        System.out.println("We are " + age0 + " and " + age1 + " years old!");


        double sumofages;

        sumofages = age0 + age1;

        System.out.println("The sum of our ages is " + sumofages + "!");

        System.out.println("The sum of our ages is" + age0 + age1 + "!");


        System.out.println(6/3);

        System.out.println(6/4);

        System.out.println(Integer.MAX_VALUE);

        System.out.println((Integer.MIN_VALUE));

        System.out.println(Integer.MIN_VALUE - 1);


        double Hours = 1600;
        double Days;
        double Weeks;

        Days = Hours/24;
        Weeks = Days/7;

        System.out.println("THere are " + Days + " in 1600 hours and " + Weeks + " in 1600 hours.");


        double h;
        double r;
        double V;
        double A;

        h = 4;
        r = 7;

        V = 1.0/3 * Math.PI * (r*r) * h;

        A = Math.PI * (r*r) + Math.PI *r * (Math.sqrt(r*r) + (h*h));

        System.out.println("V = " + V + " A = " + A);














    }
}
