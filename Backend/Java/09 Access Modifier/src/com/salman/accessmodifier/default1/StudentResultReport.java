package com.salman.accessmodifier.default1;

class ResultReport {
    void generateReport() {
        Student s = new Student();

        s.stuName = "Salman";
        s.calculatePercentage(new int[] {34, 56, 78});

        s.displayResult(); 
    }
}
