package rocket.control.api;

import aQute.bnd.annotation.ProviderType;

@ProviderType
public interface RocketControl {
	double getSpeed();

	double setSpeed(double kph);
}