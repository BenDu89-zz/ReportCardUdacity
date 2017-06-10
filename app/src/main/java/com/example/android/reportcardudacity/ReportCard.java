package com.example.android.reportcardudacity;

/**
 * Created by benjamindunisch on 10.06.17.
 */

public class ReportCard {
    /* Name of the University*/
    public static final String university = "Udacity";
    /* Math grade of the student*/
    private int mmathGrade;
    /* Biologic grade of the student*/
    private int mbioGrade;
    /* German grade of the student*/
    private int mgermanGrade;
    /* Informatics grade of the student*/
    private int minfoGrade;
    /* Sports grade of the student*/
    private int msportGrade;
    /* Name of the student*/
    private String mstudentName;

    /* Set the values for the Reportard*/
    public ReportCard(int matheGrade, int biologicGrade, int germanGrade, int informaticsGrade, int sportGrade, String studentname) {
        mmathGrade = matheGrade;
        mbioGrade = biologicGrade;
        mgermanGrade = germanGrade;
        minfoGrade = informaticsGrade;
        msportGrade = sportGrade;
        mstudentName = studentname;

    }
    /* Get the Math Grade*/
    public int getMathGrade() {
        return mmathGrade;
    }

    /* Set the Math Grade*/
    public void setMathGrade(int mathGrade) {
        this.mmathGrade = mathGrade;
    }

    /* Get the Bio Grade*/
    public int getBioGrade() {
        return mbioGrade;
    }

    /* Set the Bio Grade*/
    public void setBioGrade(int bioGrade) {
        this.mbioGrade = bioGrade;
    }

    /* Get the German Grade*/
    public int getGermanGrade() {
        return mgermanGrade;
    }

    /* Set the German Grade*/
    public void setGermanGrade(int germanGrade) {
        this.mgermanGrade = germanGrade;
    }

    /* Get the Infomatics Grade*/
    public int getInfoGrade() {
        return minfoGrade;
    }

    /* Set the Informatics Grade*/
    public void setInfoGrade(int infoGrade) {
        this.minfoGrade = infoGrade;
    }

    /* Get the Sports Grade*/
    public int getSportGrade() {
        return msportGrade;
    }

    /* Set the Sports Grade*/
    public void setSportGrade(int sportGrade) {
        this.msportGrade = sportGrade;
    }

    /* Return in a readable format*/
    @Override
    public String toString () {
        return "Name of the University: " + university + '\n' +
                "Name of the student: " + mstudentName + '\n' +
                "Math grade: " + mmathGrade + '\n' +
                "Bioligie grade: " + mbioGrade + '\n' +
                "German grade: " + mgermanGrade + '\n' +
                "Informatics grade: " + minfoGrade + '\n' +
                "Sport grade: " + msportGrade + '\n';
    }
}
