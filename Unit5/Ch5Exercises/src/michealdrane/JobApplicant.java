package src.michealdrane;

public class JobApplicant {
    private String name;
    private String phoneNumber;
    private boolean wordProcessing;
    private boolean spreadSheet;
    private boolean dataBases;
    private boolean graphics;

    JobApplicant(String name, String phoneNumber,boolean wordProcessing, boolean spreadSheet, boolean dataBases, boolean graphics) {
       this.name = name;
       this.phoneNumber = phoneNumber;
       this.wordProcessing = wordProcessing;
       this.spreadSheet = spreadSheet;
       this.dataBases = dataBases;
       this.graphics = graphics;
    }
    
    public String getName() {
        return name;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean getWordProcessing() {
        return wordProcessing;
    }

    public boolean getSpreadSheet() {
        return spreadSheet;
    }

    public boolean getDataBases() {
        return dataBases;
    }

    public boolean getGraphics() {
        return graphics;
    }

    public boolean isQualified() {
        int count = 0;
        
        if (wordProcessing == true) {
            count++;
        }

        if (spreadSheet == true) {
            count++;
        }
        
        if (dataBases == true) {
            count++;
        }
        
        if (graphics == true) {
            count++;
        }
        
        if(count >= 3) {
            return true;
        } else {
            return false;
        }
    }
}