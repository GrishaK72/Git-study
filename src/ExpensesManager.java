public class ExpensesManager{
    //Поле
    double[] expenses;

    //Методы
    void saveExpense(double moneyBeforeSalary, double expense, int day){
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses[day - 1] = expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
    }

    void findMaxExpense(){
        double maxExpense = 0;
        for (double expens : expenses) {
            if (expens > maxExpense) {
                maxExpense = expens;
            }
        }
        System.out.println("Самая большая сумма расходов на этой неделе составила " + maxExpense + " руб.");
        //    return maxExpense;
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
