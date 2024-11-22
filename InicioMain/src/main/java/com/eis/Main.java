package com.eis;


public class Main {
    public static void main(String[] args) {
        Documento documento=generarDocumentos();

        documento.dibujar();
        documento.imprimir();
    }

    public static Documento generarDocumentos(){
        Documento documento;
        var factory = new FactoryDocument();
        documento= factory.getDocument("Text");
        documento.setContenido("...texto...");
        documento= factory.getDocument("HTML");
        documento.setContenido("<HMTL></HMTL>");
        documento= factory.getDocument("PDF");
        documento.setContenido("...PDF...PDF...PDF...");
        return documento;
    }
}