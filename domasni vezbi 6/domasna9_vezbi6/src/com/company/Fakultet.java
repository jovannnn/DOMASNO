package com.company;

public class Fakultet {
    private String imeFak;
    private int brojSmerovi;
    private int vkupnoStudenti;

    public Fakultet(String imeFak,int brojSmerovi,int vkupnoStudenti){
       this.imeFak=imeFak;
       this.brojSmerovi=brojSmerovi;
       this.vkupnoStudenti=vkupnoStudenti;
    }
    public String getimeFak(){
        return imeFak;
    }
    public int getbrojSmerovi(){
        return brojSmerovi;
    }
    public int getvkupnoStudenti(){
        return vkupnoStudenti;
    }
    public void setimeFak(String imeFak){
        this.imeFak=imeFak;
    }
    public void setbrojSmerovi(int brojSmerovi){
        this.brojSmerovi=brojSmerovi;
    }
    public void setvkupnoStudenti(int vkupnoStudenti){
        this.vkupnoStudenti=vkupnoStudenti;
    }
}
