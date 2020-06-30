/**
 *  this project is a github test
 *  this is a comment added by fetchbeast
 */
package helloworld;

/**
 * Main executable class
 * 
 * @version 0.0.2
 * @author jimu
 */
public class HelloWorld {

	/**
	 * Prints "Hello World" and first command-line argument if any
	 * @param args name to display
	 */
	public static void main(String[] args) {
		System.out.println("Hello World" + (args.length > 0 ? " " + args[0] : ""));
	}

}
