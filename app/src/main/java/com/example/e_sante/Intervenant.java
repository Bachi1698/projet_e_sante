package com.example.e_sante;

public class Intervenant {
    public String Nom,email,mdp,adresse;
    public int Age;
    public int Tel;
    public String Specialite;
    public String Prenom;
    public int Image;




    public Intervenant(String nom, String prenom, int age, int tel, String specilaite,String email, String mdp,String adresse) {
        this.Nom = nom;
        this.Age = age;
        this.Tel = tel;
        this.Specialite = specilaite;
        this.Prenom=prenom;
        this.adresse=adresse;
        this.email=email;
        this.mdp=mdp;

    }


    public Intervenant(String nom, String prenom, int age, String specilaite, int image) {
        this.Nom = nom;
        this.Age = age;
        this.Specialite = specilaite;
        this.Prenom=prenom;
        this.Image=image;


    }


    public int getImage() {
        return Image;
    }

    public void setSpecialite(String specialite) {
        Specialite = specialite;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
    public String getPrenom() {
        return Prenom;
    }



    public void setAge(int age) {
        Age = age;
    }

    public void setTel(int tel) {
        Tel = tel;
    }

    public void setNumAssurance(String specialite) {
        Specialite = specialite;
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

    public String getSpecialite() {
        return Specialite;
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
