/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author johan
 */
public class Token {
    private String lexema;
    private int numero_token;
    private int fila;
    private int columna;
    private String tipo;

    public Token() {
    }
    
    public static class variables{
        public static  String segundo;
                public static String tercero;
               

                
    }
    

    public Token(String lexema, int numero_token, int fila, int columna, String tipo) {
        this.lexema = lexema;
        this.numero_token = numero_token;
        this.fila = fila;
        this.columna = columna;
        this.tipo = tipo;
    }

    

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public int getNumero_token() {
        return numero_token;
    }

    public void setNumero_token(int numero_token) {
        this.numero_token = numero_token;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
private String creaDatos (String lexema, int token, int fila, int columna, String tipo) {
    String etiquetas = "\n<tr>\n";
    etiquetas = "<td>" + lexema + "</td>\n";
    etiquetas = etiquetas + "<td>" + token + "</td>\n";
    etiquetas = etiquetas + "<td>" + fila + "</td>\n";
    etiquetas = etiquetas + "<td>" + columna + "</td>\n";
    etiquetas = etiquetas + "<td>" + tipo + "</td>\n";
    etiquetas = etiquetas + "\n</tr>";

    return etiquetas;
}

public static String creaTitulos() {
    String Titulos ="\n<tr>\n";
    Titulos = Titulos + "<tr>Lexema</tr>\n";
    Titulos = Titulos+"<tr>Token</tr>\n";
    Titulos = Titulos+"<tr>Fila</tr>\n";
    Titulos = Titulos+"<tr>Columna</tr>\n";
    Titulos = Titulos+"<tr>Titulos</tr>\n";
    Titulos = Titulos +"\n</tr>";
    return Titulos;
}
    @Override
    public String toString() {
        variables.tercero=creaDatos(lexema,numero_token,fila,columna,tipo);
        return "Token{" + "lexema=" + lexema + ", numero_token=" + numero_token + ", fila=" + fila + ", columna=" + columna + ", tipo=" + tipo + '}';
    }
    



    
}


