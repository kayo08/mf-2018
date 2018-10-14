
package com.github.kayo08.cnes;

/**
 *
 * @author kayom
 */
public class main {
    
    public static void main (String [] args) throws Exception {
        
        //Baixar arquivo .zip
        String link = "ftp://ftp.datasus.gov.br/cnes/BASE_DE_DADOS_CNES_201809.ZIP";
        String local = "C:\\Users\\kayom\\Documents\\Coding\\cnes\\src\\main\\java\\com\\github\\kayo08\\cnes\\arquivo.zip";
        Arquivo.baixaArquivo(link, local);
        
        //Descompactar arquivo zip, e selecionar qual arquivo a ser estraido.
        String csvArquivo = "tbEstabelecimento201809.csv";
        Arquivo.unpack(csvArquivo);
    }
}
