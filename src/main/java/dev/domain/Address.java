package dev.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Address {
    @Id
    @Column(name = "id_address")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAddress;
    private String rue;
    @Column(name = "code_postale")
    private String codePostal;
    private String ville;
    @OneToMany(mappedBy = "address")
    private Set<Contact> contacts;

    public Address() {
    }

    public Integer getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("idAddress=").append(idAddress);
        sb.append(", rue='").append(rue).append('\'');
        sb.append(", codePostal='").append(codePostal).append('\'');
        sb.append(", ville='").append(ville).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
