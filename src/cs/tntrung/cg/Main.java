package cs.tntrung.cg;


import cs.tntrung.cg.model.Receipt;
import cs.tntrung.cg.services.ReceiptServices;

import cs.tntrung.cg.views.*;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
//        Login.login ();
//        String filepath = "D:/CODEGYM/MODULE_3/CaseStudy/StudentManageDH/src/main/webapp/images/video.jpg";
        String pathname="D:/CODEGYM/MODULE_3/CaseStudy/StudentManageDH/src/main/webapp/images/video.avif";
        File file=new File(pathname);


        String mimetype = Files.probeContentType(file.toPath());
        System.out.println (mimetype);
//mimetype should be something like "image/png"

        if (mimetype != null && mimetype.split("/")[0].equals("image")) {
            System.out.println("it is an image");
        }
    }
}

