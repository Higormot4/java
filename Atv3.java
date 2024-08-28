
package com.mycompany.atv3;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;


public class Atv3 {

    public static void main(String[] args) {
               
        int dia, mes, ano;
        
       dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento: " ));
       mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de nascimento: " ));
       ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento: " ));
       
        
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();
        
        Period periodo = Period.between(dataNascimento, hoje);
        int idade = periodo.getYears();
        
        if (idade < 18) {
                    JOptionPane.showMessageDialog(null, "Você é menor de idade");
        } else if (idade == 18) {
                    JOptionPane.showMessageDialog(null ,"Você atingiu a maioridade" );
        } else if (idade >= 60) {
                   JOptionPane.showMessageDialog(null, "Você é idoso");
        } else {
                    JOptionPane.showMessageDialog(null, "Você tem " + idade +  " anos");
        }
       
    }
}
