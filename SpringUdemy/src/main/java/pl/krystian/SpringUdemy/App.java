package pl.krystian.SpringUdemy;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.krystian.SpringUdemy.BaseballCoach;
import pl.krystian.SpringUdemy.Coach;
import pl.krystian.SpringUdemy.TrackCoach;

public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Coach coach = context.getBean("myCoachBaseball", Coach.class);
    	System.out.println(coach.getText());
    	
    	Coach coach2 = context.getBean("myCoachTrack", Coach.class);
    	System.out.println(coach2.getText());
    	
    	context.close();
    }
}
