public class AmountValidator implements ExpenseValidator {
        @Override
        public boolean validate(Expense expense) {
            return expense.getAmount() > 0;
        }
}
