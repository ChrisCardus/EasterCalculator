import javax.swing.JLabel;
import java.util.Observer;
import java.util.Observable;

/**
An observer for Easter model
*/
public class EasterView extends JLabel implements Observer
{
	private EasterModel model;
	
	/**
	Constructs an obersver
	@param model The model to be observed
	*/
	public EasterView(EasterModel model)
	{
		super();
		this.model = model;
		
		String x = "";
		
		if(model.getDay() == 1 || model.getDay() == 21 || model.getDay() == 31)
		{
			x = "st";
		} else if (model.getDay() == 2 || model.getDay() == 22)
		{
			x = "nd";
		} else if (model.getDay() == 3 || model.getDay() == 23)
		{
			x = "rd";
		} else
		{
			x = "th";
		}
		
		String[] month = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		setText("Easter will fall upon " + model.getDay() + x + " " + month[model.getMonth()-1] + " " + model.getYear());
	}
	
	/**
	Update the observer
	*/
	public void update(Observable obs, Object obj)
	{
		String x = "";
		
		if(model.getDay() == 1 || model.getDay() == 21 || model.getDay() == 31)
		{
			x = "st";
		} else if (model.getDay() == 2 || model.getDay() == 22)
		{
			x = "nd";
		} else if (model.getDay() == 3 || model.getDay() == 23)
		{
			x = "rd";
		} else
		{
			x = "th";
		}
		
		String[] month = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		setText("Easter will fall upon " + model.getDay() + x + " " + month[model.getMonth()-1] + " " + model.getYear());
	}
}
