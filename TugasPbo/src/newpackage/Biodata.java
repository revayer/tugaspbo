/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author revayer
 */
public class Biodata {
    String nama,ttl,alamat,hoby;

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getHoby() {
        return hoby;
    }

    public void setHoby(String hoby) {
        this.hoby = hoby;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }
      public void bio(){
        System.out.println("nama: "+getNama());
         System.out.println("tempat tanggal lahir :"+getTtl());
          System.out.println("Alamat :"+getAlamat());
           System.out.println("Hoby :"+getHoby());
           
           
   }
     public void inputdata(String n, String al, String ttl, String h){
       setNama(n);
       setAlamat(al);
       setTtl(ttl);
       setHoby(h);
}
}
