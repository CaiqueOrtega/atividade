public class Aluno {
    private String nome;
    private int ra;
    private String situacao;
    private double notaProva1, notaProva2, notaTrabalho, mediaFinal;


    public String getNome() {
        return nome;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public void setNome(String nome) {
        this.nome = nome;


    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public String toString() {
        return "RA: " + this.ra + "| Nome: " + this.nome;
    }


    public void calcularMedia() {
        this.setMediaFinal((this.getNotaProva1() * 0.35) + (this.getNotaProva2() * 0.35) + (this.getNotaTrabalho() * 0.3));

    }


    public void situacao() {
        if (this.getMediaFinal() >= 7) {
            this.setSituacao("Aprovado");
        } else {
            this.setSituacao("Reprovado");
        }
        System.out.println("+--------------------------------------------------+");
        System.out.println(this.toString());
        System.out.println("+--------------------------------------------------+");
        System.out.println("Resultado:         ");
        System.out.println("Média: " + this.getMediaFinal() + " | Situação: " + this.getSituacao());

    }

}

