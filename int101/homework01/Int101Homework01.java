package int101.homework01;

import work03.MyUtil;
import work04.*;

public class Int101Homework01 {

    public static void main(String[] args) {
        work01Question(true, false, true, false, true, false);
        work01Answer(true, false, true, false, true, false);
        work02Question(1, 2, 3, 4, 5, 6);
        work02Answer(1, 2, 3, 4, 5, 6);
        work03UseOfUtilityClass();
        work04UseOfObjectClass();

    }

    static void work01Question(boolean b1, boolean b2, boolean b3,
            boolean b4, boolean b5, boolean b6) {
        boolean b = ((b1 ^ (b2 | b3)) && b4) || (b5 & b6);
        System.out.println("Work01:Question: b = " + b);
    }

    static void work01Answer(boolean b1, boolean b2, boolean b3,
            boolean b4, boolean b5, boolean b6) {
        boolean b = b1 ^ (b2 | b3) && b4 || b5 & b6;
        System.out.println("Work01:Answer: b = " + b);
    }

    static void work02Question(int v1, int v2, int v3, int v4, int v5, int v6) {

        boolean b = ((v1 << v2) < v3) != (v3 > ((v4 ^ v5) | v6));
        System.out.println("Work02:Question: b = " + b);
    }

    static void work02Answer(int v1, int v2, int v3, int v4, int v5, int v6) {

        boolean b = (v1 << v2) < v3 != v3 > (v4 ^ v5 | v6);
        System.out.println("Work02: Answer: b = " + b);
    }

    static void work03UseOfUtilityClass() {
        System.out.println("BMI: " + MyUtil.calculateBMI(60,1.7));
        System.out.println("Average(10,26,30) = " + MyUtil.average(10,26,30));
    }

    static void work04UseOfObjectClass() {

        Person p1 = new Person(456);
        Person p2 = new Person(897);
        System.out.println(p1);
        BankAccount member1 = new BankAccount(12345, p1);
        BankAccount member2 = new BankAccount(56789, p2);
        member1.deposit(10000.0);
        System.out.println(member1.getBalance());
        member1.withdraw(4000.0);
        System.out.println(member1.getBalance());
        member1.transfer(2500.0, member2);
        System.out.println(member1);
        System.out.println(member2);

    }
}
