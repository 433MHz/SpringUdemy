package pl.krystian.SpringUdemy;


public class BaseballCoach implements Coach{

	private HappyFortuneService fortuneService;
	
	public String getText() {
		return "Baseball coach " + fortuneService.getFortune();
	}
	
	
	BaseballCoach(HappyFortuneService service){
		this.fortuneService = service;
	}

}
