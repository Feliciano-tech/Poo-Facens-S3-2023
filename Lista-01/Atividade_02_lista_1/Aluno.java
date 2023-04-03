package Atividade_02_lista_1;

public class Aluno {

    private String ra;
    private String nome;
    private float ac01;
    private float ac02;
    private float ag;
    private float af;

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public float getAc01() {
        return ac01;
    }

    public float getAc02() {
        return ac02;
    }

    public float getAg() {
        return ag;
    }

    public float getAf() {
        return af;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAc01(float ac01) {
        this.ac01 = ac01;
    }

    public void setAc02(float ac02) {
        this.ac02 = ac02;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }

    public void setAf(float af) {
        this.af = af;
    }

    public double CalcularMedia() {
        return (ac01 * 0.15) + (ac02 * 0.30) + (ag * 0.10) + (af * 0.45);

    }

    public String Verificar() {

        String media;

        if (CalcularMedia() >= 5) {
            media = "aprovado";

        } else {

            media = "Reprovado";
        }

        return media;
    }

    public String Imprimir() {

        return "\nRa: " + ra
                + "\nNome: " + nome
                + "\nAc01: " + ac01
                + "\nAc02: " + ac02
                + "\nAg: " + ag
                + "\nAf: " + af
                + "\nMedia: " + CalcularMedia()
                + "\nSituacao : " + Verificar() + "\n";

    }

}



 