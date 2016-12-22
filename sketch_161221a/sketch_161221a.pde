void setup(){
size(500, 500);
background(100, 20, 100);
}
int location = 1;
int locationtwo = 1;
int locationthree = 1;
void draw(){
  makeMagical();
  fill(location, locationtwo, locationthree);
ellipse(getWormX(frameCount), getWormY(frameCount), 25, 25);
location = (int) random(500);
locationtwo = (int) random(500);
locationthree = (int) random(500);
}



float frequency = .0001;
float noiseInterval = PI; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}

