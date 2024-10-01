import java.util.List;

public interface ExpenseManager<T> {
    double calculateTotal(List<T> expenses);
    T findMaxExpense(List<T> expenses);
}