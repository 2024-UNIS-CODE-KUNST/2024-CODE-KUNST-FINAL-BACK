package com.example.unisweb.email;

public class EmailOkDto {

    private Long id;
    private String email;

    // Constructors
    public EmailOkDto() {
    }

    public EmailOkDto(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    // Getters and setters
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
}
