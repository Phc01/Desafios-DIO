package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemRemover.add(i);
                }
            }
        }
        itemList.removeAll(itemRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println("A lista está vazia!");
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("Microondas", 450d, 2);
        carrinhoCompras.adicionarItem("Microondas", 450d, 2);
        carrinhoCompras.adicionarItem("Geladeira", 2000d, 1);
        carrinhoCompras.adicionarItem("Fogão", 1800d, 3);

        carrinhoCompras.exibirItens();

        carrinhoCompras.removerItem("Fogão");

        carrinhoCompras.exibirItens();

        System.out.println("O valor total é = " + carrinhoCompras.calcularValorTotal());
    }
}
