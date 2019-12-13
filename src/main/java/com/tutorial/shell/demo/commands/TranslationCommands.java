package com.tutorial.shell.demo.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.Locale;

@ShellComponent
public class TranslationCommands {


    @ShellMethod("This is a custom command.")
    public void sayHello(@ShellOption(help = "id") String id,
                                @ShellOption(help = "param") String param) {
        System.out.println("hello world");
    }

    @ShellMethod("This is a custom command 2.")
    public int add(@ShellOption(help = "number 1")int a, @ShellOption(help = "number 2")int b) {

        return a + b;
    }

}
