package br.com.concrete.treinamentotestes.case04.model;

public class User {

    private String id;
    private String email;
    private String password;
    private boolean deleted;

    public User(String id, String email, String password, boolean deleted) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.deleted = deleted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
