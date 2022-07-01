public class ExpensesManager{
    //Поле
    double[] expenses;

    //Методы
    double saveExpense(double moneyBeforeSalary, double expense, int day){

        //expenses[day - 1] = expense;
        if (expenses[day - 1] == 0.0) {
            expenses[day - 1] = expense;
        } else {
            expenses[day - 1] = expenses[day - 1] + expense;
        }
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void findMaxExpense(){

        double maxExpense = 0.0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        System.out.println("Самая большая сумма расходов на этой неделе составила " + maxExpense + " руб.");
    }

    void printAllExpenses (){
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
        }
    }

    //Конструктор
    ExpensesManager(){
        expenses = new double[7];
    }

}