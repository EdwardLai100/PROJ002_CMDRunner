/*#############################################
# Author : Edward Lai
# Project : CMDRunner
##############################################*/
package com.edapp.cmdrunner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Engine {

    private String env;
    private String terminal;
    private String environment;
    private String prefix;
    private String suffix;
    private String userHome;
    private String userName;
    private String directory;
    private boolean _debug = true;

    public Engine() {
        //Perform initialization on the environment and update local variable
        initEnvironment();
    }

    public void save(String command, String filename) {
        try (final FileWriter fw = new FileWriter(new File(filename + ".RUNNER"))) {
            fw.write(command);
        } catch (IOException ex) {
        }
    }

    public void run(String command, String file) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        try {
            try (final FileWriter fw = new FileWriter(new File(directory + file + ".RUNNER"))) {
                fw.write(command);
            }
            final BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(directory + file + ".RUNNER")));
            String data = br.readLine();
            processBuilder.command(terminal, prefix, data + suffix);
            processBuilder.redirectErrorStream(true);
            processBuilder.start();

            if (_debug) {
                System.out.println(terminal + prefix + data + suffix);
            }
        } catch (IOException ex) {
        }
    }

    public void initFile(int max) {
        File cmdRunnerDir = new File(directory);
        if (!cmdRunnerDir.exists()) {
            boolean created = cmdRunnerDir.mkdirs();
            if (!created) {
                System.out.println("Failed to create directory: " + directory);
                return;
            }
        }

        for (int i = 1; i <= max; ++i) {
            final String file = "CONF" + i;
            try {
                final BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(directory + file + ".RUNNER")));
            } catch (FileNotFoundException ex1) {
                FileWriter fw = null;
                try {
                    fw = new FileWriter(new File(directory + file + ".RUNNER"));
                    fw.write(""); //Init empty file
                    fw.close();
                } catch (IOException ex2) {
                }
            }
        }
    }

    public void initEnvironment() {
        env = System.getProperty("os.name");
        userHome = System.getProperty("user.home");
        userName = System.getProperty("user.name");

        if (env.toUpperCase().matches("(.*)WINDOWS(.*)")) {
            directory = "C:\\CMDRunner\\";
            environment = "WINDOWS";
            terminal = "cmd.exe ";
            prefix = "/c";
            suffix = "&& dir";
        } else {
            directory = "/home/" + userName + "/CMDRunner";
            environment = "LINUX";
            terminal = "bash";
            prefix = "-c";
            suffix = "";
        }
        if (_debug) {
            System.out.println("Environment is: " + env);
        }
    }

    public String getFilePath() {
        return directory;
    }
}
