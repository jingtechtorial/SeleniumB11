package TESTNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngASSERTION {
    //create one method that takes two parameter and return the
    //multiplication of these numbers.
    public double getmultiple(double number1,double number2){
        return number1*number2;
    }
    @Test
    public void validatemultiplication(){
        double actualresult=getmultiple(5,6);
        double expectedresult=30;
        Assert.assertEquals(actualresult,expectedresult,"my numbers are 5 and 6");
    }
    @Test
    public double getdivision(double number3,double number4){
        if(number3>number4){
            return number3/number4;
        }
        return number4/number3;
    }
    public int substraction(int number1,int number2){
        if(number1>number2){
            return number1-number2;

        }
        return number2-number1;
    }
    @Test
    public void validateDivison(){
        double actualResult=getdivision(8,2);
        double expected=4;
        Assert.assertEquals(actualResult,expected,"my number 8 and 2");

    }
    @Test
    public void validatesubtraction(){
        int actual=substraction(65,43);
        int expected=22;
        Assert.assertEquals(actual,expected);
        int actuated=substraction(70,50);
        int expected1=20;
        Assert.assertEquals(actuated,expected1);
    }
}
