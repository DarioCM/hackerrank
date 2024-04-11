package com.example.universitiesapp.solution;

public class University {

    private String university;
    private Integer rank_display;
    private Integer score;
    private String type;
    private Integer student_faculty_ratio;
    private Integer international_students;
    private Integer faculty_count;



    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Integer getRank_display() {
        return rank_display;
    }

    public void setRank_display(Integer rank_display) {
        this.rank_display = rank_display;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStudent_faculty_ratio() {
        return student_faculty_ratio;
    }

    public void setStudent_faculty_ratio(Integer student_faculty_ratio) {
        this.student_faculty_ratio = student_faculty_ratio;
    }

    public Integer getInternational_students() {
        return international_students;
    }

    public void setInternational_students(Integer international_students) {
        this.international_students = international_students;
    }

    public Integer getFaculty_count() {
        return faculty_count;
    }

    public void setFaculty_count(Integer faculty_count) {
        this.faculty_count = faculty_count;
    }

    @Override
    public String toString() {
        return "University{" +
                "university='" + university + '\'' +
                ", rank_display=" + rank_display +
                ", score=" + score +
                ", type='" + type + '\'' +
                ", student_faculty_ratio=" + student_faculty_ratio +
                ", international_students=" + international_students +
                ", faculty_count=" + faculty_count +
                '}';
    }
}
