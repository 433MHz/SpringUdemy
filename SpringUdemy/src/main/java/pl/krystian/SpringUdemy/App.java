package pl.krystian.SpringUdemy;


import pl.krystian.SpringUdemy.BaseballCoach;
import pl.krystian.SpringUdemy.Coach;
import pl.krystian.SpringUdemy.TrackCoach;

public class App 
{
    public static void main( String[] args )
    {
    	Coach coach = new BaseballCoach();
    	System.out.println(coach.getText());
    	
    	coach = new TrackCoach();
    	System.out.println(coach.getText());
    }
}
