package fr.ariouz.barbuilder;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;


/**
 * @author Ariouz
 * @version 1.0
 * This class help you to create a bar, like an xp bar
 *
 * Copyright Ariouz 2020
 */

public class BarBuilder {

    private ChatColor full = ChatColor.GREEN;
    private ChatColor empty = ChatColor.RED;
    private double percent;
    private int sizeOfBar = 100;
    private char caracter = '|';

    /**
     * Default method, it will set the percent of green bars
     * @param percent
     */

    public BarBuilder(double percent){
        this.percent = percent;
    }

    /**
     * It will set the percent of green bars and the size of bar
     * @param percent
     * @param sizeOfBar
     */

    public BarBuilder(double percent, int sizeOfBar){
        this.percent = percent;
        this.sizeOfBar = sizeOfBar;
    }

    /**
     * It will set the percent of green bars, the size of bar and the caratcter (default is '|' )
     * @param percent
     * @param sizeOfBar
     * @param caracter
     */

    public BarBuilder(double percent, int sizeOfBar, char caracter){
        this.percent = percent;
        this.sizeOfBar = sizeOfBar;
        this.caracter = caracter;
    }

    /**
     * It will set the percent of green bars and the caracter (default is '|' )
     * @param percent
     * @param caracter
     */

    public BarBuilder(double percent, char caracter){
        this.percent = percent;
        this.caracter = caracter;
    }

    /**
     * It will set the percent of green bars, the size of the total bar, the caracter, the full color (default is green) and the empty color (default id red)
     * @param percent
     * @param sizeOfBar
     * @param caracter
     * @param full
     * @param empty
     */

    public BarBuilder(double percent, int sizeOfBar, char caracter, ChatColor full, ChatColor empty){
        this.percent = percent;
        this.caracter = caracter;
    }

    /**
     * set the percent of the bar (if you want to make animations)
     * @param percent
     * @return
     */

    public BarBuilder setPercent(double percent){
        this.percent = percent;
        return this;
    }

    /**
     * set the full color (default is green)
     * @param color
     */

    public BarBuilder setFullColor(ChatColor color){
        this.full = color;
        return this;
    }

    /**
     * set the empty color (default is red)
     * @param color
     */

    public BarBuilder setEmptyColor(ChatColor color){
        this.empty = color;
        return this;
    }

    /**
     * set the size of the bar (default is 100)
     * @param size
     */

    public BarBuilder setSize(int size){
        this.sizeOfBar = size;
        return this;
    }

    /**
     * set the caracter of bar (default is '|')
     * @param caracter
     */

    public BarBuilder setCaracter(char caracter){
        this.caracter = caracter;
        return this;
    }

    /**
     * Return the current percent of the bar
     * @return
     */

    public double getPercent(){
        return this.percent;
    }

    /**
     * Return the current percent of the bar
     * @param bar
     * @return
     */

    public double getPercent(BarBuilder bar){
        return bar.getPercent();
    }

    /**
     * Return the current size of the bar
     * @return
     */

    public int getSize(){
        return this.sizeOfBar;
    }

    /**
     * Return the current size of the bar
     * @param bar
     * @return
     */

    public int getSize(BarBuilder bar){
        return bar.getSize();
    }

    /**
     * Return the current full color
     * @return
     */

    public ChatColor getFullColor(){
        return this.full;
    }

    /**
     * Return the current full color
     * @return
     */

    public ChatColor getFullColor(BarBuilder bar){
        return bar.getFullColor();
    }

    /**
     * Return the current empty color
     * @return
     */

    public ChatColor getEmptyColor(){
        return this.empty;
    }

    /**
     * Return the current empty color
     * @return
     */

    public ChatColor getEmptyColor(BarBuilder bar){
        return bar.getEmptyColor();
    }

    /**
     * Return the bar caracter (default is |)
     * @return
     */

    public char getCaracter() {
        return this.caracter;
    }

    /**
     * Return the bar caracter (default is |)
     * @return
     */

    public char getCaracter(BarBuilder bar) {
        return bar.getCaracter();
    }

    /**
     * Send the bar in the chat to the player
     * @param player
     */

    public void sendToPlayer(Player player){
        player.sendMessage(this.build());
    }

    /**
     * Send the bar in the chat to the player
     * @param player
     * @param bar
     */

    public void sendToPlayer(Player player, BarBuilder bar){
        player.sendMessage(bar.build());
    }

    /**
     * Send the bar to the console
     */

    public void sendToConsole(){
        Bukkit.getConsoleSender().sendMessage(this.build());
    }

    /**
     * Send the bar to the console
     * @param bar
     */

    public void sendToConsole(BarBuilder bar){
        Bukkit.getConsoleSender().sendMessage(bar.build());
    }

    /**
     * Send the bar to all online players
     */

    public void sendToAllPlayers(){
        for(Player players : Bukkit.getOnlinePlayers()){
            sendToPlayer(players);
        }
    }

    /**
     * Send the bar to all online players
     * @param bar
     */

    public void sendToAllPlayers(BarBuilder bar){
        for(Player players : Bukkit.getOnlinePlayers()){
            sendToPlayer(players, bar);
        }
    }

    /**
     * Build the bar. Use this method after all ones !
     * @return build.toString();
     */

    public String build(){
        this.percent /= 100;

        long completed = Math.round(this.sizeOfBar*this.percent);

        StringBuilder build = new StringBuilder();
        build.append(this.full);

        for(int i = 0; i < sizeOfBar; i++){
            build.append(i == completed ? this.empty : "").append(this.caracter);
        }

        return build.toString();
    }

}
