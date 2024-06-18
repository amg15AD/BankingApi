package com.apress.BankingApi.Models;

import com.apress.BankingApi.Enums.Medium;
import com.apress.BankingApi.Enums.TransactionType;
import jakarta.persistence.*;
import org.hibernate.resource.transaction.spi.TransactionStatus;

import java.time.LocalDateTime;
@Entity
public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TransactionType type;
    private LocalDateTime transactionDate;
    @Enumerated(EnumType.STRING)
    private TransactionStatus status;
    private Long payeeId;
    @Enumerated(EnumType.STRING)
    private Medium medium;
    private Double amount;
    private String description;


    public Deposit() {
    }

    public Deposit(Long id, TransactionType type, LocalDateTime transactionDate, TransactionStatus status, Long payeeId, Medium medium, Double amount, String description) {
        this.id = id;
        this.type = type;
        this.transactionDate = transactionDate;
        this.status = status;
        this.payeeId = payeeId;
        this.medium = medium;
        this.amount = amount;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public void setStatus(TransactionStatus status) {
        this.status = status;
    }

    public Long getPayeeId() {
        return payeeId;
    }

    public void setPayeeId(Long payeeId) {
        this.payeeId = payeeId;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "id=" + id +
                ", type=" + type +
                ", transactionDate=" + transactionDate +
                ", status=" + status +
                ", payeeId=" + payeeId +
                ", medium='" + medium + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
