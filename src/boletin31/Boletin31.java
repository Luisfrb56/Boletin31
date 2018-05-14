package boletin31;


public class Boletin31 {


    public static void main(String[] args) {
        Coche coche1 = new Coche("asfas","Tesla","2000");
        Coche coche2 = new Coche("dfsdf",",Mclaren","P1");
        
         Despacho despacho1= new Despacho("Despacho 1");
        Despacho despacho2= new Despacho("Despacho 2");
        
         Cliente cliente1 = new Cliente("Pili","23515392A");
        Cliente cliente2 = new Cliente("Sebas","91874812G");
        
        Empregado xefe1= new XefeZona(despacho1,coche1,"Angel","Iria","13549778F","Trav",4,"986141414",1457);
        Empregado secre1 = new Secretario("034986475214",despacho2,"Lolo","Caballero","89456123J","Trav",1,"986121212",1000);
        Empregado vendedor1= new Vendedor(coche2,"655474434","Vigo","María","Gil","45612378G","Trav",7,"9861114458",954);  
        
        System.out.println(xefe1);
        System.out.println(secre1);
        System.out.println(vendedor1);
          
        secre1.cmSupervisor(xefe1);
        System.out.println(secre1);
    }
    
}
