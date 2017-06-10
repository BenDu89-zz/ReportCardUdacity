package com.example.android.reportcardudacity;

/**
 * Created by benjamindunisch on 10.06.17.
 */

public class ReportCard {
    /* Math grade of the student*/
    private int mathGrade;
    /* Biologic grade of the student*/
    private int bioGrade;
    /* German grade of the student*/
    private int germanGrade;
    /* Informatics grade of the student*/
    private int infoGrade;
    /* Sports grade of the student*/
    private int sportGrade;
    /* Name of the student*/
    private String studentName;
    /* Name of the University*/
    public static final String university = "Udacity";

    /* Set the values for the Reportard*/
    public ReportCard(int MatheGrade, int BiologicGrade, int GermanGrade, int InformaticsGrade, int SportGrade, String Studentname) {
        mathGrade = MatheGrade;
        bioGrade = BiologicGrade;
        germanGrade = GermanGrade;
        infoGrade = InformaticsGrade;
        sportGrade = SportGrade;
        studentName = Studentname;

    }
    /* Get the Math Grade*/
    public int getmathGrade() {
        return mathGrade;
    }
    /* Get the Bio Grade*/
    public int getbioGrade() {
        return bioGrade;
    }
    /* Get the German Grade*/
    public int getgermanGrade() {
        return germanGrade;
    }
    /* Get the Infomatics Grade*/
    public int getinfoGrade() {
        return infoGrade;
    }
    /* Get the Sports Grade*/
    public int getsportGrade() {
        return sportGrade;
    }
    /* Set the Bio Grade*/
    public void setBioGrade(int bioGrade) {
        this.bioGrade = bioGrade;
    }
    /* Set the German Grade*/
    public void setGermanGrade(int germanGrade) {
        this.germanGrade = germanGrade;
    }
    /* Set the Informatics Grade*/
    public void setInfoGrade(int infoGrade) {
        this.infoGrade = infoGrade;
    }
    /* Set the Math Grade*/
    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }
    /* Set the Sports Grade*/
    public void setSportGrade(int sportGrade) {
        this.sportGrade = sportGrade;
    }
    /* Return in a readable format*/
    @Override
    public String toString () {
        return "Name of the student: " + studentName + '\n' +
                "Math grade: " + mathGrade + '\n' +
                "Bioligie grade: " + bioGrade + '\n' +
                "German grade: " + germanGrade + '\n' +
                "Informatics grade: " + infoGrade + '\n' +
                "Sport grade: " + sportGrade + '\n';
    }
}
