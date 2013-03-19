package project.android.imageprocessing.filter.colour;

/**
 * A exposure filter extension of RGBFilter.  
 * This filter creates the exposure effect by multiply red, green and blue values of each pixel
 * by 2^(exposure value). The alpha value of the input image is untouched.
 * @author Chris Batt
 */
public class ImageExposureFilter extends RGBFilter {

	/**
	 * Creates a ImageExposureFilter with the given adjustment to exposure.
	 * @param exposure
	 * The amount of exposure.
	 */
	public ImageExposureFilter(float exposure) {
		super((float)Math.pow(2.0, exposure), (float)Math.pow(2.0, exposure), (float)Math.pow(2.0, exposure));
	}
}
