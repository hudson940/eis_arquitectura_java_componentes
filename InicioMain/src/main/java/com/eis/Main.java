package com.eis;


public class Main {
    public static void main(String[] args) {
        Documento documento=generarDocumentos();

        documento.dibujar();
        documento.imprimir();
    }

    public static Documento generarDocumentos(){
        Documento documento;

        documento=new DocumentoTexto();
        documento.setContenido("...texto...");
        documento=new DocumentoHtmlImp();
        documento.setContenido("<HMTL></HMTL>");
        documento=new DocumentoPdfImp();
        documento.setContenido("...PDF...PDF...PDF...");
        return documento;
    }
}