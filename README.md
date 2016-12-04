# HELIOS-FWF
HELIOS-FWF (ver. 0.1) - Full-WaveForm experimental implementation within the Heidelberg LiDAR Operations Simulator.

### Features

The following FWF features are included to the latest FWF HELIOS build:
 - BRDF reflectane model
 - Gaussian decomposition to extract multiple echo returns (point coordinates,intensity,width,return number)
 
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

### Output point format

point.x point.y point.z intensity echoWidth FWFIndex returnNumber objectId

- point (double) - Coordinates of 3D captured points from echo returns in FWF signal.
- intensity (double) - Intensity of the return [W].
- echoWidth (double) - The full width at half maximum of the echo-return [ns].
- FWFIndex (integer) - The index of the FWF signal.
- returnNumber (integer) - The corresponding return number.
- objectId (string) - The id of the hit object.

### Output FWF format

FWFIndex beamOrigin.x beamOrigin.y beamOrigin.z beamDir.x beamDir.y beamDir.z maxTime gpsTime FWFIntensities

- FWFIndex (integer) - The index of the FWF signal (in order to match corresponding points)
- beamOrigin (double) - 3D point of the beam's origin.
- beamOrigin (double) - 3D vector of the beam's direction.
- maxTime (double) - Time [ns] at maximum distance the beam has reached.
- gpsTIme (integer) - Simulated GPS time.
- FWFIntensities (double) - Intensities of the entire FWF signal. Number defined with numFullwaveBins.
