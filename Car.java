publiic class Car{
    private int speed;
    private double regularPrice;
    private String color;
    private  double salePrice;
    public Car(int speed,double regularPrice,String color, double salePrice){
        this.Speed =Speed;
        this.regularPrice =regualPrice;
        this.salePrice =salePrice;
    }
    public double  getsalePrice(){
            return regulaPrice;

        }
       public  class  truck extent{
         public int weight;
         public truck(int speed,double regularPrice,String color int weight){
            super(speed,regularPrice,color)
            this.weight = weight;
         }
         public double getsalePrice(){
            if(weight>2000){
                return super.getsalePrice()-(0.1*super.getsalePrice());
            }
            else{
                return  super get.salePrice();
            }
            public class sedan extend Car{
                private int length;
            }
            public seden(int speed,double regularPrice,String color int length){
                super(speed,regularPrice,color);
                this.length =length;
            }
            public  double  getsalePrice(){
                if(length >20){
                    return super.getsalePrice() -(0.05*super.getsalePrice());
                }
                else{
                    return super.getsalePrice() -(0.1*super.getsalePrice());
                }
                public Class MyownAutoShop{
                    (int speed,double regularPrice,String color,int year int manufacturerDiscount)
                    public static void main(String[]args){
                        sendan mysedan = new sendan(160,20000,"Red",10);
                        Ford myFordk= new Ford(156,4452.0,"black",2005,10);
                        Ford myFordl  = new Ford(155,5000.0,"pink",1998,5);
                        Car myCar = new Car(555,56856.0,"red");
                        System.out.println("Mysendan Price %.2f", Mysendan.getsalePrice());
                         System.out.println("MyFordk Price %.2f", MyFordk.getsalePrice());
                          System.out.println("MyFordl Price %.2f", MyFordl.getsalePrice());
                           System.out.println"(Mycar Price %.2f", MyCar.getsalePrice());
                    }
                }
            }
         }

       }  
    }
}