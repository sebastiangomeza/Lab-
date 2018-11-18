/**
 * This file was generated by the Jeddict
 */
package com.udea.entity;

import java.util.Arrays;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;

/**
 * @author Usser
 */
@Entity
@IdClass(FotoPK.class)
public class Foto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    @Basic
    private byte[] imagen;

    @Id
    @ManyToOne(targetEntity = Mascota.class)
    private Mascota mascota;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte[] getImagen() {
        return this.imagen;
    }

    @Override
    public String toString() {
        return "Foto{" + "id=" + id + ", imagen=" + imagen + ", mascota=" + mascota + '}';
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public Mascota getMascota() {
        return this.mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Arrays.hashCode(this.imagen);
        hash = 17 * hash + Objects.hashCode(this.mascota);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Foto other = (Foto) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Arrays.equals(this.imagen, other.imagen)) {
            return false;
        }
        if (!Objects.equals(this.mascota, other.mascota)) {
            return false;
        }
        return true;
    }

}