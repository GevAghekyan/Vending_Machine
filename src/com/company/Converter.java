package com.company;

public class Converter {

    public static Command convertInputToCommand(String s) {
        String[] strings = s.split(":");
        Command command = new Command();
        command.setLine(strings[0]);
        command.setColumn(Integer.valueOf(strings[1]) - 1);
        return command;
    }
}
