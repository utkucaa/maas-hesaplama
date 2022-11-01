public class Employee {
        String name;
        double salary;
        int workHours;
        int hireYear;

        Employee(String name,double salary,int workHours,int hireYear){
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
        }

        double tax(){

            if(this.salary < 1000){
                return 0;
            }else{
                double tax = salary * 0.3;
                return tax;
            }

        }

        int bonus(){
            if(workHours > 40){
                int bonus = (workHours - 40)*30;
                return bonus;
            }
            return 0;
        }

        double raiseSalary(){
            if(hireYear<=0 || hireYear>2021){
                System.out.println("geçersiz çalışma yılı girdiniz,tekrar kontrol ediniz.");
            }else{
                int farkYil = 2021 - hireYear;
                double zam;

                if(farkYil>0 && farkYil<10){
                    zam = salary * 0.05;
                    return zam;
                }else if(farkYil>9 && farkYil<20){
                    zam = salary * 0.1;
                    return zam;
                }else if(farkYil>19){
                    zam = salary * 0.15;
                    return zam;
                }else if(farkYil == 0){
                    return 0;
                }

            }

            return 0;
    }


       public String toString(){

            double total = salary - tax() + bonus() + raiseSalary();
            double tot = salary + bonus() - tax();
            System.out.println("adı :" +name);
            System.out.println("maaş :" +salary);
            System.out.println("çalışma saati :" +workHours);
            System.out.println("başlangıç yılı :" +hireYear);
            System.out.println("vergi :" +tax());
            System.out.println("bonus :" +bonus());
            System.out.println("maaş artışı :" +raiseSalary());
            System.out.println("vergi ve bonuslar ile birlikte maaş :" +tot);
            System.out.println("toplam maaş :" +total);

           return null;

        }
}
