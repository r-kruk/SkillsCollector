package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "sources")
public class Source {

    @ManyToMany
    @JoinTable(
            name="sources_attached_skills",
            joinColumns = {@JoinColumn(name="source_id")},
            inverseJoinColumns = {@JoinColumn(name="skill_id")}
    )
    private Set<Skill> skills = new HashSet<>();

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String description;
    @Column(unique = true, nullable = false)
    private String name;

    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Source source = (Source) obj;
        return Objects.equals(id, source.id)
                && Objects.equals(description, source.description)
                && Objects.equals(name, source.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, name);
    }

    @Override
    public String toString() {
        return "Source{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
