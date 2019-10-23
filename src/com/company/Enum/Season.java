package com.company.Enum;

public enum Season {
    WINTER(-10), SPRING(10), SUMMER(25){
        @Override
        public String getDescription() {
            return "Hot time of season";
        }
    }, AUTUMN(15);

    private double tmp;

    Season(double tmp) {
        this.tmp = tmp;
    }

    public double getTmp() {
        return tmp;
    }

    public String getDescription() {
        return "Cold time of season";
    }
}
