package com.tw;
import java.util.*;
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        Score score = new Score();
        ScoreTool scoreTool = new ScoreTool();//分数工具类
        do {
            String str1 = "1. 添加学生";
            String str2 = "2. 生成成绩单";
            String str3 = "3. 退出";
            String str4 = "请输入你的选择（1～3）：";

            System.out.println(str1);
            System.out.println(str2);
            System.out.println(str3);
            System.out.println(str4);
//            Scanner Sc = new Scanner(System.in);

//            Score score = new Score();
//            ScoreTool scoreTool = new ScoreTool();//分数工具类

//        while(Sc.hasNextLine())
//        {
            //添加学生成绩
            if (Sc.nextLine().equals("1")) {
                System.out.println("请输入学生信息（格式：姓名, 学号, 学科: 成绩, ...）");
                // String str=null;
                // while (Sc.hasNextLine()) {

                String s = Sc.nextLine();
                String result = AddStudent(s, score, scoreTool);
                System.out.println(result);
//                    String[] str = s.split(",");
//                    String reg = "[\\u4e00-\\u9fa5]+";
//                    if (str[0].matches(reg) && str[1].matches("\\d+") && str[2].matches("^[-\\+]?[.\\d]*$")
//                            && str[3].matches("^[-\\+]?[.\\d]*$") && str[4].matches("^[-\\+]?[.\\d]*$") && str[5].matches("^[-\\+]?[.\\d]*$")) {
//                        score.name = str[0];
//                        score.id = Integer.parseInt(str[1]);
//                        score.MathGrade = Double.parseDouble(str[2]);
//                        score.ChineseGrade = Double.parseDouble(str[3]);
//                        score.EnglishGrade = Double.parseDouble(str[4]);
//                        score.CodeGrade = Double.parseDouble(str[5]);
//                        //
//
//                        scoreTool.setScoreData(score);
//                        System.out.println("学生" + score.name + "的成绩被添加");
//                    } else {
//                        System.out.println("请按正确的格式输入（格式：姓名, 学号, 学科: 成绩, ...）");
//                    }


                // continue;
            }
            //   }
            //打印学生成绩
            if (Sc.nextLine().equals("2")) {
                System.out.println("请输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交");
                //String s = Sc.nextLine();
                PrintStudent(scoreTool);
//                for (Score s : scoreTool.scoreData) {
//                    int Sid = s.id;
//                    if ((Sid + "").matches("\\d+")) {
//                        System.out.println("成绩单");
//                        System.out.println("姓名|数学|语文|英语|编程|平均分|总分");
//                        System.out.println("========================");
//                        scoreTool.DisplayScoreData(scoreTool.scoreData);
//                    } else {
//                        System.out.println("请按正确的格式输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交");
//                    }
//
//                }

            }

//
//        }
        } while (Sc.hasNextLine());
    }

    public static String AddStudent(String input, Score score, ScoreTool scoreTool) {
        String[] str = input.split(",");
        String reg = "[\\u4e00-\\u9fa5]+";
        if (str[0].matches(reg) && str[1].matches("\\d+") && str[2].matches("^[-\\+]?[.\\d]*$")
                && str[3].matches("^[-\\+]?[.\\d]*$") && str[4].matches("^[-\\+]?[.\\d]*$") && str[5].matches("^[-\\+]?[.\\d]*$")) {
            score.name = str[0];
            score.id = Integer.parseInt(str[1]);
            score.MathGrade = Double.parseDouble(str[2]);
            score.ChineseGrade = Double.parseDouble(str[3]);
            score.EnglishGrade = Double.parseDouble(str[4]);
            score.CodeGrade = Double.parseDouble(str[5]);
            //

            scoreTool.setScoreData(score);
            String res1 = "学生" + score.name + "的成绩被添加";
            return res1;
            // System.out.println("学生" + score.name + "的成绩被添加");
        } else {
            String res2 = "请按正确的格式输入（格式：姓名, 学号, 学科: 成绩, ...）";
            return res2;
            // System.out.println("请按正确的格式输入（格式：姓名, 学号, 学科: 成绩, ...）");
        }
    }

    public static void PrintStudent(ScoreTool scoreTool) {

        for (Score s : scoreTool.scoreData) {
            int Sid = s.id;
            if ((Sid + "").matches("\\d+")) {
                System.out.println("成绩单");
                System.out.println("姓名|数学|语文|英语|编程|平均分|总分");
                System.out.println("========================");
                scoreTool.DisplayScoreData(scoreTool.scoreData);
            } else {
                System.out.println("请按正确的格式输入要打印的学生的学号（格式： 学号, 学号,...），按回车提交");
            }

        }

    }
}