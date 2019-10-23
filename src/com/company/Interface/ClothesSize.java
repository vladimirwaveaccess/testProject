package com.company.Interface;

public enum ClothesSize {
    XXS(32){
        @Override
        public String getDescription() {
            return "Child size";
        }
    }, XS(34), S(36), M(38), L(40);

    private int euroSize;

    ClothesSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Adult size";
    }
}
