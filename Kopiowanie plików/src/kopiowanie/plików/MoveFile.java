/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kopiowanie.plików;

import java.io.File;

/**
 *
 * @author Szymon
 */
public class MoveFile {
    
    String sourceDir;
    String destDir;
    
    File trDir;
    File tsDir;
    
    public MoveFile(String sourceDir, String destDir ) {
        this.sourceDir = sourceDir;
        this.destDir = destDir;
        
        trDir = new File(sourceDir);
        tsDir = new File(destDir);     
    }
    
    public int isDirEmpty () {
        return trDir.listFiles().length;
    }
    
    public int MoveFiles() {
        int count = trDir.listFiles().length;
        for(int i = 0; i<trDir.listFiles().length; ) {
            File temp = trDir.listFiles()[i];
            if(!temp.isDirectory()) {
                File tempCopy = new File(tsDir + "/" + temp.getName());
                tempCopy.delete();
                temp.renameTo(tempCopy);
            }
            System.out.print(temp.getName());
            System.out.println(i);
        }
        return count;
    }

}
