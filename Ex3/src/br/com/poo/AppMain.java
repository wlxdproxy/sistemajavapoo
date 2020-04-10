package br.com.poo;

import br.com.poo.model.Contador;
import javax.swing.JOptionPane;
import br.com.poo.model.Ponto2D;

public class AppMain {
    public static void main (String[] args){
        int OpcaoCriar, OpcaoMov, OpcaoContador, OpcaoPonto, OpcaoMain;

        do{
            // Exibe o menu principal do sistema
            OpcaoMain = Integer.parseInt(JOptionPane.showInputDialog("[ Menu Principal ]\n" +
                    "1 - Acessa o sistema Contador\n" +
                    "2 - Acessa o sistema de Ponto2D\n" +
                    "0 - Sair da Aplicação"));
            switch (OpcaoMain){
                case 1:
                    // Menu do sub sistema Contador
                    do{
                        OpcaoContador = Integer.parseInt(JOptionPane.showInputDialog("[ Contador ]\n" +
                                "1 - Exibir o valor atual do contador\n" +
                                "2 - Incrementar o contador\n" +
                                "3 - Zerar o contador\n" +
                                "4 - Voltar ao menu principal\n" +
                                "0 - Sair da aplicação"));

                        // Analisa a opção selecionada
                        switch (OpcaoContador){
                            case 1:
                                JOptionPane.showMessageDialog(null, "Valor do contador: " + Contador.RetornarContador());
                                break;
                            case 2:
                                Contador.Incrementar();
                                JOptionPane.showMessageDialog(null, "Você incrementou uma unidade ao contador!");
                                break;
                            case 3:
                                Contador.ZerarContador();
                                JOptionPane.showMessageDialog(null, "O contador foi zerado!");
                                break;
                            case 4:
                                OpcaoContador = 0;
                                break;
                            case 0:
                                JOptionPane.showMessageDialog(null, "Aplicação encerrada com sucesso!");
                                OpcaoMain = OpcaoContador;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcao inválida, tente novamente!");
                        }
                    } while(OpcaoContador != 0);
                    break;
                case 2:
                    // Menu do sub sistema Ponto2D
                    do{
                        OpcaoPonto = Integer.parseInt(JOptionPane.showInputDialog("[ Ponto2D ]\n" +
                                "1 - Criar um Ponto2D\n" +
                                "2 - Movimentar um Ponto2D\n" +
                                "3 - Comparar Pontos semanticamente\n" +
                                "4 - Representação do Ponto2D por String\n" +
                                "5 - Calcular distancia entre Pontos\n" +
                                "6 - Clonar um Ponto\n" +
                                "7 - Voltar ao menu principal\n" +
                                "0 - Sair da aplicação"));

                        switch (OpcaoPonto){
                            case 1:
                                do {
                                    OpcaoCriar = Integer.parseInt(JOptionPane.showInputDialog("[ Menu Principal ]\n" +
                                            "1 - Criar um Ponto2D na Origem?\n" +
                                            "2 - Criar um Ponto2D passando as posições de X e Y?\n" +
                                            "3 - Criar um Ponto2D a partir de outro Ponto2D?\n" +
                                            "0 - Voltar ao Menu anterior"));
                                    switch (OpcaoCriar){
                                        case 1:
                                            Ponto2D PontoOrigem = new Ponto2D();
                                            JOptionPane.showMessageDialog(null, "Ponto criado na origem!\n" + PontoOrigem);
                                            break;
                                        case 2:
                                            double PosX = Double.parseDouble(JOptionPane.showInputDialog("Informe a posição X do Ponto:"));
                                            double PosY = Double.parseDouble(JOptionPane.showInputDialog("Informe a posição Y do Ponto:"));
                                            Ponto2D PontoIndicado = new Ponto2D(PosX, PosY);

                                            JOptionPane.showMessageDialog(null, "Ponto criado a partir das informações passadas!\n" + PontoIndicado);
                                            break;
                                        case 3:
                                            Ponto2D PontoPrincipal = new Ponto2D(5.5, 2.5);
                                            Ponto2D PontoSec = new Ponto2D(PontoPrincipal);

                                            JOptionPane.showMessageDialog(null, "O Ponto a seguir foi criado a partir de um ponto pre definido no codigo," +
                                                    " favor visualizar o codigo!\n" + PontoSec);
                                            break;
                                        case 0:
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!");
                                    }

                                } while(OpcaoCriar != 0);
                                break;
                            case 2:
                                do{
                                    OpcaoMov = Integer.parseInt(JOptionPane.showInputDialog("[ Ponto2D ]\n" +
                                            "1 - Movimentar o ponto para Origem\n" +
                                            "2 - Movimentar o ponto para um local Indicado\n" +
                                            "3 - Movimentar o ponto a partir de outro Ponto\n" +
                                            "0 - Voltar ao menu anterior"));

                                    switch (OpcaoMov){
                                        case 1:
                                            Ponto2D PontoMov = new Ponto2D(7.6, 8.5);
                                            JOptionPane.showMessageDialog(null, "Posição atual do Ponto:\n" + PontoMov);

                                            PontoMov.MovimentaPonto();
                                            JOptionPane.showMessageDialog(null, "Posição depois da movimentação:\n" + PontoMov);
                                            break;
                                        case 2:
                                            Ponto2D PontoPosicao = new Ponto2D();
                                            JOptionPane.showMessageDialog(null, "Posição do ponto antes da movimentação:\n" + PontoPosicao);

                                            double PosX = Double.parseDouble(JOptionPane.showInputDialog("Informe a posição X:"));
                                            double PosY = Double.parseDouble(JOptionPane.showInputDialog("Informe a posição Y:"));
                                            PontoPosicao.MovimentaPonto(PosX, PosY);

                                            JOptionPane.showMessageDialog(null, "Posição do ponto após movimentação:\n" + PontoPosicao);
                                            break;
                                        case 3:
                                            Ponto2D PontoInicial = new Ponto2D(7.8, 9.4);
                                            Ponto2D PontoRef = new Ponto2D(55.5, 77.7);

                                            JOptionPane.showMessageDialog(null, "Posição do ponto a ser modificado:\n" + PontoInicial);
                                            JOptionPane.showMessageDialog(null, "Posição do ponto utilizado como referencia:\n" + PontoRef);

                                            PontoInicial.MovimentaPonto(PontoRef);

                                            JOptionPane.showMessageDialog(null, "Posição do ponto inicial após movimentação:\n" + PontoInicial);
                                            break;
                                    }
                                }while(OpcaoMov != 0);
                                break;
                            case 3:
                                // Modifique estes pontos para testar a analise entre ambos
                                Ponto2D PontoPrin = new Ponto2D(5.5, 4.5);
                                Ponto2D PontoSec = new Ponto2D(5.3, 4.2);

                                JOptionPane.showMessageDialog(null, "Primeiro ponto:\n" + PontoPrin);
                                JOptionPane.showMessageDialog(null, "\nSegundo ponto:\n" + PontoSec);

                                // Valida a igualdade semantica do ponto
                                if(PontoPrin.equals(PontoSec)){
                                    JOptionPane.showMessageDialog(null, "Os pontos analisados são iguais semanticamente!");
                                }else{
                                    JOptionPane.showMessageDialog(null, "Os pontos analisados NÃO são iguais semanticamente!");
                                }

                                break;
                            case 4:
                                Ponto2D PontoString = new Ponto2D(9.2, 9.5);

                                JOptionPane.showMessageDialog(null,"Representação por string do ponto:\n" + PontoString);
                                break;
                            case 5:
                                double Distancia;

                                Ponto2D PontoA = new Ponto2D(9.5,8.5);
                                Ponto2D PontoB = new Ponto2D(2.5,3.5);

                                JOptionPane.showMessageDialog(null,"Posição do Ponto A:\n" + PontoA);
                                JOptionPane.showMessageDialog(null,"Posição do Ponto B:\n" + PontoB);

                                Distancia = PontoA.CalcDistancia(PontoB);

                                JOptionPane.showMessageDialog(null,"A distancia do Ponto A para o Ponto B é:\n" + Distancia);
                                break;
                            case 6:
                                Ponto2D PontoOriginal = new Ponto2D(7.6,7.5);
                                Ponto2D PontoClonado = PontoOriginal.clone();

                                JOptionPane.showMessageDialog(null,"Ponto Original:\n" + PontoOriginal);
                                JOptionPane.showMessageDialog(null,"Ponto Clonado:\n" + PontoClonado);

                                if(PontoOriginal.equals(PontoClonado)){
                                    JOptionPane.showMessageDialog(null, "Os pontos analisados são iguais semanticamente!");
                                }else {
                                    JOptionPane.showMessageDialog(null, "Os pontos analisados NÃO são iguais semanticamente!");
                                }
                                break;
                            case 7:
                                OpcaoPonto = 0;
                                break;
                            case 0:
                                JOptionPane.showMessageDialog(null, "Aplicação encerrada com sucesso!");
                                OpcaoMain = OpcaoPonto;
                                break;
                            default:
                        }
                    }while(OpcaoPonto != 0);
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Aplicação encerrada com sucesso!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao inválida, tente novamente!");
            }

        }while (OpcaoMain != 0);
    }
}