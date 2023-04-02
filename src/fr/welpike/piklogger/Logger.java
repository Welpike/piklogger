package fr.welpike.piklogger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private String log_path;

    Logger(String log_path){
        this.log_path = log_path;
    }

    public boolean writeLog(LogModel log_msg){
        File file = new File(this.log_path);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try{
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write(log_msg.getFormatted());
            bw.newLine();
            bw.close();
            writer.close();
            return true;
        } catch(IOException e){
            e.printStackTrace();
            return false;
        }
    }

    public String getPath() {
        return this.log_path;
    }

    public void setPath(String log_path){
        this.log_path = log_path;
    }
}
