package rocket.control;

import rocket.control.api.RocketControl;
import rocket.control.api.RocketControlListener;
import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

@Component
public class RocketControlImpl implements RocketControl {

	private RocketControlListener listener;

	@Reference
	public void setListener(RocketControlListener listener) {
		this.listener = listener;
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double setSpeed(double kph) {
		// TODO Auto-generated method stub
		listener.notifySpeedChange(kph);
		return 0;
	}
}