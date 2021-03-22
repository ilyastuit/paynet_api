package com.ilyastuit.paynet.api.domain.client;

import com.ilyastuit.paynet.api.domain.IP;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "clients")
public class Client {

    public Client() {
    }

    public Client(
            Long id,
            String name,
            ClientStatus status,
            BigDecimal balance,
            String username,
            String password) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.balance = balance;
        this.username = username;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private ClientStatus status;

    @OneToMany(mappedBy = "client", fetch = FetchType.EAGER)
    List<IP> ipList;

    private BigDecimal balance;

    private LocalDateTime lastTransaction;

    private String username;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientStatus getStatus() {
        return status;
    }

    public void setStatus(ClientStatus status) {
        this.status = status;
    }

    public List<IP> getIpList() {
        return ipList;
    }

    public void addIp(IP ip) {
        this.ipList.add(ip);
        if (ip.getClient() != this) {
            ip.setClient(this);
        }
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public LocalDateTime getLastTransaction() {
        return lastTransaction;
    }

    public void setLastTransaction(LocalDateTime lastTransaction) {
        this.lastTransaction = lastTransaction;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (!Objects.equals(id, client.id)) return false;
        if (!Objects.equals(name, client.name)) return false;
        if (client.status != status) return false;
        if (!Objects.equals(balance, client.balance)) return false;
        if (!Objects.equals(lastTransaction, client.lastTransaction))
            return false;
        if (!Objects.equals(username, client.username)) return false;
        return Objects.equals(password, client.password);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + (lastTransaction != null ? lastTransaction.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", lastTransaction=" + lastTransaction +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
