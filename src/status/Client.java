package status;

public class Client {
    public static void main(String[] args) {


    Status freeStatus = new FreeStatus();
    Status bookedStatus = new BookedStatus();
    Status checkedStatus = new CheckedStatus();
    Context context = new Context();
    context.setStatus(freeStatus);
    context.setStatus(bookedStatus);
    context.setStatus(checkedStatus);
    }
}
