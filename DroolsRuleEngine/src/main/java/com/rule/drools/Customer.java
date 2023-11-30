package com.rule.drools;

public class Customer {
    private int id;
    private String doTuoi;
    private String gioiTinh;
    private String theThao;
    private String amNhac;
    private String theLoaiGame;
    private String tienIch;

    public Customer() {
    }

    public Customer(int id, String doTuoi, String gioiTinh, String theThao, String amNhac, String theLoaiGame, String tienIch) {
        this.id = id;
        this.doTuoi = doTuoi;
        this.gioiTinh = gioiTinh;
        this.theThao = theThao;
        this.amNhac = amNhac;
        this.theLoaiGame = theLoaiGame;
        this.tienIch = tienIch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoTuoi() {
        return doTuoi;
    }

    public void setDoTuoi(String doTuoi) {
        this.doTuoi = doTuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTheThao() {
        return theThao;
    }

    public void setTheThao(String theThao) {
        this.theThao = theThao;
    }

    public String getAmNhac() {
        return amNhac;
    }

    public void setAmNhac(String amNhac) {
        this.amNhac = amNhac;
    }

    public String getTheLoaiGame() {
        return theLoaiGame;
    }

    public void setTheLoaiGame(String theLoaiGame) {
        this.theLoaiGame = theLoaiGame;
    }

    public String getTienIch() {
        return tienIch;
    }

    public void setTienIch(String tienIch) {
        this.tienIch = tienIch;
    }
}
