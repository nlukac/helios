package de.uni_hd.giscience.helios.core.scanner;

import de.uni_hd.giscience.helios.core.Asset;

public class FWFSettings extends Asset {

	public Integer numTimeBins = 100;
	public Integer numFullwaveBins = 200;
	public Double minEchoWidth = 2.5;
	public Double peakEnergy = 500.0;
	public Double apartureDiameter = 0.15;
	public Double scannerEfficiency = 0.9;
	public Double atmosphericVisibility = 0.9;
	public Double scannerWaveLength = 1550.0;

	public FWFSettings() {

	}

	//Copy constructor:
	public FWFSettings(FWFSettings other) {
		
		if (other == null) return;
		
		this.numTimeBins = other.numTimeBins;
		this.numFullwaveBins = other.numFullwaveBins;
		this.minEchoWidth = other.minEchoWidth;
		this.peakEnergy = other.peakEnergy;
		this.apartureDiameter = other.apartureDiameter;
		this.scannerEfficiency = other.scannerEfficiency;
		this.atmosphericVisibility = other.atmosphericVisibility;
		this.scannerWaveLength = other.scannerWaveLength;
	}
}