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

            Widget[] widgets = Widget.widgets;

            for (Widget widget : widgets) {
                if (widget != null) {
                    if (widget.children != null) {
                        bw.write("Dump for interface: " + widget.id);
                        bw.newLine();
                        for (int i = 0; i < widget.children.length; i++) {
                            Widget childWidget = Widget.widgets[i];
                            bw.write("Child #" + i +  " \tChild ID: " + widget.children[i] + "\tParent Id: " + widget.parentId + "\tWidget Type: " + childWidget.type + "\tChild X: " + widget.childX[i] + "\tChild Y: " + widget.childY[i]);
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

    public static void printInterfaceData2() {
        try{
            File file = new File(Signlink.findcachedir() + "/interfaceDump-diff.txt");
            System.out.println(file.getAbsolutePath());
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            Widget[] widgets = Widget.widgets;

            for (Widget widget : widgets) {
                if (widget != null) {
                    if (widget.children != null) {
                        bw.write("Interface: " + widget.id);
                        bw.write("\n|\n");
                        for (int i = 0; i < widget.children.length; i++) {
                            Widget childWidget = Widget.widgets[i];

                            int containerIndex = -1;
                            int previousContainerIndex = -1;

                            if (childWidget.type == 0) {
                                previousContainerIndex = containerIndex;
                                containerIndex = i;
                            }

                            if (childWidget.type == 0 && Widget.widgets[containerIndex].type == 0) {
                                bw.write("|---- Child ID: " + widget.children[i]
                                        + "\tParent Id: " + widget.parentId
                                        + "\tWidget Type: " + childWidget.type
                                        + "\tChild X: " + widget.childX[i]
                                        + "\tChild Y: " + widget.childY[i]);
                                bw.newLine();
                                if (widget.children.length > 1)
                                    bw.write("    |\n");
                            } else {
                                bw.write("    |---- Child ID: " + widget.children[i]
                                        + "\tParent Id: " + widget.parentId
                                        + "\tWidget Type: " + childWidget.type
                                        + "\tChild X: " + widget.childX[i]
                                        + "\tChild Y: " + widget.childY[i]);
                                bw.newLine();
                            }

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
