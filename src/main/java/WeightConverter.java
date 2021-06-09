public class WeightConverter {
    public WeightConverter(){

    }
    public int kg_to_grams(int kg){
        int gms = kg * 1000;
        return gms;
    }
    public int grams_to_mg(int gms){
        int mg = gms * 1000;
        return mg;
    }
    public int pds_to_kg(int pds){
        double kg = pds * 2;
        return (int) kg;

    }
}