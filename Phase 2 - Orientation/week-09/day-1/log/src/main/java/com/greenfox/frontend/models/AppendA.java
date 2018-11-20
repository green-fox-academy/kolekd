package com.greenfox.frontend.models;

public class AppendA {

    String appended;

    public AppendA(String appendable) {
        StringBuilder stringBuilder = new StringBuilder(appendable);
        stringBuilder.append("a");
        this.appended = stringBuilder.toString();
    }

    public AppendA() {
    }

    public String acquireData(){
        return "appended: " + this.appended;
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended;
    }
}
