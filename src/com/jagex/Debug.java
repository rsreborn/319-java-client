package com.jagex;

import com.jagex.sign.Signlink;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Debug {

    public static void printInterfaceData() {
        try{
            File file = new File(Signlink.findcachedir() + "/interfaceDump.txt");
            System.out.println(file.getAbsolutePath());
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            for (Widget widget : Widget.widgets) {
                if (widget != null) {
                    if (widget.children != null) {
                        bw.write("Dump for interface: " + widget.id + "");
                        bw.newLine();
                        for (int i = 0; i < widget.children.length; i++) {
                            bw.write("Child #" + i + "     Child ID: " + widget.children[i] + "    Child X: " + widget.childX[i] + "    Child Y: " + widget.childY[i] + "");
                            bw.newLine();
                        }
                        bw.newLine();
                        bw.newLine();
                        bw.newLine();
                        bw.newLine();
                    }
                }
            }
            bw.close();
        } catch (Exception e) {
        }
    }
}
