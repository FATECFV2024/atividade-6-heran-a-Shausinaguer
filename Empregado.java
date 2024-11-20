public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;
    // Construtor

    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    //Metodos de acesso

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularIrpf(){
        double aux;
        if (salario < 2259.20) {
            aux = 0;
        } else if (salario < 2826.65) {
            aux = 0.075 * salario;
        } else if (salario < 3751.05) {
            aux = 0.15 * salario;
        } else if (salario < 4664.68) {
            aux = 0.2250 * salario;
        } else {
            aux = 0.2750 * salario;
        }
        return (aux);
    }

    public double calcularInss() {
        double inss;
        if (salario < 1412) {
            inss = 0.75 * salario;
        } else if (salario < 2666.68) {
            inss = 105.90 + (0.09 * 1412);
        } else if (salario < 4000.03) {
            inss = 105.90 + 112.92 + (0.12 * 1412);
        } else if (salario < 7786) {
            inss = 105.90 + 112.92 + 160 + (0.14 * 1412);
        } else {
            inss = 105.90 + 112.92 + 160 + 530.04;
        }
        return (inss);
    }

}