package com.file4.person;

import java.util.Objects;

public class Student extends Person {
    private String program;
    private int year;
    double fee;

    public Student() {
    }

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() +
                "program='" + program +
                ", year=" + year +
                ", fee=" + fee +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return year == student.year &&
                Double.compare(student.fee, fee) == 0 &&
                Objects.equals(program, student.program);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31*result + program.hashCode();
        result = 31*result + year;
        result = 31*result + (int)Double.doubleToLongBits(fee);
        return result;
    }
}

