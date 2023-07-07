import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JPanel rootPanel;
    private JTextField TextField;
    private JButton Igual;
    private JButton Mas;
    private JButton Menos;
    private JButton X;
    private JButton C;
    private JButton raiz;
    private JButton Boton7;
    private JButton Boton4;
    private JButton Boton1;
    private JButton MasMenos;
    private JButton Retroceder;
    private JButton Boton8;
    private JButton Boton5;
    private JButton Boton2;
    private JButton Boton0;
    private JButton Division;
    private JButton Boton9;
    private JButton Boton6;
    private JButton Boton3;
    private JButton Decimal;
    private JButton Seno;
    private JButton Coseno;
    private JButton Tangente;
    private JButton Salir;

    double a, b, resultado;
    String op;

    public Calculadora() {

        C.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               TextField.setText("");
            }
        });
        Boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + Boton7.getText());
            }
        });
        Boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + Boton8.getText());
            }
        });
        Boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + Boton9.getText());
            }
        });
        Boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + Boton4.getText());
            }
        });
        Boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + Boton5.getText());
            }
        });
        Boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + Boton6.getText());
            }
        });
        Boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + Boton1.getText());
            }
        });
        Boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + Boton2.getText());
            }
        });
        Boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + Boton3.getText());
            }
        });
        Boton0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextField.setText(TextField.getText() + Boton0.getText());
            }
        });
        MasMenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(TextField.getText().contains(".")){
                    double pm = Double.parseDouble(TextField.getText());
                    pm = pm * (-1);
                    TextField.setText(String.valueOf(pm));
                }else{
                    long PM = Long.parseLong(TextField.getText());
                    PM = PM * (-1);
                    TextField.setText(String.valueOf(PM));
                }
            }
        });
        Decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!TextField.getText().contains(".")){
                    TextField.setText(TextField.getText() + Decimal.getText());
                }
            }
        });
        Mas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TextField.getText());
                op = "+";
                TextField.setText("");
            }
        });
        Menos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TextField.getText());
                op = "-";
                TextField.setText("");
            }
        });
        X.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TextField.getText());
                op = "*";
                TextField.setText("");
            }
        });
        Division.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TextField.getText());
                op = "/";
                TextField.setText("");
            }
        });
        Retroceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;
                if(TextField.getText().length() > 0){
                    StringBuilder strB = new StringBuilder(TextField.getText());
                    strB.deleteCharAt(TextField.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    TextField.setText(backspace);
                }
            }
        });
        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TextField.getText());
                resultado = Math.sqrt(a);
                TextField.setText(String.valueOf(resultado));
            }
        });
        Seno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TextField.getText());
                resultado = Math.sin(a);
                TextField.setText(String.valueOf(resultado));
            }
        });
        Coseno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TextField.getText());
                resultado = Math.cos(a);
                TextField.setText(String.valueOf(resultado));
            }
        });
        Tangente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(TextField.getText());
                resultado = Math.tan(a);
                TextField.setText(String.valueOf(resultado));
            }
        });
        Igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(TextField.getText());
                if (op == "+") {
                    resultado = a + b;
                    TextField.setText(String.valueOf(resultado));
                } else if (op == "-") {
                    resultado = a - b;
                    TextField.setText(String.valueOf(resultado));
                } else if (op == "*") {
                    resultado = a * b;
                    TextField.setText(String.valueOf(resultado));
                } else if (op == "/") {
                    resultado = a / b;
                    if (b == 0) {
                        TextField.setText(String.valueOf("No se puede dividir entre 0"));
                    } else {
                        TextField.setText(String.valueOf(resultado));
                    }
                }
            }
        });

        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
