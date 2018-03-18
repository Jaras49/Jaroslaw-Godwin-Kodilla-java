package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCalculatorTestSuite {
    private static int testCount = 1;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Starting tests");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Tests finished");
    }
    @Before
    public void before(){
        System.out.println("Starting test number " + testCount);
    }
    @After
    public void after(){
        System.out.println("Test number " + testCount + " finished");
        testCount++;
    }

    @Test
    public void CalculateAdvStatisticsTest(){

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        statisticsCalculator.CalculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCalculator.getAvgPostsPerUser(),0);
        Assert.assertEquals(0, statisticsCalculator.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(0, statisticsCalculator.getAvgCommentsPerPost(), 0);


    }

    @Test
    public void CalculateAdvStatisticsTest1(){

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add("Jarek");
        }

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        statisticsCalculator.CalculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCalculator.getAvgPostsPerUser(),0);
        Assert.assertEquals(0, statisticsCalculator.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(0, statisticsCalculator.getAvgCommentsPerPost(), 0);

    }

    @Test
    public void CalculateAdvStatisticsTest2(){

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add("Jarek");
        }

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        statisticsCalculator.CalculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, statisticsCalculator.getAvgPostsPerUser(),0);
        Assert.assertEquals(0, statisticsCalculator.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(0, statisticsCalculator.getAvgCommentsPerPost(), 0);

    }

    @Test
    public void CalculateAdvStatisticsTest3(){

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add("Jarek");
        }

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(5000);
        //When
        statisticsCalculator.CalculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, statisticsCalculator.getAvgPostsPerUser(),0);
        Assert.assertEquals(50, statisticsCalculator.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(5, statisticsCalculator.getAvgCommentsPerPost(), 0);

    }

    @Test
    public void CalculateAdvStatisticsTest4(){

        //Given
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator();
        Statistics statisticsMock = mock(Statistics.class);
        List<String> names = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            names.add("Jarek");
        }

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(500);
        //When
        statisticsCalculator.CalculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, statisticsCalculator.getAvgPostsPerUser(),0);
        Assert.assertEquals(5, statisticsCalculator.getAvgCommentsPerUser(), 0);
        Assert.assertEquals(0.5, statisticsCalculator.getAvgCommentsPerPost(), 0);

    }
}
