# HELIOS-FWF
HELIOS-FWF (ver. 0.1) - Full-WaveForm experimental implementation within the Heidelberg LiDAR Operations Simulator.

### Features

The following FWF features are included to the latest FWF HELIOS build:
 - BRDF reflectane model
 - Gaussian decomposition to extract echo peaks (intensity,width,return number)
 
Future features will include:
 - More sophisticated atmospheric scattering model
 - Per-scanner based input waveform profile of the outgoing pulse
 
### Configuration variables (for \<FWFSettings \> in \<survey\> XML file)
 - numTimeBins (integer) - Number of bins to discretize the temporal domain of individual return.
 - numFullwaveBins (integer) - Total number of bins to discretize the entire temporal domain of FWF signal.
 - minEchoWidth (double) - Minimum echo return width [ns].
 - peakEnergy (double) - Scanner's peak emitting energy [W].
 - apertureDiameter (double) - Scanner's aperture diameter [m].
 - atmosphericVisbility (double) - Decrease of intensity due atmospheric scattering. Within range of [0, 1].
 - scannerEfficiency (double) - Efficiency of the scanner. Within range of [0, 1]. 
 - scannerWaveLength (double) - Scanner operating wavelength [ns].
