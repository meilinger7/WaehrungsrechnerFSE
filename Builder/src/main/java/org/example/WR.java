package org.example;

public class WR {

    public static class Builder {
        private WR next;
        private double betrag;
        private String variante;

        public Builder(){}

        public Builder withNext(WR next) {
            this.next = next;
            return this;
        }

        public Builder withBetrag(double betrag){
            this.betrag = betrag;
            return this;
        }
        public Builder withVariante(String variante){
            this.variante = variante;
            return this;
        }
        public WR build(){
            WR wr = new WR();
            wr.next = this.next;
            wr.betrag = this.betrag;
            wr.variante = this.variante;
            return wr;
        }
    }



    public WR next;
    public double betrag;
    public String variante;

    public double umrechnen() {
        if(this.next.check(this.variante)){
            return this.next.rechne(this.betrag);
        }
        else {
            this.next.setBetrag(this.betrag);
            this.next.setVariante(this.variante);
            return this.next.umrechnen();
        }

    }

    public boolean check(String variante){
        return false;
    }

    public double rechne(double betrag){
        return -1;
    }

    //Setter
    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public void setVariante(String variante) {
        this.variante = variante;
    }

    public void setNext(WR next) {
        this.next = next;
    }
}
