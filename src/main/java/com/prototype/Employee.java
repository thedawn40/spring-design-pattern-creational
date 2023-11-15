package com.prototype;

public class Employee {

    private String id;
    private String name;
    private Position position;
    private Long salary;
    
    public void setSalary(Long salary) {
        this.salary = salary;
    }
    public void setPosition(Position position) {
        this.position = position;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }public Long getSalary() {
        return salary;
    }
    public Position getPosition() {
        return position;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", position=" + position + ", salary=" + salary + "]";
    }

    
}
