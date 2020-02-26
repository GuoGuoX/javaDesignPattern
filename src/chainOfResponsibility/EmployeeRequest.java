package chainOfResponsibility;

/**
 * 封装请求的基本信息
 */
public class EmployeeRequest {
    private String name;//姓名
    private int day;//请假天数
    private String reason;//请假理由

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public EmployeeRequest(String name, int day, String reason) {
        this.name = name;
        this.day = day;
        this.reason = reason;
    }
}
