package car;

import model.Model;


public class Main extends Model {
    public static void main(String[] args) {
        Model car = new Model();
        car.color = "Grey";
        car.name = "Dodge";
        car.modelName = "Stratus";
        car.date = 2004;
        car.modelInfo();
        Model.Specs sp = new Model.Specs();
        sp.SpecInfo();
        Model.Size Si = new Model.Size(4856,1356,1786);}}