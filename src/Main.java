package main;
import models.AbsenceOfMembers;
import models.Expense;
import models.TaskManagement;

public class Main {
    public static void main(String[] args) {
        AbsenceOfMembers members=new AbsenceOfMembers("Ryan","Cousion",123);
        System.out.println("Member Details:");
        System.out.println("Name:" + members.getName());
        System.out.println("Relation:" +members.getRelation());
        System.out.println("Address:" + members.getAddress());

        Expense expense=new Expense("Groceries","Weekly grocery shopping","Food",1200);
        System.out.println("Expense Details:");
        System.out.println("Items:"+expense.getItems());
        System.out.println("Amount:"+expense.getAmount());
        System.out.println("Description:"+expense.getDescription());
        System.out.println("Category:"+expense.getCategory());

        TaskManagement task=new TaskManagement("Project Report","Complete the project report",01-03-12);
        System.out.println("Task Details:");
        System.out.println("Task name:"+task.getNameofTask());
        System.out.println("Task description:"+task.getDescriptionofTask());
        System.out.println("Deadline:"+task.getDeadlinefTask());


    }
}