package gist.unican.com.encuestaapp.domain.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.siimkinks.sqlitemagic.annotation.Column;
import com.siimkinks.sqlitemagic.annotation.Table;

/**
 * Created by andres on 08/05/2017.
 */
@Table(persistAll = true)
public class SurveyGeneralVariablesItem {

    public SurveyGeneralVariablesItem() {
    }
    @Column(useAccessMethods = true)
    @SerializedName("ID")
    @Expose
    private String iD;
    @Column(useAccessMethods = true)
    @SerializedName("Orden")
    @Expose
    private String orden;
    @Column(useAccessMethods = true)
    @SerializedName("NOMBRE")
    @Expose
    private String nOMBRE;
    @Column(useAccessMethods = true)
    @SerializedName("ITEMS")
    @Expose
    private String iTEMS;
    @Column(useAccessMethods = true)
    @SerializedName("abreviatura")
    @Expose
    private String abreviatura;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public String getNOMBRE() {
        return nOMBRE;
    }

    public void setNOMBRE(String nOMBRE) {
        this.nOMBRE = nOMBRE;
    }

    public String getITEMS() {
        return iTEMS;
    }

    public void setITEMS(String iTEMS) {
        this.iTEMS = iTEMS;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

}
