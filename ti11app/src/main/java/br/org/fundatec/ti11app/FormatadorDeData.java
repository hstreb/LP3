package br.org.fundatec.ti11app;

import java.time.LocalDate;

public class FormatadorDeData {
    public LocalDate formatar(String dataText) {
        return LocalDate.parse(dataText);
    }
}