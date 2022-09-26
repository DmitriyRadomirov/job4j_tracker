package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (key.equals(value[index])) {
                rsl = index;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
        return rsl;
    }

    public static class ElementNotFoundException extends Exception {
        public ElementNotFoundException(String message) {
            super(message);
        }

        public static void main(String[] args) {
            try {
                String[] strings = {"AAA", "BBB", "SSS"};
                indexOf(strings, "SSS");
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}


