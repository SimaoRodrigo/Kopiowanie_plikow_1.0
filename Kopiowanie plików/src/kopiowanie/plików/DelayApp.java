/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kopiowanie.plików;

/**
 *
 * @author Szymon
 */
public class DelayApp implements Runnable{
    
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
        moveApp.MoveFiles();
        //jTextArea1.append()
                //Integer.toString());
    }

    @Override
    public void run() {
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
