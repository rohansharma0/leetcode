class UndergroundSystem {
    Map<Integer , Pair> arrival;
    Map<String , double[]> total;
    
    public UndergroundSystem() {
        this.arrival = new HashMap<>();
        this.total = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        arrival.put(id , new Pair(id , stationName , t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair p = arrival.get(id);
        String n = p.s +"_" + stationName;
        
        double[] x = total.getOrDefault(n , new double[2]);
        int time = t - p.t;
        x[0] += time;
        x[1]++;
        total.put(n , x);
        
    }
    
    public double getAverageTime(String startStation, String endStation) {
        double[] x = total.get(startStation +"_" +endStation);
        
        return x[0] / x[1];
    }
}

class Pair{
    int id;
    String s;
    int t;
    
    Pair(int id , String s , int t){
        this.id = id;
        this.s = s;
        this.t = t;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */