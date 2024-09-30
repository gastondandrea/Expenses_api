import java.util.Date;

public class Expense {
    private final int id;
    private double amount;
    private Date date;
    private Category category;
    private String description;
    private static int counter = 1;

    //Constructor
    public Expense(double amount, String description, Category category, Date date) {
        this.id = counter;
        this.amount = amount;
        this.description = description;
        this.category = category;
        this.date = date;
        counter ++;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}




