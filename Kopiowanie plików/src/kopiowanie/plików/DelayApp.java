/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kopiowanie.plików;

import java.util.Calendar;

/**
 *
 * @author Szymon
 */
public class DelayApp extends Thread{
    
    int delay;
    MoveFile moveApp;
    private javax.swing.JTextArea jTextArea1=null;
    
    public DelayApp (String sourceDir, String destDir, int delay) {
        this.moveApp = new MoveFile( sourceDir,destDir);
        this.delay = delay;
    }
    
    public DelayApp (String sourceDir, String destDir, int delay, javax.swing.JTextArea jTextArea1) {
        this.moveApp = new MoveFile( sourceDir,destDir);
        this.delay = delay;
        this.jTextArea1 = jTextArea1;
    }
    
    public void runApp (){  
        
            if (moveApp.isDirEmpty()>0) {
                Calendar clock1 = Calendar.getInstance();
                if (!(jTextArea1 == null))
                    jTextArea1.append(clock1.getTime() + "\n" +
                            "Przekopiowano " +
                            Integer.toString(moveApp.MoveFiles()) +
                            " plików\n");
            }
        
    }

    @Override
    public void run() {
        while (true){
            runApp();
                try {
                Thread.currentThread().sleep(delay*1000);
            }
            catch (InterruptedException e){
                break;
            }
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
