package com.example.events.model;

import android.widget.EditText;

public class Adm3 {
    private final EditText edtEmail;
    private final EditText edtSenha;

    public Adm3(EditText edtEmail, EditText edtSenha) {
        this.edtEmail = edtEmail;
        this.edtSenha = edtSenha;
    }

    public EditText getEdtEmail() {
        return edtEmail;
    }

    public EditText getEdtSenha() {
        return edtSenha;
    }
}
