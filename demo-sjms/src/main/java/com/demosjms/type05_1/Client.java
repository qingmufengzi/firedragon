package com.demosjms.type05_1;

public class Client {
    public static void main(String[] args) {
        InstallSoftware invoker = new InstallSoftware();
        invoker.installWizard(new Wizard());
    }
}