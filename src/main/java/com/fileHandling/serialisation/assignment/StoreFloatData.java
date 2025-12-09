package com.fileHandling.serialisation.assignment;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoreFloatData {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:/Users/pkumar16/Desktop/JAVA PRGM/Text_File/data.txt");
        DataOutputStream dos=new DataOutputStream(fos);
        float[] arr={10.2f, 23.1f, 34.9f, 38.322f, 76.3f};
        dos.writeInt(arr.length);
        for(float f:arr) dos.writeFloat(f);
        dos.close();
        fos.close();
    }
}
