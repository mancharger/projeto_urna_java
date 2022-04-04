package urna;

import java.util.Scanner;

class Urna_Main {

    public static void main(String[] args) {
        
        int controleturno = 0;
        
        Scanner scan = new Scanner(System.in);
        
        
        System.out.printf("Digite a quantidade de Candidatos: ");
        Candidato[] candidato = new Candidato[scan.nextInt()];   //Criação do objeto array (candidato[1,2,3...])
        
        for(int i = 0; i < candidato.length; i++){    //inicialização de todas as posições do objeto array candidato
            candidato[i] = new Candidato();
        }

        ControleVenc indicedovencedor = new ControleVenc();

        System.out.printf("Digite a quantidade de Eleitores: ");
        Eleitor[] eleitor = new Eleitor[scan.nextInt()];

        for(int i = 0; i < eleitor.length; i++){    //inicialização de todas as posições do objeto array eleitor
            eleitor[i] = new Eleitor();
        }



        do {
            String h = "=";
            System.out.printf("%-1s================ Menu Urna ================", h);
            System.out.println("\nDigite 1 para cadastrar os Candidatos");
            System.out.println("Digite 2 para cadastrar os Eleitores");
            System.out.println("Digite 3 para iniciar a votação");

            controleturno = scan.nextInt();
            switch (controleturno) {
                
                case 1:
                    for(int i = 0; i < candidato.length; i++){
                    
                        scan.nextLine();
                        System.out.printf("\nNome do Candidato " + i + ": ");
                        candidato[i].setNome(scan.nextLine());

                        System.out.printf("\nNumero do Candidato " + i + ": ");
                        candidato[i].setNumero(scan.nextInt());
                        
                        scan.nextLine();
                        System.out.printf("\nPartido do Candidato " + i + ": ");
                        candidato[i].setPartido(scan.nextLine());
                        
                    }

                    break;

                case 2:
                    for(int i = 0; i < eleitor.length; i++){
                        
                        scan.nextLine();
                        System.out.printf("\nNome do Eleitor " + i + ": ");
                        eleitor[i].setNome(scan.nextLine());

                        System.out.printf("\nNumero do Titulo " + i + ": ");
                        eleitor[i].setNumerotitulo(scan.nextInt());
                        
                        
                    }


                    break;
            
                case 3:
                    for(int i = 0; i < eleitor.length; i++){

                        int votosinvalidos = 0;
                        for(int j = 0; j < candidato.length; j++){
                            System.out.println((j+1) + " - " + candidato[j].getNome() + " Numero " + candidato[j].getNumero());
                        }

                        System.out.println("\n" + eleitor[i].getNome() + ", digite o numero do seu candidato para votar\n");
                        int voto = 123671;
                        voto = scan.nextInt();
                        

                        for(int k = 0; k < candidato.length; k++){

                            if(voto == candidato[k].getNumero()){
                                candidato[k].setNumerovotos(candidato[k].getNumerovotos() + 1);
                                eleitor[i].setStatusvoto(true);
                            } else {
                                votosinvalidos++;
                            }

                        }  
                        
                        


                    }

                    
                    for(int i = 0; i < candidato.length; i++){
                        for(int j = 0; j < candidato.length; j++){

                            if(candidato[i].getNumerovotos() > candidato[j].getNumerovotos()){
                                indicedovencedor.setIndicevencedor(i);
                                 System.out.println("O candidato vencedor é: " + candidato[indicedovencedor.getIndicevencedor()].getNome());
                            }
                                
                            if(candidato[i].getNumerovotos() == candidato[j].getNumerovotos()){
                                  indicedovencedor.setEmpate(true);
                                  candidato[i].setEmpate(true);
                                  candidato[j].setEmpate(true);
                            }

                        }
                    }
                    
                    if(indicedovencedor.isEmpate() == true){
                        
                        System.out.print("Os candidatos: ");
                        
                        for(int i = 0; i < candidato.length; i++){
                        
                            if(candidato[i].isEmpate() == true){
                                System.out.println(candidato[i] + " / ");
                            }

                        }
                        
                        System.out.println("empataram!");

                    }


                    break;
                default:
                    break;
            }







        } while (controleturno != 8);
        
    }
}