package com.mycompany.projectuts.entity;

public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public int getSaldo(){
        return saldo;
    }
   
    public void simpanUang(int jumlah){
        this.saldo += jumlah;
    }
    
    public boolean ambilUang(int jumlah){
        if(saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }
}
