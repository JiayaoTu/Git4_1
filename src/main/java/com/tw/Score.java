package com.tw;

public class Score {
    public String name;
    public int id;
    public double MathGrade, ChineseGrade, EnglishGrade, CodeGrade;

    Score() {

    }

    public Score(String name, int id, double MathGrade, double ChineseGrade,
                   double EnglishGrade, double CodeGrade) {
        this.name = name;
        this.id = id;
        this.MathGrade = MathGrade;
        this.ChineseGrade = ChineseGrade;
        this.EnglishGrade = EnglishGrade;
        this.CodeGrade = CodeGrade;
    }

    public double ScoreSum()
    {
        return MathGrade+ChineseGrade+EnglishGrade+CodeGrade;
    }

    public double AverageScore()
    {
        return (MathGrade+ChineseGrade+EnglishGrade+CodeGrade)/4;

    }

//    public String[] GetScoreArray(Score score)
//    {
//        String []str=null;
//
//    }
}
