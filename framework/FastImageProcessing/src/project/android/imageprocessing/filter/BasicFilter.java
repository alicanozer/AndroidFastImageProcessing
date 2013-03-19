package project.android.imageprocessing.filter;

import project.android.imageprocessing.input.GLTextureOutputRenderer;
import project.android.imageprocessing.output.GLTextureInputRenderer;

/**
 * A basic filter that takes a texture as input and produces a texture as output.  
 * This class is a base class that can be extended to use custom vertex or fragment shaders.
 * This class by itself is relatively useless because it will simpily produce the input texture 
 * as the output texture.
 * @author Chris Batt
 */
public class BasicFilter extends GLTextureOutputRenderer implements GLTextureInputRenderer {
	
	/* (non-Javadoc)
	 * @see project.android.imageprocessing.output.GLTextureInputRenderer#newTextureReady(int, project.android.imageprocessing.input.GLTextureOutputRenderer)
	 */
	@Override
	public void newTextureReady(int texture, GLTextureOutputRenderer source) {
		texture_in = texture;
		width = source.getWidth();
		height = source.getHeight();
		super.onDrawFrame();
	}
	
}
