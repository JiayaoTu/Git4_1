package com.tw;
import java.util.*;
public class ScoreTool {

    List<Score> scoreData=new ArrayList<>();

    public void setScoreData(Score score)
    {//添加成绩类到成绩数组中
        scoreData.add(score);
    }

    public  List<Score> getScoreData() { //返回学生数组
        return scoreData;
    }

    public void DisplayScoreData(List<Score> scoreData)
    {
        for(Score s:scoreData)
        {
            String str=s.name+"|"+s.MathGrade+"|"+s.ChineseGrade+"|"+ s.EnglishGrade+"|"+
                    s.CodeGrade+"|"+s.AverageScore()+"|"+s.ScoreSum();
            System.out.println(str);
        }
    }
}
