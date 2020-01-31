package com.company;

public class Command {
    private String line;
    private int column;

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Command command = (Command) o;

        if (column != command.column) return false;
        return line != null ? line.equals(command.line) : command.line == null;
    }

    @Override
    public int hashCode() {
        int result = line != null ? line.hashCode() : 0;
        result = 31 * result + column;
        return result;
    }

    @Override
    public String toString() {
        return "Command{" +
                "line='" + line + '\'' +
                ", column=" + column +
                '}';
    }
}
