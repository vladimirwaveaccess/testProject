package com.company.InnerClass.InnerClass.Bank;

public class Bank {
    private String title;

    public Bank(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public class Account {
        private long number;
        private double balance;

        public Account(long number) {
            this.number = number;
        }

        public long getNumber() {
            return number;
        }

        public void setNumber(long number) {
            this.number = number;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void deposit(double summa) {
            this.balance += summa;
        }

        public boolean withdraw(double summa) {
            if (balance < summa) {
                return false;
            } else {
                this.balance -= summa;
                return true;
            }
        }

        public void show() {
            System.out.printf("%s %d %g", title, getNumber(), getBalance());
        }
    }

}
