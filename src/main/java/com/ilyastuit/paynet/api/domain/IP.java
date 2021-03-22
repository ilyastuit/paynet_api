package com.ilyastuit.paynet.api.domain;

import com.ilyastuit.paynet.api.domain.client.Client;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "client_ips")
public class IP {

    public IP() {}

    public IP(Long id, String ip, Client client) {
        this.id = id;
        this.ip = ip;
        this.client = client;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ip;

    @ManyToOne(optional = false, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
        if (!client.getIpList().contains(this)) {
            client.getIpList().add(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IP ip1 = (IP) o;

        if (!Objects.equals(id, ip1.id)) return false;
        if (!Objects.equals(ip, ip1.ip)) return false;
        return Objects.equals(client, ip1.client);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "IP{" +
                "id=" + id +
                ", ip='" + ip + '\'' +
                ", client=" + client +
                '}';
    }
}
