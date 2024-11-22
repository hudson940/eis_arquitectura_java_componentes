package com.eis;

public class FactoryDocument {


    public Documento getDocument(String type) {

        switch (type) {
            case "PDF":  return new DocumentoPdfImp();
            case "HTML": return new DocumentoHtmlImp();
            case "Text": return new DocumentoTexto();
            default: return null;

        }
    }

}
