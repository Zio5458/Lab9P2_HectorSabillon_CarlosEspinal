
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;



public class ThreadMatricula extends Thread {
    JProgressBar jpb;
    JDialog jd;
    int seconds = 0;

    public ThreadMatricula(JProgressBar jpb) {
        this.jpb = jpb;
    }

    public JProgressBar getJpb() {
        return jpb;
    }

    public void setJpb(JProgressBar jpb) {
        this.jpb = jpb;
    }
    
    @Override
    public void run() {
        while (seconds != 10000) {
            seconds++;
            jpb.setValue(jpb.getValue() + 1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadMatricula.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        JOptionPane.showMessageDialog(jd, "Matriculada correctamente");
        jd.setVisible(false);

    }

}
