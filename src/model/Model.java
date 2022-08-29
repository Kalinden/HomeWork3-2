package model;

public class Model {
   public String name;
   public String modelName;
   public String color;
   public int date;

   public void modelInfo(){
       System.out.printf("Name : %s\nmodelname : %s\ncolor : %s\ndate : %d\n",name,modelName,color,date);
   }
   public static class Specs {
      public static final int HP = 152;
      public static String type = "Coupe";
      public static double engine = 2.4;
      String transmission = "AT";

      public void SpecInfo(){
         System.out.printf("Class: %s\nTransmission: %s\nEngine: %f\nHP: %d\n",type,transmission,engine,HP);
      }
   }
   public static class Size {
      int width;
      int height;
      int length;
      public  Size(int length , int height, int width){
         this.width = width;
         this.height = height;
         this.length = length;
         System.out.println("Length " + length +" Width "+width + " Height "+ height );
      }
   }
}

