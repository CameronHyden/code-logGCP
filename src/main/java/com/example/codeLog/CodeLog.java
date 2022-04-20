package com.example.codeLog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CodeLog {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String problemImage;
    private String summary;
    private String solutionImage;
    private String solutionSummary;

    public CodeLog(){

    }

    public CodeLog(int id, String title, String problemImage, String summary, String solutionImage, String solutionSummary) {
        this.id = id;
        this.title = title;
        this.problemImage = problemImage;
        this.summary = summary;
        this.solutionImage = solutionImage;
        this.solutionSummary = solutionSummary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProblemImage() {
        return problemImage;
    }

    public void setProblemImage(String problemImage) {
        this.problemImage = problemImage;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSolutionImage() {
        return solutionImage;
    }

    public void setSolutionImage(String solutionImage) {
        this.solutionImage = solutionImage;
    }

    public String getSolutionSummary() {
        return solutionSummary;
    }

    public void setSolutionSummary(String solutionSummary) {
        this.solutionSummary = solutionSummary;
    }
}
