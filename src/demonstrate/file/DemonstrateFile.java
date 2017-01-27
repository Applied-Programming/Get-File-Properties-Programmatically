package demonstrate.file;

import java.io.File;

class DemonstrateFile {

    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String args[]) {
        File f1 = new File("C://Users//ANIRUDDHA//Desktop//ToGet.txt");
        p("FILE NAME:" + f1.getName());
        p("PATH NAME:" + f1.getPath());
        p("ABSOLUTE PATH:" + f1.getAbsolutePath());
        p(f1.exists() ? "Exists" : "Does not exist");
        p(f1.canWrite() ? "Is writable" : "Is not writeable");
        p(f1.canRead() ? "Is readable" : "Is not readable");
        p("Is" + (f1.isDirectory() ? "" : "Not" + "a directory"));
        p(f1.isFile() ? "Is normal file" :"Might be a named pipe ");
                p(f1.isAbsolute() ? "Is absolute" : "Is not absloute");
        p("File last modified" + f1.lastModified());
        p("File size:" + f1.length() + "bytes");
    }
}

