package com.rule.drools;

public class VirtualSmartPhone {
    private int Id;
    private String name;
    private String hang;
    private String gia;
    private String danhMuc;
    private Double kichThuocManHinh;
    private int[] rams;
    private int[] dungLuong;
    private String[] tienIch;

    public VirtualSmartPhone() {
    }

    public VirtualSmartPhone(int id, String name, String hang, String gia, String danhMuc, Double kichThuocManHinh, int[] rams, int[] dungLuong, String[] tienIch) {
        Id = id;
        this.name = name;
        this.hang = hang;
        this.gia = gia;
        this.danhMuc = danhMuc;
        this.kichThuocManHinh = kichThuocManHinh;
        this.rams = rams;
        this.dungLuong = dungLuong;
        this.tienIch = tienIch;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public Double getKichThuocManHinh() {
        return kichThuocManHinh;
    }

    public void setKichThuocManHinh(Double kichThuocManHinh) {
        this.kichThuocManHinh = kichThuocManHinh;
    }

    public int[] getRams() {
        return rams;
    }

    public void setRams(int[] rams) {
        this.rams = rams;
    }

    public int[] getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int[] dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String[] getTienIch() {
        return tienIch;
    }

    public void setTienIch(String[] tienIch) {
        this.tienIch = tienIch;
    }
}
