
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;



public class ThreadMatricula extends Thread {
    JProgressBar jpb;
    JDialog jd;
    JDialog jd2;
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

    public JDialog getJd() {
        return jd;
    }

    public void setJd(JDialog jd) {
        this.jd = jd;
    }

    public JDialog getJd2() {
        return jd2;
    }

    public void setJd2(JDialog jd2) {
        this.jd2 = jd2;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
    
    @Override
    public void run() {
        while (seconds != 10) {
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
        jd2.pack();
        jd2.setModal(true);
        jd2.setVisible(true);

    }

}
