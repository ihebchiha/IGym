
package gymapp.ihebchiha.com.igym.Modeles;

import com.google.gson.annotations.SerializedName;

import com.google.gson.annotations.Expose;


public class Client {

    @SerializedName("id_client")
    @Expose
    private Integer idClient;
    @SerializedName("CIN")
    @Expose
    private Integer cIN;
    @SerializedName("nom_client")
    @Expose
    private String nomClient;
    @SerializedName("prenom_client")
    @Expose
    private String prenomClient;
    @SerializedName("adresse")
    @Expose
    private String adresse;
    @SerializedName("telephone")
    @Expose
    private Integer telephone;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("nom_util")
    @Expose
    private String nomUtil;
    @SerializedName("mdp")
    @Expose
    private String mdp;
    @SerializedName("lien_f")
    @Expose
    private String lienF;

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public Integer getCIN() {
        return cIN;
    }

    public void setCIN(Integer cIN) {
        this.cIN = cIN;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomUtil() {
        return nomUtil;
    }

    public void setNomUtil(String nomUtil) {
        this.nomUtil = nomUtil;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getLienF() {
        return lienF;
    }

    public void setLienF(String lienF) {
        this.lienF = lienF;
    }



}