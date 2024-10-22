package models;

public class Expense {
    public String items;
    public  String description;
    public  String category;
    public  double amount;

    public Expense(String items, String description, String category, double amount) {
        this.items = items;
        this.description = description;
        this.category = category;
        this.amount = amount;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
