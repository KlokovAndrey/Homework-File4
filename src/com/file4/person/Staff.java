package com.file4.person;

import java.util.Objects;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff() {
    }

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" +
                super.toString() +
                "school='" + school +
                ", pay=" + pay +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Staff staff = (Staff) o;
        return Double.compare(staff.pay, pay) == 0 &&
                Objects.equals(school, staff.school);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31*result + school.hashCode();
        result = 31*result + (int)Double.doubleToLongBits(pay);
        return result;

    }
}
