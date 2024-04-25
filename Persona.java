class Persona {
   String Nombre, Apellido;
   int Edad;
   Double Altura;

   Persona() {}

   public void mostrarNombreCompleto() {
      System.out.println("\nMi nombre es " + this.Nombre + " " + this.Apellido);
   }

   public void mostrarEdad() {
      System.out.println("Tengo " + this.Edad + " años");
   }

   public void mostrarAltura() {
      System.out.println("Mido "+this.Altura+" metros");
   }
}