import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.Random; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class StepSort extends PApplet {

  /* Paste the code into a new Processing sketch and complete the steps. */

  //1. create an array of ints. don't initialize it yet.
  int ints[];
  Random rand = new Random();
  public void setup() {
    //2. set the size of your window

    //  if you are using Processing 3, you cannot use variables
    //  because the developers don't know how programming is supposed to work.
    
    //3. initialize your array with the built in width variable
    ints = new int[width];
    //4. initialize the ints in the array with random numbers
    //   from 0 to the built in height variable
   for (int i = 0; i<=ints.length-1; i++)
    {
      ints[i] = rand.nextInt(height);
    }
    //5. call the noStroke() method
    noStroke();
  }
  public void draw() {

    //6. set the background color with background(r, g, b);
    background(0, 0, 20);
    //7. set the color for your graph
    color(0, 0, 0);
    //8. draw a rectangle for each int in your array.
    for (int i = 0; i<=ints.length-1; i++)
    {
      rect(i, height, 1, -ints[i]);
    }
    //   the x value will be the current index in the array
    //   the y value will the height variable
    //   the width is 1 (one)
    //   the height is negative the value of the element at the current index of the array
    //9. call the stepSort method
    stepSort(ints);

    //10. extract the code that randomizes the array into a method.
  }
  public void r()
  {
    for (int i = 0; i<=ints.length-1; i++)
    {
      ints[i] = rand.nextInt(height);
    }
  }
  //11. call the method you made in step 10 when the mouse is pressed
  public void mousePressed()
  {
    r();
  }
  void stepSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      if (arr[i - 1] > arr[i]) {
        int t = arr[i];
        arr[i] = arr[i - 1];
        arr[i - 1] = t;
      }
    }
  }
  public void settings() {  
    size(600, 600);
  }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "StepSort" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
