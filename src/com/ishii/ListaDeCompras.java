package com.ishii;

import java.util.ArrayList;

/**
 * @author Edson Ishii
 */
public class ListaDeCompras
{
    private ArrayList<String> listaDeCompras = new ArrayList<String>();

    public void  addItemNaLista(String item)
    {
        listaDeCompras.add(item);
    }

    public void mostraLista()
    {
        System.out.println("Você tem " + listaDeCompras.size() + " items na sua lista de compras");
        for (int i = 0; i < listaDeCompras.size(); i++)
        {
            System.out.println((i+1) + ". " + listaDeCompras.get(i));
        }
    }

    public void modificaItem(int posicao, String novoItem)
    {
        listaDeCompras.set(posicao,novoItem);
        System.out.println("Item da compra " + (posicao+1) + " foi modificado.");
    }

    public void removeItem(int posicao)
    {
        String oItem = listaDeCompras.get(posicao);
        listaDeCompras.remove(posicao);
    }

    public String achaItem(String itemProcurado)
    {
        boolean existe = listaDeCompras.contains(itemProcurado);

        int posicao = listaDeCompras.indexOf(itemProcurado);
        if(posicao >= 0)
        {
            return listaDeCompras.get(posicao);
        }

        return null;
    }

}
