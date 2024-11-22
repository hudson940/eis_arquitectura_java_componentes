package com.eis;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var documentos = generarDocumentos();
       for (var documento : documentos) {
           documento.dibujar();
           documento.imprimir();
       }

    }

    public static List<Documento> generarDocumentos(){
        List<Documento> documentos = new ArrayList<>();
        var factory = new FactoryDocument();
        var documentoText= factory.getDocument("Text");
        documentoText.setContenido("...texto...");
        documentos.add(documentoText);
        var documentoHtml= factory.getDocument("HTML");
        documentoHtml.setContenido("<HMTL>Hola soy html</HMTL>");
        documentos.add(documentoHtml);
        var documentoPDF= factory.getDocument("PDF");
        documentoPDF.setContenido("...PDF...PDF...PDF...");
        documentos.add(documentoPDF);
        return documentos;
    }
}