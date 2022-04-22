class ParkingSystem {
    int a , b , c;
    public ParkingSystem(int big, int medium, int small) {
        this.a = big;
        this.b = medium;
        this.c = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1){
            if(a > 0){
                a--;
                return true;
            }
        }
        if(carType == 2){
            if(b > 0){
                b--;
                return true;
            }
        }
        if(carType == 3){
            if(c > 0){
                c--;
                return true;
            }
        }
        
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */