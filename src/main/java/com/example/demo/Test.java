package com.example.demo;

import java.io.IOException;

class Test {
    public static void main(String[] args) throws IOException {

        String script = System.getenv("SCRIPTNAME");
        if (script != null) {
            // BAD: The script to be executed is controlled by the user.
            Runtime.getRuntime().exec(script);
        }
    }
}