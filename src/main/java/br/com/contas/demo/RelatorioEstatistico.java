package br.com.contas.demo;

class RelatorioEstatistico {
    private double media;
    private double desvioPadrao;
    private int quantidadeItens;
    private double mediana;

    public RelatorioEstatistico(double media, double desvioPadrao, int quantidadeItens, double mediana) {
        this.media = media;
        this.desvioPadrao = desvioPadrao;
        this.quantidadeItens = quantidadeItens;
        this.mediana = mediana;
    }

    public double getMedia() {
        return media;
    }

    public double getDesvioPadrao() {
        return desvioPadrao;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public double getMediana() {
        return mediana;
    }
}