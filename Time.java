package dgsw_java;

public class Time
{
	private int hour;
	private int minute;
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) {
			System.out.println("시간을 잘못 입력하셨습니다.");
			return;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	private int second;
}

class TimeEx
{
	public static void main(String[] args)
	{
		Time t1 = new Time();
		System.out.println(t1.getHour());
		
		t1.setHour(30);
		System.out.println(t1.getHour());
	}
}