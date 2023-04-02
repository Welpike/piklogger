package fr.welpike.piklogger;

public class LogModel {
    private String date;

    private String msg;

    LogModel(String date, String msg){
        this.date = date;
        this.msg = msg;
    }

    public String getFormatted(){
        return this.date +" - "+ this.msg;
    }

    public String getDate() {
        return date;
    }

    public String getMsg() {
        return msg;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
