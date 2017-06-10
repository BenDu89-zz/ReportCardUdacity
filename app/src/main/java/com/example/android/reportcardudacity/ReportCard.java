package com.example.android.reportcardudacity;

/**
 * Created by benjamindunisch on 10.06.17.
 */

public class ReportCard {
    /* Name of the University*/
    public static final String university = "Udacity";
    /* Math grade of the student*/
    private int mMathGrade;
    /* Biologic grade of the student*/
    private int mBioGrade;
    /* German grade of the student*/
    private int mGermanGrade;
    /* Informatics grade of the student*/
    private int mInfoGrade;
    /* Sports grade of the student*/
    private int mSportGrade;
    /* Name of the student*/
    private String mStudentName;

    /* Set the values for the Reportard*/
    public ReportCard(int mathGrade, int biologicGrade, int germanGrade, int informaticsGrade, int sportGrade, String studentname) {
        this.mMathGrade = mathGrade;
        this.mBioGrade = biologicGrade;
        this.mGermanGrade = germanGrade;
        this.mInfoGrade = informaticsGrade;
        this.mSportGrade = sportGrade;
        this.mStudentName = studentname;
    }
    /* Get the Math Grade*/
    public int getMathGrade() {
        return mMathGrade;
    }

    /* Set the Math Grade*/
    public void setMathGrade(int mathGrade) {
        this.mMathGrade = mathGrade;
    }

    /* Get the Bio Grade*/
    public int getBioGrade() {
        return mBioGrade;
    }

    /* Set the Bio Grade*/
    public void setBioGrade(int bioGrade) {
        this.mBioGrade = bioGrade;
    }

    /* Get the German Grade*/
    public int getGermanGrade() {
        return mGermanGrade;
    }

    /* Set the German Grade*/
    public void setGermanGrade(int germanGrade) {
        this.mGermanGrade = germanGrade;
    }

    /* Get the Infomatics Grade*/
    public int getInfoGrade() {
        return mInfoGrade;
    }

    /* Set the Informatics Grade*/
    public void setInfoGrade(int infoGrade) {
        this.mInfoGrade = infoGrade;
    }

    /* Get the Sports Grade*/
    public int getSportGrade() {
        return mSportGrade;
    }

    /* Set the Sports Grade*/
    public void setSportGrade(int sportGrade) {
        this.mSportGrade = sportGrade;
    }

    /* Return in a readable format*/
    @Override
    public String toString () {
        return "Name of the University: " + university + '\n' +
                "Name of the student: " + mStudentName + '\n' +
                "Math grade: " + mMathGrade + '\n' +
                "Bioligie grade: " + mBioGrade + '\n' +
                "German grade: " + mGermanGrade + '\n' +
                "Informatics grade: " + mInfoGrade + '\n' +
                "Sport grade: " + mSportGrade + '\n';
    }
}
