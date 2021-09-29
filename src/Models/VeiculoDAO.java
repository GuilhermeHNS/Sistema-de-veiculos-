/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Connection.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import Classes.Veiculos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author guilh
 */
public class VeiculoDAO {
    Connection con = null;
    
    public boolean inserir(Veiculos vl) throws SQLException, ClassNotFoundException {
        boolean inseriu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO veiculos (marca, modelo, placa, cor, ano) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, vl.getMarca());
            stmt.setString(2, vl.getModelo());
            stmt.setString(3, vl.getPlaca());
            stmt.setString(4, vl.getCor());
            stmt.setInt(5, vl.getAno());
            stmt.execute();
            stmt.close();
            inseriu = true;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        return inseriu;
    }
    public boolean alteraDados(Veiculos vl) throws SQLException{
        boolean alterou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "UPDATE veiculos SET marca = ? , modelo = ? , cor = ? , ano = ? WHERE placa = ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, vl.getMarca());
            stmt.setString(2, vl.getModelo());
            stmt.setString(3, vl.getCor());
            stmt.setInt(4, vl.getAno());
            stmt.setString(5, vl.getPlaca());
            stmt.execute();
            stmt.close();
            alterou = true;
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
        finally{
            con.close();
            System.out.println("placa: " + vl.getPlaca());
            System.out.println("marca: " + vl.getMarca());
            System.out.println("cor: " + vl.getCor());
            System.out.println("ano: " + vl.getAno());
            System.out.println("modelo: " + vl.getModelo());
        }
        
        return alterou;
    }
    
    public boolean excluir(Veiculos vl) throws SQLException, ClassNotFoundException{
        boolean excluiu = false;
        boolean existe = false;
        ResultSet rs = null;
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM veiculos WHERE placa = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, vl.getPlaca());
            rs = stmt.executeQuery();
            if(rs.next()){
                existe = true;
            }
            stmt.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        if(existe){
            try{
                String sql = "DELETE FROM veiculos WHERE placa = ?";
                PreparedStatement stmt = con.prepareStatement(sql);
                stmt.setString(1, vl.getPlaca());
                stmt.execute();
                stmt.close();
                excluiu = true;
            }catch(Exception ex){
                ex.printStackTrace();
            }
            finally{
                con.close();
            }
        }
        
        return excluiu;
    }
    
    public ArrayList<Veiculos> buscarTodosVeiculos() throws SQLException, ClassNotFoundException{
        ArrayList<Veiculos> lista = new ArrayList();
        ResultSet rs;
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM veiculos";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                String placa = rs.getString("placa");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String cor = rs.getString("cor");
                int ano = rs.getInt("ano");
                
                Veiculos vl = new Veiculos(marca, modelo, placa, cor, ano);
                lista.add(vl);
            }
            stmt.close();
            con.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return lista;
    }
    
    public ArrayList<Veiculos> buscarPorAno(int ano) throws SQLException, ClassNotFoundException{
        ResultSet rs;
        ArrayList<Veiculos> lista = new ArrayList();
        
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM veiculos WHERE ano like ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, ano);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            String placa = rs.getString("placa");
            String modelo = rs.getString("modelo");
            String cor = rs.getString("cor");
            String marca = rs.getString("marca");
            ano = rs.getInt("ano");
            Veiculos vl = new Veiculos(marca, modelo, placa, cor, ano);
            lista.add(vl);
        }
        stmt.close();
        con.close();
        return lista;
    }
    
    public ArrayList<Veiculos> buscarPorMarca(String marca) throws SQLException, ClassNotFoundException{
        ResultSet rs;
        ArrayList<Veiculos> lista = new ArrayList();
        
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM veiculos WHERE marca like ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, marca);
        rs = stmt.executeQuery();
        
        while(rs.next()){
            String placa = rs.getString("placa");
            marca = rs.getString("marca");
            String modelo = rs.getString("modelo");
            String cor = rs.getString("cor");
            int ano = rs.getInt("ano");
            Veiculos vl = new Veiculos(marca, modelo, placa, cor, ano);
            lista.add(vl);
        }
        stmt.close();
        con.close();
        return lista;
    }
    
    public ArrayList<Veiculos> buscarPorPlaca(String placa) throws SQLException, ClassNotFoundException{
        ResultSet rs;
        ArrayList<Veiculos> lista = new ArrayList();
        
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM veiculos WHERE placa like ? ";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, placa + "%");
        rs = stmt.executeQuery();
        
        while(rs.next()){
            placa = rs.getString("placa");
            String marca = rs.getString("marca");
            String modelo = rs.getString("modelo");
            String cor = rs.getString("cor");
            int ano = rs.getInt("ano");
            Veiculos vl = new Veiculos(marca, modelo, placa, cor, ano);
            lista.add(vl);
        }
        stmt.close();
        con.close();
        return lista;
        
    }
    
    
}
