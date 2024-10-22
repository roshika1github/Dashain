package models;

public class TaskManagement {
    public String NameofTask;
    public String DescriptionofTask;
    public int DeadlinefTask;

    public TaskManagement(String nameofTask, String descriptionofTask, int deadlinefTask) {
        NameofTask = nameofTask;
        DescriptionofTask = descriptionofTask;
        DeadlinefTask = deadlinefTask;
    }

    public String getNameofTask() {
        return NameofTask;
    }

    public void setNameofTask(String nameofTask) {
        NameofTask = nameofTask;
    }

    public String getDescriptionofTask() {
        return DescriptionofTask;
    }

    public void setDescriptionofTask(String descriptionofTask) {
        DescriptionofTask = descriptionofTask;
    }

    public int getDeadlinefTask() {
        return DeadlinefTask;
    }

    public void setDeadlinefTask(int deadlinefTask) {
        DeadlinefTask = deadlinefTask;
    }
}

