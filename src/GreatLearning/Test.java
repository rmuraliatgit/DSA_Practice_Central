package GreatLearning;

public class Test

{

    private int data = 5;



    public int getValue()

    {

        return this.data;

    }

    public int getValue(int value)

    {

        return (data+1);

    }

    public int getValue(int... value)

    {

        return  (data+2);

    }



    public static void main(String[] args)

    {

        Test temp = new Test();

        System.out.println(temp.getValue(7, 8, 12));

    }

}