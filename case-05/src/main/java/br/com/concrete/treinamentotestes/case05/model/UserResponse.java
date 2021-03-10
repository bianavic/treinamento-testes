package br.com.concrete.treinamentotestes.case05.model;

public class UserResponse {

    private String id;
    private String email;

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

    public UserResponse(String id, String email) {
        this.id = id;
        this.email = email;
    }
}
