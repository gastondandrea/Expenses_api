import java.util.ArrayList;

public class User {
    private String name;
    private String email;
    private ArrayList<Expense> expenses;

    // Constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.expenses = new ArrayList<>();
    }

    // Getters y Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Expense> getExpenses() {
        return expenses;
    }


    // Add, update and remove expenses
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void updateExpense(int index, Expense updateExpense) throws ExpenseNotFoundException{
        try {
            expenses.set(index, updateExpense);
        } catch (Exception e){
            throw new ExpenseNotFoundException("No se pudo actualizar el gasto. Indice " + index + " no fue encontrado.");
        }
    }

    public void removeExpense(int index) throws ExpenseNotFoundException{
        try {
            expenses.remove(index);
        } catch (Exception e){
            throw new ExpenseNotFoundException("No se pudo eliminar el gasto. Indice " + index + " no fue encontrado.");
        }
    }

}
