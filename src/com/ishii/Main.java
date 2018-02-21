package com.ishii;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static ListaDeCompras listaDeCompras = new ListaDeCompras();

    public static void main(String[] args)
    {
        boolean sair = false;
        int escolha = 0;
        mostraInstrucao();

        while (!sair)
        {
            System.out.println("Escolha uma opção: ");
            escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha)
            {
                case 0:
                    mostraInstrucao();
                    break;
                case 1:
                    listaDeCompras.mostraLista();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modificaItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    procuraItem();
                    break;
                case 6:
                    sair = true;
                    break;
            }
        }
    }

    private static void procuraItem()
    {
        System.out.print("Procurar item: ");
        String procuraItem = scanner.nextLine();
        if(listaDeCompras.achaItem(procuraItem) != null)
        {
            System.out.println("Achou " + procuraItem + " na lista de compras.");
        }else{
            System.out.println(procuraItem + " não está na lista de compras");
        }
    }

    private static void removeItem()
    {
        try
        {
            System.out.print("Entre com o número do item para remover: ");
            int nItem = scanner.nextInt();
            scanner.nextLine();

            System.out.println("nItem: " + nItem);
            listaDeCompras.removeItem(nItem-1);

        } catch (Exception e) {
            System.out.println("Você não entrou com o número do item a ser removido.");
            int nItem = scanner.nextInt();
        }
    }

    private static void modificaItem()
    {
        System.out.print("Entre no número do item: ");
        int nItem = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Entre com o novo item: ");
        String novoItem = scanner.nextLine();
        listaDeCompras.modificaItem(nItem-1, novoItem);
    }

    private static void addItem()
    {
        System.out.print("Por favor, digite um item para lista: ");
        listaDeCompras.addItemNaLista(scanner.nextLine());

    }

    private static void mostraInstrucao()
    {
        System.out.println("\n Aperte ");
        System.out.println("\t 0 - Para mostrar as opções.");
        System.out.println("\t 1 - Para mostrar o(s) item(s) da lista.");
        System.out.println("\t 2 - Para adicionar um item na lista.");
        System.out.println("\t 3 - Para modificar um item da lista.");
        System.out.println("\t 4 - Para remover um item da lista.");
        System.out.println("\t 5 - Para procurar um item na lista.");
        System.out.println("\t 6 - Para sair do programa.");
    }



}
