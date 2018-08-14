package com.ufa.mall;

import junit.framework.TestResult;
import junit.framework.TestSuite;
import org.junit.Test;

public class TestSuite4 {

    @Test
    public void testSuiteRun(){
        TestSuite testSuite = new TestSuite(TestJunit4.class);
        TestResult testResult = new TestResult();
        testSuite.run(testResult);
        System.out.println("----------" + testResult);
    }
}
