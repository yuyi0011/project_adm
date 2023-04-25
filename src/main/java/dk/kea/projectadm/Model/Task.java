package dk.kea.projectadm.Model;

public class Task {
    private int id;
    private String taskName;
    private double hour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public Task(int id, String taskName, double hour){
        this.id=id;
        this.taskName=taskName;
        this.hour=hour;
    }

}
