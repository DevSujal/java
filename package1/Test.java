class LeaveRequest {
    private int days;

    public LeaveRequest(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}

abstract class Approver {
    protected Approver nextApprover;

    public void approverRequest(LeaveRequest request) {
        nextApprover.approverRequest(request);
    }

    public void setNext(Approver approver) {
        this.nextApprover = approver;
    }
}

class TeamLeader extends Approver {

    public void approverRequest(LeaveRequest request) {
        if (request.getDays() <= 5) {
            System.out.println("your leave request was approved by Team Leader for " + request.getDays() + " days");
        } else {
            super.approverRequest(request);
        }
    }
}

class Manager extends Approver {
    public void approverRequest(LeaveRequest request) {
        if (request.getDays() > 5 && request.getDays() <= 15) {
            System.out.println("your leave request was approved by manager for " + request.getDays() + " days");
        } else {
            super.approverRequest(request);
        }
    }
}

class Owner extends Approver {
    public void approverRequest(LeaveRequest request) {
        if (request.getDays() > 15) {
            System.out.println("your leave request was approved by Owner for " + request.getDays() + " days");
        } else {
            System.out.println("You entered wrong days or wrong number");
        }
    }
}

public class Test {
    public static void main(String[] args) {

        Approver teamleader = new TeamLeader();
        Approver manager = new Manager();
        Approver owner = new Owner();

        teamleader.setNext(manager);
        manager.setNext(owner);

        teamleader.approverRequest(new LeaveRequest(30));
        teamleader.approverRequest(new LeaveRequest(4));
        teamleader.approverRequest(new LeaveRequest(14));

    }
}