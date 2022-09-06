package memoria.app;

import memoria.model.trabalho;

import javax.swing.*;

public class app {
    public static void main(String[] args) {
        trabalho tra;
        tra = new trabalho();
int ass;
        for(int x = 0;x < 20; x++){
ass = Integer.parseInt(JOptionPane.showInputDialog("Ponha um valor"));
            tra.setTrabalhador (ass);
            if (ass == 0) {
                break;
            }
        }
        System.out.println(tra.getTrabalhador());

    }

}
