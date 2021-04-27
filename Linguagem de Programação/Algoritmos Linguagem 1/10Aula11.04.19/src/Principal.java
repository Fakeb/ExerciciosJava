public class Principal {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.modelo = "termo 03-51";
        sensor.fabricante = "novus";
        System.out.println("modelo:" + sensor.modelo);
        System.out.println("Fabricante:" + sensor.fabricante);
        sensor.exibirFabricante();
        
        sensor.setStatus("on");
        System.out.println("Status:" + sensor.getStatus());
        
        //Sensor.exibirFabricante(); // 'Sensor' classe
        
    }
    
}
