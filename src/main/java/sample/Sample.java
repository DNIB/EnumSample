package sample;

import sample.controller.SampleController;

public class Sample {

    public static void main(String[] args) {
        System.out.print("Hello World! ");

        SampleController sampleController = new SampleController();

        sampleController.index("operator tester");
        sampleController.store("operator tester");
        sampleController.update("operator tester");
        sampleController.delete("operator tester");
    }
}
