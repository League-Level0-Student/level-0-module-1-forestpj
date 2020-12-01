
void setup() {
PImage face = loadImage("zombie.jpeg");

 size(800,800);
 
 face.resize(800,800);
 image(face,0,0);
}
void draw() {
  fill(50,150,50);
  ellipse(546,300,99,99);
  fill(50,150,50);
  ellipse(299,354,99,99);
  fill(1,1,1);
  ellipse(570,300,50,50);
  fill(1,1,1);
  ellipse(570,300,50,50);
}
