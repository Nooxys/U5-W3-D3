package CiroVitiello.U5W3D3.adapter;

import lombok.AllArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
public class Info implements DataSource {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String getNomeCompleto() {
        return this.nome + this.cognome;
    }

    @Override
    public int getEta() {
        return LocalDate.now().compareTo(this.dataDiNascita);
    }
}
