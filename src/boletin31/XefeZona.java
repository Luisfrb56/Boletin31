package boletin31;

import java.util.ArrayList;


public class XefeZona extends Empregado{
        private Despacho des;
    private Secretario sec;
    private ArrayList<Vendedor> lv=new ArrayList();
    private Coche coche;
    private static final double incremento=0.20;

    public void cmSecretaria(Secretario sect1) {
        this.setSec(sect1);
    }

    public void cambiarCoche(Coche coche1) {
        this.setCoche(coche1);

    }
    
    public void addVendedor(Vendedor v1){
        lv.add(v1);
    }
    
    public void removeVendedor(Vendedor v1){
        lv.remove(v1);
    }
     public XefeZona(Despacho des, Coche coche, String nome, String apelidos, String dni, String direcc, int antiguedad, String telf, double salario) {
        super(nome, apelidos, dni, direcc, antiguedad, telf, salario);
        this.des=des;
        this.sec=sec;
        this.coche=coche;
    }

    public Despacho getDes() {
        return des;
    }

    public void setDes(Despacho des) {
        this.des=des;
    }

    public Secretario getSec() {
        return sec;
    }

    public void setSec(Secretario sec) {
        this.sec=sec;
    }

    public ArrayList<Vendedor> getLv() {
        return lv;
    }

    public void setLv(ArrayList<Vendedor> lv) {
        this.lv=lv;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche=coche;
    }

    @Override
    public String toString() {
        return "XZona{"+"des="+des+", sec="+sec+", lv="+lv+", coche="+coche+'}';
    }

    @Override
    public void amosar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cmSupervisor(Empregado xefe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void inSalario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
