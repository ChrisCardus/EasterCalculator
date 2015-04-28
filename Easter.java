/**
Takes a year and calculates the day and month on which easter will fall
*/
public class Easter
{
	private int day;
	private int month;
	private int year;
	
	/**
	Creates an object of type Easter with the date of easter on a given year
	@param year The year used to calculate the day and month of easter
	*/
	public Easter(int year)
	{
		int a = year % 19;
		int b = (int)Math.floor(year / 100);
		int c = year % 100;
		int d = (int)Math.floor(b / 4);
		int e = b % 4;
		int f = (int)Math.floor((b + 8) / 25);
		int g = (int)Math.floor((b - f + 1) / 3);
		int h = ((19 * a) + b - d - g + 15) % 30;
		int i = (int)Math.floor(c / 4);
		int k = c % 4;
		int l = (32 + (2 * e) + (2 * i) - h - k) % 7;
		int m = (int)Math.floor((a + (11 * h) + (22 * l)) / 451);
		this.month = (int)Math.floor((h + l - (7 * m) + 114) / 31);
		this.day = ((h + l - (7 * m) + 114) % 31) + 1;
		this.year = year;
	}
	
	public String toString()
	{
		return "Easter will fall upon " + day + " " + month + " " + year;
	}
	
	/**
	Return the day field
	*/
	public int getDay()
	{
		return this.day;
	}
	
	/**
	Return the month field
	*/
	public int getMonth()
	{
		return this.month;
	}
	
	/**
	Return the year field
	*/
	public int getYear()
	{
		return this.year;
	}
	
	/**
	Sets the year to be calculated and recalculates the day and the month
	@param year The new year to be used in the calculation
	*/
	public void setYear(int year)
	{
		int a = year % 19;
		int b = (int)Math.floor(year / 100);
		int c = year % 100;
		int d = (int)Math.floor(b / 4);
		int e = b % 4;
		int f = (int)Math.floor((b + 8) / 25);
		int g = (int)Math.floor((b - f + 1) / 3);
		int h = ((19 * a) + b - d - g + 15) % 30;
		int i = (int)Math.floor(c / 4);
		int k = c % 4;
		int l = (32 + (2 * e) + (2 * i) - h - k) % 7;
		int m = (int)Math.floor((a + (11 * h) + (22 * l)) / 451);
		this.month = (int)Math.floor((h + l - (7 * m) + 114) / 31);
		this.day = ((h + l - (7 * m) + 114) % 31) + 1;
		this.year = year;
	}
}
