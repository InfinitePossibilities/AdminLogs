package com.InfiniteOne.AdminLogs;

import java.util.Date;
import org.bukkit.Location;

public class HistoryItem {
  String command;
  String sender;
  Date executed_at;
  Location location;
  
  public HistoryItem() {}
  
  public HistoryItem(String Command, String Sender, Date Executed_At, Location Location) {
    this.command = Command;
    this.sender = Sender;
    this.executed_at = Executed_At;
    this.location = Location;
  }
  
  public String getCommand() {
    return this.command;
  }
  
  public void setCommand(String value) {
    this.command = value;
  }
  
  public String getSender() {
    return this.sender;
  }
  
  public void setSender(String value) {
    this.sender = value;
  }
  
  public Date getExecuted_At() {
    return this.executed_at;
  }
  
  public void setExecuted_At(Date value) {
    this.executed_at = value;
  }
  
  public Location getLocation() {
    return this.location;
  }
  
  public void setLocation(Location value) {
    this.location = value;
  }
}
