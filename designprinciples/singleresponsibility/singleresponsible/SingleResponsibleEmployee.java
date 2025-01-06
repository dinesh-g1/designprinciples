package singleresponsibility.singleresponsible;

/**
 * Employee only manages the attributes
 */
public class SingleResponsibleEmployee {
    private final String name;
    private final String code;
    private final String roleType;

    public SingleResponsibleEmployee(String name, String code, String roleType) {
        this.name = name;
        this.code = code;
        this.roleType = roleType;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getRoleType() {
        return roleType;
    }
}
