package timeMAnagmentmain;

import timeMAnagment.Time;

public class TImeMain {
public static void main(String[] args) {
	Time t1=new Time();
	t1.Settime(1,30 );
	t1.showtime();
	Time t2 =new Time();
	t2.Settime(2, 23);
	Time t3 =t2.sum(t1);
	t3.showtime();
	
}
}
