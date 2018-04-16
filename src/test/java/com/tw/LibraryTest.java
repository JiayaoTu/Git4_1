package com.tw;

import org.junit.Test;

import java.util.LinkedList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LibraryTest {

    @Test
    public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test
    public void testMockClass() throws Exception {
        // you can mock concrete classes, not only interfaces
        LinkedList mockedList = mock(LinkedList.class);

        // stubbing appears before the actual execution
        String value = "first";
        when(mockedList.get(0)).thenReturn(value);

        assertEquals(mockedList.get(0), value);

    }

    @Test
    public void testAddStudent() {
        Library library=new Library();
        String input1="张三,1,22,33,44,55";
        String output1="学生张三的成绩被添加";

        String input2="李四,2,33,44,55,e";
        String output2="请按正确的格式输入（格式：姓名, 学号, 学科: 成绩, ...）";

        Score score=new Score();
        ScoreTool scoreTool=new ScoreTool();

        assertEquals(output1,library.AddStudent(input1,score,scoreTool));
        assertEquals(output2,library.AddStudent(input2,score,scoreTool));

    }
}
