package app.model;

import java.util.Objects;

public class Correo {
    private Long id;
    private String email;
    private Boolean enviado;

    public Correo(Long id, String email, Boolean enviado) {
        this.id = id;
        this.email = email;
        this.enviado = enviado;
    }

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

    public Boolean getEnviado() {
        return enviado;
    }

    public void setEnviado(Boolean enviado) {
        this.enviado = enviado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Correo)) return false;
        Correo correo = (Correo) o;
        return Objects.equals(id, correo.id) && Objects.equals(email, correo.email) && Objects.equals(enviado, correo.enviado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, enviado);
    }

    @Override
    public String toString() {
        return "Correo{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", enviado=" + enviado +
                '}';
    }
}
