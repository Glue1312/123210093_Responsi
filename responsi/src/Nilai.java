/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab Informatika
 */
public class Nilai{
    public double alur, orisinalitas, kata, nilai;
    String Judul;

public void ratarata(){
    try{
        nilai = ((alur+orisinalitas+kata)/3);
        
    }catch (Exception ex){
        System.out.println("Eror");
        System.out.println(ex.getMessage());
    }
}    

}
