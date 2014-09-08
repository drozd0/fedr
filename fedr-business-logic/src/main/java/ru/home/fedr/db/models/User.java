package ru.home.fedr.db.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "email")
    @NotNull
    private String email;

    @Column(name= "password")
    @NotNull
    private String password;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, orphanRemoval = true)
    private List<Employee> employees = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn( name = "role_id")
    private Role role;

    @Version
    @Column(name = "version")
    private Integer version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

   public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!email.equals(user.email)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return email.hashCode();
    }
}
