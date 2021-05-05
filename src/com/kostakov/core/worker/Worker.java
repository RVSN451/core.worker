package com.kostakov.core.worker;

public class Worker {
    private OnTaskDoneListener callbackOn;
    private OnTaskErrorListener callbackOff;

    public Worker(OnTaskDoneListener callbackOn,  OnTaskErrorListener callbackOff) {
        this.callbackOn = callbackOn;
        this.callbackOff = callbackOff;
    }

    public void countSheep(int sheep) {
        for (int i = 1; i <= sheep; i++){
            if (i != 33) {
                callbackOn.onDone("Я считать овец: " + i + " овца пасётся..");
            } else {
                callbackOff.offDone("____________________\n" +
                        "Я считать овец: " + i + " ОВЦА ПРОПАЛА!!!!!" +
                        "\n____________________");
            }
        }
    }
}
