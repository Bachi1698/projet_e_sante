package com.example.e_sante;

public class Patient {
    public String Nom,email,mdp,adresse;
    public int Age;
    public int Tel;
    public int Image;
    public int NumAssurance;
    public String Prenom;




    public Patient(String nom, String prenom, int age, int tel, int numAssurance,String email, String mdp,String adresse) {
        this.Nom = nom;
        this.Age = age;
        this.Tel = tel;
        this.NumAssurance = numAssurance;
        this.Prenom=prenom;
        this.adresse=adresse;
        this.email=email;
        this.mdp=mdp;

    }



    public Patient(String nom, String prenom, int age, int tel, int numAssurance, String email, String mdp, String adresse, int image) {
        this.Nom = nom;
        this.Age = age;
        this.Tel = tel;
        this.NumAssurance = numAssurance;
        this.Prenom=prenom;
        this.adresse=adresse;
        this.email=email;
        this.mdp=mdp;
        this.Image=image;
    }



    public void setNom(String nom) {
        Nom = nom;
    }
    public String getPrenom() {
        return Prenom;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getImage() {
        return Image;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setTel(int tel) {
        Tel = tel;
    }

    public void setNumAssurance(int numAssurance) {
        NumAssurance = numAssurance;
    }

    public String getNom() {
        return Nom;
    }

    public int getAge() {
        return Age;
    }

    public int getTel() {
        return Tel;
    }

    public int getNumAssurance() {
        return NumAssurance;
    }
    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
