package com.practice.ds.queue;

public class PriorityPatientCheckup {

    Patient[] patients = new Patient[100];
    int front = 0;
    int rear = 0;

    public static void main(String[] args) {
        PriorityPatientCheckup ppc = new PriorityPatientCheckup();
        Patient p = new Patient("Raja", 9);
        ppc.registerPatient(p);
        Patient p1 = new Patient("Roni", 8);
        ppc.registerPatient(p1);
        Patient p2 = new Patient("Rajat", 17);
        ppc.registerPatient(p2);
        Patient p3 = new Patient("Raman", 32);
        ppc.registerPatient(p3);
        Patient p4 = new Patient("Pulkit", 89);
        ppc.registerPatient(p4);
        ppc.visitDoctor();
        Patient p5 = new Patient("Pran", 6);
        ppc.visitDoctor();
        ppc.registerPatient(p5);
        ppc.visitDoctor();
        ppc.visitDoctor();
        ppc.visitDoctor();
        ppc.visitDoctor();
        ppc.visitDoctor();
    }

    void registerPatient(Patient p) {
        if (rear == 0 || p.getPriority() != 1) {
            patients[rear++] = p;
        } else {
            int pos = getQueuePosition(p);
            patients[pos] = p;
            rear++;
        }
    }

    int getQueuePosition(Patient p) {
        for (int i = front; i < rear; i++) {
            if (patients[i].getPriority() > p.getPriority()) {
                for (int j = rear; j >= i; j--) {
                    patients[j + 1] = patients[j];
                }
                return i;
            }
        }
        return rear;
    }


    void visitDoctor() {
        if (front >= rear) {
            System.out.println("All patient has visited");
            return;
        }
        System.out.println("Visiting patient " + patients[front]);
        front++;
    }


}
