package rocket.control.api;

import aQute.bnd.annotation.ConsumerType;

@ConsumerType
public interface RocketControlListener {
	void notifySpeedChange(double speed);
}
