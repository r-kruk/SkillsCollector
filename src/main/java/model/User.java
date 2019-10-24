package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "users")

public class User {


    @ManyToMany
    @JoinTable(
            name="users_known_sources",
            joinColumns = {@JoinColumn(name="user_id")},
            inverseJoinColumns = {@JoinColumn(name="source_id")}
    )
    private Set<Source> sources = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, name="first_name")
    private String firstName;
    @Column(unique = true, name="last_name")
    private String lastName;
    @Column(unique = true, nullable = false)
    private String password;
    @Column(unique = true, nullable = false, name="username")
    private String username;


    public Set<Source> getSources() {
        return sources;
    }

    public void setSources(Set<Source> sources) {
        this.sources = sources;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(id, user.id)
                && Objects.equals(firstName, user.firstName)
                && Objects.equals(lastName, user.lastName)
                && Objects.equals(password, user.password)
                && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, password, username);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + username + '\'' +
                '}';
    }
}
