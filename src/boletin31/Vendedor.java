package boletin31;

import java.util.ArrayList;


public class Vendedor extends Empregado{
    
    private Coche coche;
    private String telfMovil;
    private String area;
    private XefeZona xefe;
    private ArrayList<Cliente> lcl=new ArrayList();
    private static final double comisiones=0.20;
    private static final double incremento=0.10;

    public void addCliente(Cliente cl) {
        lcl.add(cl);
    }

    public void removeCliente(Cliente cl) {
        lcl.remove(cl);
    }
    
    public void cambiarCoche(Coche coche1){
      this.setCoche(coche1);
        
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
    public Vendedor(Coche coche, String telfMovil, String area, String nome, String apelidos, String dni, String direcc, int antiguedad, String telf, double salario) {
        super(nome, apelidos, dni, direcc, antiguedad, telf, salario);
        this.coche=coche;
        this.telfMovil=telfMovil;
        this.area=area;

    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche=coche;
    }

    public String getTelfMovil() {
        return telfMovil;
    }

    public void setTelfMovil(String telfMovil) {
        this.telfMovil=telfMovil;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area=area;
    }

    public XefeZona getXefe() {
        return xefe;
    }

    public void setXefe(XefeZona xefe) {
        this.xefe=xefe;
    }

    public ArrayList<Cliente> getLcl() {
        return lcl;
    }

    public void setLcl(ArrayList<Cliente> lcl) {
        this.lcl=lcl;
    }

    public double getComisiones() {
        return comisiones;
    }

    @Override
    public String toString() {
        return "Vendedor{"+"coche="+coche+", telfMovil="+telfMovil+", area="+area+", xefe="+xefe+", lcl="+lcl+'}';
    }
}
