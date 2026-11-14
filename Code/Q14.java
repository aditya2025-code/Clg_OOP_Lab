package Code;
// Q14. Employee Salary
/*
Write a Java program to demonstrate method overloading using a method salary() to calculate:
Salary using basic salary.
Salary using basic salary and bonus.
Salary using basic salary, bonus, and allowance.
*/

class Q14 {
    static void salary(double basicSalary){
        System.out.println("Total Income: "+basicSalary);
    }
    static void salary(double basicSalary,double bonus){
        System.out.println("Total Income: "+(basicSalary+bonus));
    }
    static void salary(double basicSalary,double bonus,double allowance){
        System.out.println("Total Income: "+(basicSalary+bonus+allowance));
    }
    public static void main(String[] args) {
        salary(50000);
        salary(50000,20000);
        salary(50000,20000,14000);
    }
}

// OUTPUT:
/*
Total Income: 50000.0
Total Income: 70000.0
Total Income: 84000.0
*/