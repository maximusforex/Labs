public class Glas {
        private  double height,weight;
        private int glassCounter;
        private  String color;
        private  boolean closeOrOpen;

        public Glas(){
            this(13.5,13.5,5,"Blue",true);
        }
        public Glas(double height){
            this(height,12.5,4,"Yellow",false);
        }
        public Glas(double height,double weight){
            this(height,weight,3,"Red",true);
        }
        public Glas(double height,double weight,int glassCounter){
            this(height,weight,glassCounter,"Green",false);

        }
        public Glas(double height,double weight,int glassCounter,String color){
            this(height,weight,glassCounter,color,true);
        }
        public Glas(double height,double weight,int glassCounter,String color,boolean closeOrOpen){
            this.height=height;
            this.weight=weight;
            this.glassCounter=glassCounter;
            this.color=color;
            this.closeOrOpen=closeOrOpen;
        }
        @Override
        public String toString() {
            return "Glas{" +
                    "height=" + height +
                    "weight=" + weight +
                    "glassCounter=" + glassCounter +
                    "color=" + color +
                    "closeOrOpen=" + closeOrOpen +
                    "}";
        }
    }
