/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Classes.Veiculos;
import Models.VeiculoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class ControllerVeiculo {
    public boolean insereVeiculo(String placa, String modelo, String cor, int ano, String marca) throws SQLException, ClassNotFoundException{
        Veiculos vl = new Veiculos(marca, modelo, placa, cor, ano);
        VeiculoDAO vlDAO = new VeiculoDAO();
        boolean inseriu = vlDAO.inserir(vl);
        
        return inseriu;
    }
    
    public boolean excluiuVeiculo(String placa) throws SQLException, ClassNotFoundException{
        Veiculos vl = new Veiculos(placa);
        VeiculoDAO vlDAO = new VeiculoDAO();
        boolean excluiu = vlDAO.excluir(vl);
        return excluiu;        
    }
    
    public ArrayList<Veiculos> listar() throws SQLException, ClassNotFoundException{
        VeiculoDAO vlDAO = new VeiculoDAO();
        return vlDAO.buscarTodosVeiculos();
    }
    
    public ArrayList<Veiculos> listarPorAno(int ano) throws SQLException, ClassNotFoundException{
        VeiculoDAO vlDAO = new VeiculoDAO();
        return vlDAO.buscarPorAno(ano);
    }
    
    public ArrayList<Veiculos> listarPorMarca(String marca) throws SQLException, ClassNotFoundException{
        VeiculoDAO vlDAO = new VeiculoDAO();
        return vlDAO.buscarPorMarca(marca);
    }
    
    public ArrayList<Veiculos> listarPorPlaca(String placa) throws SQLException, ClassNotFoundException{
        VeiculoDAO vlDAO = new VeiculoDAO();
        return vlDAO.buscarPorPlaca(placa);
    }
    
    public boolean alterarDados(String placa, String marca, String modelo, String cor, int ano) throws SQLException{
        Veiculos vl = new Veiculos(marca, modelo, placa, cor, ano);
        VeiculoDAO vlDAO = new VeiculoDAO();
        
        boolean alterou = vlDAO.alteraDados(vl);
        return alterou;
    }
}
