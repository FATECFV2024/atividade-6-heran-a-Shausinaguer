import java.text.DecimalFormat;

public class FolhaPGTO {

    public static void main(String args[]) {
        Mensalista men1, men2;
        Horista hora1, hora2;

        // Empregados mensalistas
        men1 = new Mensalista("Jose", "Rua abc", "Junior");
        men1.calcularIrpf();
        men1.calcularSalario();
        men1.calcularInss();
        imprimir(men1);

        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        men2.calcularSalario();
        men2.calcularInss();
        imprimir(men2);

        // Empregados Horistas
        hora1 = new Horista("Carlos", "Rua xyz", 20);
        hora1.calcularSalario();
        imprimir(hora1);

        hora2 = new Horista("Cristina", "Rua do centro", 100);
        hora2.calcularSalario();
        imprimir(hora2);
    }

    public static void imprimir(Mensalista x) {

        DecimalFormat deci = new DecimalFormat("0.00");

        System.out.println("Nome: " + x.getNome());
        System.out.println("EnderecoNome: " + x.getEndereco());
        System.out.println("Salario: " + deci.format(x.getSalario()));
        System.out.println("IRPF: " + deci.format(x.calcularIrpf()));
        System.out.println("Inss: " + deci.format(x.calcularInss()) + "\n\n");
    }

    public static void imprimir(Horista x) {

        DecimalFormat deci = new DecimalFormat("0.00");

        System.out.println("Nome: " + x.getNome());
        System.out.println("EnderecoNome: " + x.getEndereco());
        System.out.println("Salario: " + deci.format(x.getSalario()));
        System.out.println("IRPF: " + deci.format(x.calcularIrpf()));
        System.out.println("Inss: " + deci.format(x.calcularInss()) + "\n\n");
    }
}
