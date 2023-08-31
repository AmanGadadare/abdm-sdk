package com.abdm.data_transfer_workflow.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;

import org.springframework.validation.annotation.Validated;
//import javax.validation.Valid;
//import javax.validation.constraints.*;

/**
 * KeyMaterial
 */


public class KeyMaterial   {
    @lombok.Getter
    @JsonProperty("cryptoAlg")
    private String cryptoAlg = null;

    @lombok.Getter
    @JsonProperty("curve")
    private String curve = null;

    @lombok.Getter
    @JsonProperty("dhPublicKey")
    private KeyObject dhPublicKey = null;

    @lombok.Getter
    @JsonProperty("nonce")
    private String nonce = null;

    public KeyMaterial cryptoAlg(String cryptoAlg) {
        this.cryptoAlg = cryptoAlg;
        return this;
    }

    public void setCryptoAlg(String cryptoAlg) {
        this.cryptoAlg = cryptoAlg;
    }

    public KeyMaterial curve(String curve) {
        this.curve = curve;
        return this;
    }

    public void setCurve(String curve) {
        this.curve = curve;
    }

    public KeyMaterial dhPublicKey(KeyObject dhPublicKey) {
        this.dhPublicKey = dhPublicKey;
        return this;
    }

    public void setDhPublicKey(KeyObject dhPublicKey) {
        this.dhPublicKey = dhPublicKey;
    }

    public KeyMaterial nonce(String nonce) {
        this.nonce = nonce;
        return this;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeyMaterial keyMaterial = (KeyMaterial) o;
        return Objects.equals(this.cryptoAlg, keyMaterial.cryptoAlg) &&
                Objects.equals(this.curve, keyMaterial.curve) &&
                Objects.equals(this.dhPublicKey, keyMaterial.dhPublicKey) &&
                Objects.equals(this.nonce, keyMaterial.nonce);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cryptoAlg, curve, dhPublicKey, nonce);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyMaterial {\n");

        sb.append("    cryptoAlg: ").append(toIndentedString(cryptoAlg)).append("\n");
        sb.append("    curve: ").append(toIndentedString(curve)).append("\n");
        sb.append("    dhPublicKey: ").append(toIndentedString(dhPublicKey)).append("\n");
        sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}