import javax.swing.*;

/**
Builds all of the components needed for the GUI and initialises
*/
public class EasterComponent extends JPanel
{
	/**
	Constructs the easter component
	@param easter The easter object
	@param min The minimum year on the slider
	@param max The maximum year on the slider
	@param initial The initial position on the slider
	*/
	public EasterComponent(Easter easter, int min, int max, int initial)
	{
		super();
		
		EasterModel model = new EasterModel(easter);
		
		EasterView view = new EasterView(model);
		
		model.addObserver(view);
		
		JSlider slider = new JSlider(min, max, initial);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing((max - min) / 3);
		slider.setPaintLabels(true);
		slider.setLabelTable(slider.createStandardLabels((max - min) / 3));
		
		SliderListener listener = new SliderListener(model, slider);
		
		slider.addChangeListener(listener);
		
		add(slider);
		add(view);
	}
}
