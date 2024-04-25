import java.util.Scanner;

class MainPersona {
   public static void main(String[] args) {
      Scanner op = new Scanner(System.in);
      System.out.println("\nIngrese los daros requeridos:\n");
      System.out.print("Deme su nombre: ");
      String name = op.nextLine();
      System.out.print("Deme su apellido: ");
      String lastname = op.nextLine();
      System.out.print("Deme su edad: ");
      int age = op.nextInt();
      System.out.print("Deme su altura: ");
      Double height = op.nextDouble();

      Persona Bruno = new Persona();
      Bruno.Nombre = name;
      Bruno.Apellido = lastname;
      Bruno.Edad = age;
      Bruno.Altura = height;
      
      Bruno.mostrarNombreCompleto();
      Bruno.mostrarEdad();
      Bruno.mostrarAltura();
   }
}