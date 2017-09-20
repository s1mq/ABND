package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * ReportCard is a class for one subject, Estonian language. It tracks four grades (quarter 1 grade, etc.
 * throughout a school year. It contains getter and setter methods for these grades. It also
 * includes a method to calculate the average grade for this subject and a toString() method.
 */

public class ReportCard {

    /**
     * Arraylist storing Estonian grades
     */
    private ArrayList<Integer> mEstonianGrades = new ArrayList<Integer>();

    /**
     * Average grade of the subject for the year
     */
    private double mEstonianAverage;

    /**
     * Integers to save index values to quarters
     */
    private int mQ1Grade = 0;
    private int mQ2Grade = 1;
    private int mQ3Grade = 2;
    private int mQ4Grade = 3;


    /**
     * Constructor for building the ReportCard object
     *
     * @param q1Estonian quarter one grade
     * @param q2Estonian quarter two grade
     * @param q3Estonian quarter three grade
     * @param q4Estonian quarter four grade
     */
    public ReportCard(int q1Estonian, int q2Estonian, int q3Estonian, int q4Estonian) {

        mEstonianGrades.add(mQ1Grade, q1Estonian);
        mEstonianGrades.add(mQ2Grade, q2Estonian);
        mEstonianGrades.add(mQ3Grade, q3Estonian);
        mEstonianGrades.add(mQ4Grade, q4Estonian);

    }

    /**
     * Setter methods to set the quarter grades values
     */
    public void setQ1Grade(int grade) {
        mEstonianGrades.set(mQ1Grade, grade);
    }

    public void setQ2Grade(int grade) {
        mEstonianGrades.set(mQ2Grade, grade);
    }

    public void setQ3Grade(int grade) {
        mEstonianGrades.set(mQ3Grade, grade);
    }

    public void setQ4Grade(int grade) {
        mEstonianGrades.set(mQ4Grade, grade);
    }

    /**
     * Getter methods to get the quarter grades values
     */
    public int getQ1Grade() {
        return (mEstonianGrades.get(mQ1Grade));
    }

    public int getQ2Grade() {
        return (mEstonianGrades.get(mQ2Grade));
    }

    public int getQ3Grade() {
        return (mEstonianGrades.get(mQ3Grade));
    }

    public int getQ4Grade() {
        return (mEstonianGrades.get(mQ4Grade));
    }

    /**
     * Method to calculate average grade for Estonian
     * I am using a while loop because I know I need to repeat this loop for only four times,
     * because that is the number of quarters in an Estonian school year
     */
    public double getAverage() {
        mEstonianAverage = 0.0;
        int i = 0;
        while (i < mEstonianGrades.size()) {
            mEstonianAverage = mEstonianAverage + mEstonianGrades.get(i);
            i++;
        }
        mEstonianAverage = mEstonianAverage / mEstonianGrades.size();
        return mEstonianAverage;
    }

    @Override
    public String toString() {
        return "\tEstonian language\n\nQuarter 1: " + mEstonianGrades.get(mQ1Grade) +
                "\nQuarter 2: " + mEstonianGrades.get(mQ2Grade) +
                "\nQuarter 3: " + mEstonianGrades.get(mQ3Grade) +
                "\nQuarter 4: " + mEstonianGrades.get(mQ4Grade) +
                "\n\nYearly average: " +
                mEstonianAverage;

    }
}

