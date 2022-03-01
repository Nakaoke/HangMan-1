import java.util.*;
import java.io.*;

public class Gallow {

  private String body_parts[] = { "head", "neck", "body", "left_arm", "right_arm", "left_leg", "right_leg" };

  protected ArrayList<String> alHeadGallow = null;
	protected ArrayList<String> alNeckGallow = null;
  protected ArrayList<String> alBodyGallow = null;
  protected ArrayList<String> alRightArmGallow = null;
  protected ArrayList<String> alLeftArmGallow = null;
  protected ArrayList<String> alLeftLegGallow = null;
  protected ArrayList<String> alRightLegGallow = null;
  // HashMap<String,ArrayList> hmGallow = new HashMap();
  // Constructor
  public Gallow() {
    // read in all the body part from the text file

  }

  protected ArrayList<String> readGallowFile(String filename) {
    ArrayList<String> alGallow = new ArrayList<String>();
    try {
      File myObj = new File(filename);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine().toUpperCase();
        alGallow.add(data);
        // System.out.println(data);
      }
      myReader.close();
    } catch (Exception e) {
      e.printStackTrace();
    }

    return alGallow;
  }

  protected void printHead() {
    // ArrayList<String> alParts = hmGallow;
    if (alHeadGallow == null) {
      alHeadGallow =           
      readGallowFile("bodyparts/head.txt");
    }
    for (int i = 0; i < alHeadGallow.size(); i++) {
      System.out.println(alHeadGallow.get(i));
    }
  }

  protected void printNeck() {
    if (alNeckGallow == null) {
      alNeckGallow =         
      readGallowFile("bodyparts/neck.txt");
    }
    for (int i = 0; i < alNeckGallow.size(); i++) {
      System.out.println(alNeckGallow.get(i));
    }
  }

  protected void printBody() {
    if (alBodyGallow == null) {
      alBodyGallow = 
     readGallowFile("bodyparts/body.txt");
    }
    for (int i = 0; i < alBodyGallow.size(); i++) {
      System.out.println(alBodyGallow.get(i));
      }
  }


  protected void printRightArm() {
 if (alRightArmGallow == null) {
      alRightArmGallow = 
     readGallowFile("bodyparts/right_arm.txt");
    }
    for (int i = 0; i < alRightArmGallow.size(); i++) {
      System.out.println(alRightArmGallow.get(i));
      }
  }
  

  protected void printLeftArm() {
    if (alLeftArmGallow == null) {
      alLeftArmGallow = 
     readGallowFile("bodyparts/left_arm.txt");
    }
    for (int i = 0; i < alLeftArmGallow.size(); i++) {
      System.out.println(alLeftArmGallow.get(i));
      }


  }

  protected void printRightLeg() {
  if (alRightLegGallow == null) {
      alRightLegGallow = 
     readGallowFile("bodyparts/right_leg.txt");
    }
    for (int i = 0; i < alRightLegGallow.size(); i++) {
      System.out.println(alRightLegGallow.get(i));
      }
  }

  protected void printLeftLeg() {
    if (alLeftLegGallow == null) {
      alLeftLegGallow = 
     readGallowFile("bodyparts/left_leg.txt");
    }
    for (int i = 0; i < alLeftLegGallow.size(); i++) {
      System.out.println(alLeftLegGallow.get(i));
      }
  }

  public void printGallow(String body_part) {
    if (body_part.compareToIgnoreCase("head") == 0) {
      printHead();
      return;
    }
    
    if (body_part.compareToIgnoreCase("neck") == 0) {

      printNeck();
      return; 
    }
    if (body_part.compareToIgnoreCase("left_arm") == 0) {
      printLeftArm();
      return;
    }
    if (body_part.compareToIgnoreCase("right_arm") == 0) {
      printRightArm();
      return;
    }
    if (body_part.compareToIgnoreCase("left_leg") == 0) {
      printLeftLeg();
      return;
    }
    if (body_part.compareToIgnoreCase("body") == 0){
      printBody();
      return;
    }
      
    if (body_part.compareToIgnoreCase("right_leg") == 0) {
      printRightLeg();
      return;
    }
  }

  public static void main(String[] args) {
    Gallow gallow = new Gallow();
     gallow.printGallow("head"); 
    gallow.printGallow("neck");
    //gallow.printGallow("body");
     gallow.printGallow("left_arm");
     gallow.printGallow("right_arm");
     gallow.printGallow("left_leg");
     gallow.printGallow("right_leg");
  }
  // readFile ?
  // printGallow ?
}







