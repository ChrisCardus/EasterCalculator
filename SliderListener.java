import javax.swing.event.*;
import javax.swing.JSlider;

/**
Listens to the slider and updates the model when the slider is changed
*/
public class SliderListener implements ChangeListener
{
	private EasterModel model;
	private JSlider slider;
	
	/**
	Constructs the listener
	@param model The model which the slider effects
	@param slider The slider that is listened too
	*/
	public SliderListener(EasterModel model, JSlider slider)
	{
		this.model = model;
		this.slider = slider;
	}
	
	/**
	Updates the value of the model based on the slider
	*/
	public void stateChanged(ChangeEvent e)
	{
		int value = slider.getValue();
		model.setYear(value);
	}
}
