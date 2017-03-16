int  frogX = 200;
int frogY = 380;

Car car1 = new Car(20, 40, 40, 13);
Car car2 = new Car(290, 70, 40, 10);
Car car3 = new Car(320, 100, 20, 5);
Car car4 = new Car(167, 130, 20, 2);
Car car5 = new Car(89, 160, 40, 7);
Car car6 = new Car(42, 190, 40, 10);
Car car7 = new Car(130, 220, 60, 17);
Car car8 = new Car(254, 250, 20, 15);
Car car9 = new Car(370, 280, 80, 3);
Car car10 = new Car(65, 310, 20, 10);

void setup(){
  size(400, 400);
};

void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
      //Frog Y position goes up
      frogY -= 20;
      }
      else if(keyCode == DOWN)
      {
        //Frog Y position goes down 
        frogY += 20;
      }
      else if(keyCode == RIGHT)
      {
       //Frog X position goes right
       frogX += 20;
      }
      else if(keyCode == LEFT)
      {
        //Frog X position goes left
        frogX -= 20;
      }
   }
   walls();
}

void walls(){
  if( frogX > 390){
    frogX =390;
  }
  if( frogX < 10){
  frogX = 10;
  }
  if(frogY > 390){
  frogY = 390;
  }
  if( frogY < 10){
  frogY = 10;
  }
};

public class Car{
  int carX;
  int carY;
  int size;
  int speed;
  Car(  int carX, int carY, int size, int speed){
    this.carX = carX;
    this.carY = carY;
    this.size = size;
    this.speed = speed;
  };
   void display(boolean L) 
  {
    fill(220,200,255);
    rect(carX , carY,  size, 20);
    if (L){
      moveL();
    }else{
      moveR();
    }
    
  
  }
  
  void moveL(){
    carX -= speed;
    if(carX <= -50){
      carX=400;
    };
  };
  void moveR(){
    carX += speed;
    if(carX >= 400){
      carX=-50;
    };
  };

int getX(){
   return carX;
};
int gety(){
   return carY;
};
int getSize(){
   return size;
};

};

void draw(){
  background(120, 120, 120);
  
  
  car1.display(true);
  car2.display(false);
  car3.display(true);
  car4.display(false);
  car5.display(true);
  car6.display(false);
  car7.display(true);
  car8.display(false);
  car9.display(true);
  car10.display(false);
  fill(40, 200, 40);
  ellipse(frogX, frogY, 20, 20);
};
