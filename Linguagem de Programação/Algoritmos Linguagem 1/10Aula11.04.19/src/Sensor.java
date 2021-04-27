public class Sensor {
    private String status;
    public String modelo;
    public String fabricante;
    public void exibirFabricante(){
        System.out.println("fabricante:" + fabricante);
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status; //this.status -- variavel da classe (private String status) / status variavel local (void setStatus(String status))
        
    }
    //public static void exibirFabricante(){
    //    System.out.println("Novus");
    //}
    
}
