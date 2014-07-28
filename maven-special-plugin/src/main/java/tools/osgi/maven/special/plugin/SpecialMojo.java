package tools.osgi.maven.special.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;

/**
 * @goal exploded 
 * @execute lifecycle="specialcycle" phase="special"
 *
 */
public class SpecialMojo extends AbstractMojo {
   public void execute() throws MojoExecutionException {
      getLog().info( "doing nothing here" );
   }
}