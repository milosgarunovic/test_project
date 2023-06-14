package inheritance.employee;

public class Manager extends Employee {

    private int teamSize;

    public Manager(String name, int yearsOfExperience, int teamSize) {
        super(name, yearsOfExperience);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void scheduleAMeeting() {
        System.out.println("meeting time");
    }

    @Override
    public void sayYourName() {
        System.out.println("I'm a manager and my name is " + name);
    }

    @Override
    public String toString() {
        return super.toString() + "Manager{" +
                "teamSize=" + teamSize +
                '}';
    }

}
