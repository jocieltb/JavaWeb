package br.edu.dsj.automovel.modelo;

import java.util.ArrayList;

import br.edu.dsj.automovel.entidade.Veiculo;

public class ServicoVeiculo {

	private static ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();

	public static void cadastrarVeiculo(Veiculo veiculo) {
		veiculos.add(veiculo);
	}

	public static ArrayList<Veiculo> listar() {
		return veiculos;
	}

	public static void excluirVeiculo(Veiculo veiculo) {
		veiculos.remove(veiculo);
	}

}
