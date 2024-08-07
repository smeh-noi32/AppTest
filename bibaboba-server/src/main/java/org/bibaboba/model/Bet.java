package org.bibaboba.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "bet")
public class Bet {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Double sum;
    private Double ratio;
    private Double result;

    private Date dateBet;

    public UUID getId() {
        return id;
    }

    private Date data;

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Date getDateBet() {
        return dateBet;
    }

    public void setDateBet(Date dateBet) {
        this.dateBet = dateBet;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
