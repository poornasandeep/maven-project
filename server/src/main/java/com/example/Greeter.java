
package com.example;


/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /*

	This is sandeep
 */
  public final String greet(final String someone) {

	someone = "Sandeep";
    return String.format("Hello, %s!", someone);
  }
}
