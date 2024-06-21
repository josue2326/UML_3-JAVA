package Class;

public class Mouse {
   private int id;
   private String Nombre;
   private double precio;

    public Mouse() {
    }

    public Mouse(int id, String Nombre, double precio) {
        this.id = id;
        this.Nombre = Nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
   
}
