/*#############################################
# Copyright (c) Edwards Software Technology (003041746-W)
# 
# Project : CMDRunner
# File: com.edapp.cmdrunner.Engine.java
#
# Change History ------------
# 1) V1.0-110319 | Edward | First release
# 2) V1.1-020719 | Edward | UI update, Page Credits added, Change from Runtime to ProcessBuilder, Change config location from static to dynamic.
# 3) V1.2-040719 | Edward | UI update, enabling Jframe dynamic mo# 1) Vement. Page Changes added.
# 4) V1.3-200120 | Edward | UI update, allow "Sent" button straight sa# 1) Ve after triggered. Increase input from 8 to 10.
# 5) V1.4-060220 | Edward | UI update, added Sa# 1) Ve-all button. Added tab to increase input from 10 to 20.
# 6) V2.0-120220 | Edward | UI update, enhance performance and efficiency. 
# 7) V2.1-140220 | Edward | Package update, enhance performance and efficiency. 
# 8) V2.2-010320 | Edward | Implement cross platform feature between windows and linux.
##############################################*/
package com.edapp.cmdrunner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;

public final class Engine {

    private String ENV = null;
    private String terminal = null;
    private String environment = null;
    private String prefix = null;
    private String suffix = null;
    private String USER_HOME = null;

    public Engine() {
        getEnvironment();
    }

    public void save(String command, String filename) {
        try (final FileWriter fw = new FileWriter(new File(filename + ".RUNNER"))) {
            fw.write(command);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void run(String command, String filename) {
        ProcessBuilder processBuilder = new ProcessBuilder();
        try {
            try (final FileWriter fw = new FileWriter(new File(filename + ".RUNNER"))) {
                fw.write(command);
            }
            final BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename + ".RUNNER")));
            String data = br.readLine();
            if (data.matches("(.*)dmh(.*)")) {
                if (environment.matches("(.*)WINDOWS(.*)")) {
                    final ProcessBuilder builder = new ProcessBuilder(new String[]{terminal, prefix, "start dmh_wish -notk /K"});
                    builder.redirectErrorStream(true);
                    builder.start();
                } else {
                    String dmh="\"dmh_wish -console\"";
                    processBuilder.command(terminal, dmh+"; $x");
                    System.out.println("xxxxxxxxxx" + processBuilder.command(terminal, dmh+"; $x"));
                    processBuilder.redirectErrorStream(true);
                    processBuilder.start();
                }
            } else {
                    processBuilder.command(terminal, prefix, data + suffix);
                    processBuilder.redirectErrorStream(true);
                    processBuilder.start();
                }
            System.out.println(terminal + prefix + data + suffix);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void Checksum() {
        final String text = "";
        for (int i = 1; i <= 20; ++i) {
            final String file = "CONF" + i;
            try {
                final BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file + ".RUNNER")));
                System.out.println(file + ".RUNNER FOUND");
            } catch (FileNotFoundException ex1) {
                FileWriter fw = null;
                try {
                    System.out.println(ex1);
                    fw = new FileWriter(new File(file + ".RUNNER"));
                    fw.write(text);
                    fw.close();
                } catch (IOException ex2) {
                    System.out.println(ex2);
                }
            }
        }
    }
//( "/bin/bash", "-c", "obj_browser localhost:Pic_BE1MES")

    public void getEnvironment() {
        if (ENV == null) {
            ENV = System.getProperty("os.name");
            USER_HOME = System.getProperty("user.home");
            System.out.println("Environment: " + ENV);
            System.out.println("USER_HOME: " + USER_HOME);
        }
        ENV = ENV.toUpperCase();
        if (ENV.matches("(.*)WINDOWS(.*)")) {
            System.out.println("Environment is: " + ENV);
            environment = "WINDOWS";
            terminal = "cmd.exe ";
            prefix = "/c";
            suffix = "&& dir";
        } else {
            System.out.println("Environment is: " + ENV);
            environment = "LINUX";
            terminal = "bash";
            prefix = "-c";
            suffix = "";
        }
    }
}
