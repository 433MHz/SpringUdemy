package pl.krystian.SpringUdemy;

public class TrackCoach implements Coach {

	private HappyFortuneService service;
	
	public String getText() {
		return "Track coach " + service.getFortune();
	}

	public void setService(HappyFortuneService service) {
		this.service = service;
	}

	
}
