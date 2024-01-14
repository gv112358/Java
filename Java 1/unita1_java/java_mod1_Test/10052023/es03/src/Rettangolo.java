public class Rettangolo {
    public int x; // ascissa del rettangolo
    public int y; // ordinata del rettangolo
    public int base;
    public int altezza;
 
    //costruisce un rettangolo secondo i parametri di input
    public Rettangolo(int x, int y, int b, int a) {
       this.x = x;
       this.y = y;
       this.base = b;
       this.altezza = a;
    }
 
    //costruisce un rettangolo secondo i parametri di input e
    //posizionato sull'origine del piano cartesiano
    public Rettangolo(int b, int a) {
       this(0, 0, b, a);
    }
 
    //calcola il perimetro del rettangolo
    public int perimetro() {
       return 2 * (base + altezza);
    }
 
    //calcola l'area del rettangolo
    public int area() {
       return base * altezza;
    }
 
    //ritorna true se il rettangolo e' un quadrato, false altrimenti
    public boolean quadrato() {
       return base == altezza;
    }
 
    //ruota il rettangolo di 90 gradi a sinistra
    public void ruotasx() {
       int nuovaAltezza = base;
       base = altezza;
       altezza = nuovaAltezza;
    }
 
    //ruota il rettangolo di 90 gradi a destra
    public void ruotadx() {
       int nuovaAltezza = base;
       base = altezza;
       altezza = nuovaAltezza;
       x = x + altezza - base;
       y = y + base - altezza;
    }
 
    //ritorna true se r e "this" rettangolo hanno intersezione non vuota
    public boolean intersezione(Rettangolo r) {
       return x < r.x + r.base && x + base > r.x && y < r.y + r.altezza && y + altezza > r.y;
    }
 
    //ritorna il piu' piccolo rettangolo che contiene r e "this" rettangolo
    public Rettangolo contiene(Rettangolo r) {
       int xMin = Math.min(x, r.x);
       int yMin = Math.min(y, r.y);
       int xMax = Math.max(x + base, r.x + r.base);
       int yMax = Math.max(y + altezza, r.y + r.altezza);
       return new Rettangolo(xMin, yMin, xMax - xMin, yMax - yMin);
    }
   }
 