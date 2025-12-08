package command;

import mvc.DrawingModel;
import mvc.Shape;

public class RemovePointCmd implements Command {

	private Shape shape;
	private DrawingModel model;
	
	public RemovePointCmd(Shape shape, DrawingModel model) {
		this.shape = shape;
		this.model = model;
	}

	@Override
	public void execute() {
		model.remove(shape);

	}

	@Override
	public void unexecute() {
		model.add(shape);

	}

}
