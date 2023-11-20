import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SportFacility {
	

	private Map<String, Boolean> timeTable;
	private int closingHours;
	private int openingHours;
	// private DatabaseController DBController;
	private List<Review> allReviews;

	public SportFacility(int openingHours, int closingHours){
		this.openingHours = openingHours;
		this.closingHours = closingHours;
		this.timeTable = new HashMap<>();
		this.allReviews = new ArrayList<>();
	}

	public void book(String dateHour) {
		if(timeTable.containsKey(dateHour) && timeTable.get(dateHour)){
			//print or return upto booking class
			System.out.println("Sorry, this time slot is already booked.");
			return;
		}
		timeTable.put(dateHour, true);
		System.out.println("Booking Successful for facility" + dateHour);
	}

	public void cancel(String dateHour) {
		
	}

}