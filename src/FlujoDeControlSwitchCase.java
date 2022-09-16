import javax.swing.*;

public class FlujoDeControlSwitchCase {

    public static void main(String[] args) {

        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Capture el mes como 1-12: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog(null, "Capture el año: "));
        int dias= 0;
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                mes=30;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                mes=31;
                break;
            case 2:
                 if(anio % 400 == 0 || ((anio % 4==0) &&!(anio % 100 ==0))){
                        mes=29;
                    }else {
                        mes=28;
                    }
                }
                JOptionPane.showMessageDialog(null,"El mes tiene " + mes + " dias");
        }
}

