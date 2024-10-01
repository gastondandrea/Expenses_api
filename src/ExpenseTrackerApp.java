import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpenseTrackerApp {
    public static void main(String[] args){
        System.out.println("Bienvenido");
        //Creo el usuario 1
        User user1 = new User("Gaston","gastondandrea@gmail.com");
        //Creo la categoria 1
        Category category1 = new Category("Panaderia", "Categoria de panaderia");
        //Creo una fecha
        Date date1 = new Date();
        //Creo un gasto 1
        Expense expense1 = new Expense(30, "Pan", category1, date1 );

        //Obtengo el nombre del usuario 1
        String name = user1.getName();
        System.out.print("El usuario1 es: ");
        System.out.println(name);

        //Le agrego al usuario 1 el gasto 1
        user1.addExpense(expense1);

        //Obtengo la lista de gastos del usuario1
        List<Expense> expensesUser1 = user1.getExpenses();

        //imprimo el indice del gasto1
        int indice = expensesUser1.get(0).getId();
        System.out.println("El indice del gasto 1 es: " + indice);

       //Creo una fecha2
        Date date2 = new Date();
        //Creo un gasto 2
        Expense expense2 = new Expense(55, "Bizcochos", category1, date2 );

        //Le agrego al usuario 1 el gasto 2
        user1.addExpense(expense2);

        //imprimo el indice del gasto2
        int indice2 = expensesUser1.get(1).getId();
        System.out.println("El indice del gasto 2 es: " + indice2);

        //Imprimo en pantalla la lista de gastos del usuario 1
        System.out.print("El usuario: " + name + " tiene los siguientes gastos: ");
        System.out.println(expensesUser1);

        //Intento borrar un gasto inexistente
        try {
            user1.removeExpense(2);
        }catch(ExpenseNotFoundException e) {
            System.out.println(e.getMessage());
        }

        //Imprimo en pantalla la lista de gastos del usuario 1
        System.out.print("El usuario: " + name + " tiene los siguientes gastos:");
        System.out.println(expensesUser1);

        ExpenseValidator validator = new AmountValidator();
        boolean isValid = validator.validate(expense1);
        System.out.println("¿Es válido el gasto? " + isValid);
    }
}