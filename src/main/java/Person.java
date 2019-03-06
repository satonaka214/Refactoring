public class Person {
    private String name;
    private Department department;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person getManager() {
        return this.department.getManager();
    }
}
