class Car {
    abstract class automobil(){
        var manufacturer:String = ""
            set(value){
                if(value !=""){
                    field = value;
                }
            }
        var year: Int = 0
        set(value){
            if(value > 0){
                field = value;
            }
        }
        var km: Float= 0.0f
        set(value){
            if(value > 0.0f){
                field = value;
            }
        }
        var tl: Boolean = false
            private set
        fun setPerdaTotal(){
            tl = true;
        }

    }
}

//

class eletric: Car.automobil(){
    var watts: Int = 0
        set(value){
            if(value > 0)
                field = value
        }
    var autonomy: Float = 0.0f
        set(value){
            if(value > 0.0f)
                field = value
        };
    var chargeTime: String = "00:00"
        set(value){
            if(value != "")
                field = value
        };

}

class hybrid: Car.automobil(){
    var cVWatts: Int = 0
        set(value){
            if(value > 0)
                field = value
        }
    var chargeGasFill: Float = 0.0f
        set(value){
            if(value > 0.0f)
                field = value
        };
    var consume: Float = 0.0f;
    if(value > 0.0f)
    field = value
};
}