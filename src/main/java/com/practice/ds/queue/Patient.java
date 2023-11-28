package com.practice.ds.queue;

import java.util.UUID;

public class Patient implements Comparable<Patient> {
    static int MAX_PRIORITY = 5;
    static int MIN_PRIORITY = 1;
    private final String patientId;
    private final String patientName;
    private final Integer age;
    private final Integer priority;

    public Patient(String patientName, Integer patientAge) {
        this.patientName = patientName;
        this.age = patientAge;
        this.patientId = UUID.randomUUID().toString();
        this.priority = this.age < 10 || this.age > 80 ? MIN_PRIORITY : MAX_PRIORITY;

    }

    public String getPatientName() {
        return patientName;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Patient otherPatient) {
        if (this.getPriority() == null) {
            return -1;
        }
        if (this.getPriority() == otherPatient.getPriority()) {
            return 0;
        } else if (this.getPriority() > otherPatient.getPriority()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "[" +
                "patientId : '" + patientId + '\'' +
                ", patientName : '" + patientName + '\'' +
                ", age : " + age +
                ']';
    }
}
