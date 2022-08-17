package timeMAnagment;

public class Time {
	int hours;
	int minutes;

public 	void Settime (int hours,int minutes) {
	this.hours=hours;
	this.minutes =minutes;
	
	}
 public void showtime() {
	System.out.printf("hours and ,minutes is:"+hours,+ minutes );
	
 }
 public Time sum(Time time) {
	Time t =new Time();
	int totalhours =this.hours+this.hours;
	int totalMinutes =this.minutes +this.minutes;
   Settime(totalhours, totalMinutes );
   return time;
   
}
}
