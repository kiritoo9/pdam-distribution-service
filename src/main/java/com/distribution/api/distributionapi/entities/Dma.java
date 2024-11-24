package com.distribution.api.distributionapi.entities;

import java.lang.reflect.Field;
import java.util.Map;

public class Dma {
    public boolean isParent;
    public double inletInduk;
    public double inletDMA;
    public double totalPelangganSL;
    public double totalPemakaianSL;
    public double estimasiKubikasiJDU;
    public double estimasiJDU;
    public double totalPelanggan;
    public double totalPemakaian;
    public double kubikasiRataPelanggan;
    public double estimasiKubikasiNRW;
    public double estimasiNRW;

    public void setter(String fieldName, Object value) {
        try {
            Field field = this.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(this, value);
        } catch (NoSuchFieldException e) {
            System.err.println("Field is not found");
        } catch (IllegalAccessException e) {
            System.err.println("Cannot access the field");
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid value type of this field");
        }
    }

    public Object getter(String fieldName) {
        try {
            Field field = this.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(this);
        } catch (NoSuchFieldException e) {
            System.err.println("Field is not found");
        } catch (IllegalAccessException e) {
            System.err.println("Cannot access the field");
        }
        return null;
    }

    public Map<String, Object> toMap() {
        return Map.of(
            "is_parent", this.isParent,
            "inlet_induk", this.inletInduk,
            "inlet_dma", this.inletDMA
        );
    }

}
