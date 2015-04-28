import java.util.Observable;

/**
Holds an object of type Easter and notifies the observers when a change is made
*/
public class EasterModel extends Observable
{
	private Easter easter;
	
	/**
	Constructs an easter model
	@param easter The easter object
	*/
	public EasterModel(Easter easter)
	{
		this.easter = easter;
	}
	
	/**
	Return the easter object
	@return The easter object
	*/
	public Easter getEaster()
	{
		return this.easter;
	}
	
	/**
	Return the year
	@return Return the year
	*/
	public int getYear()
	{
		return easter.getYear();
	}
	
	/**
	Return the month
	@return Return the month
	*/
	public int getMonth()
	{
		return easter.getMonth();
	}
	/**
	Return the day
	@return Return the day
	*/
	public int getDay()
	{
		return easter.getDay();
	}
	
	/**
	Set the year and recalculate the date of easter
	@param year The new year
	*/
	public void setYear(int year)
	{
		easter.setYear(year);
		setChanged();
		notifyObservers();
	}
}
