
void setup() {
PImage face = loadImage("zombie.jpeg");

 size(800,800);
 
 face.resize(800,800);
 image(face,0,0);
}
void draw() {
  fill(mouseX,mouseX,mouseX);
  ellipse(546,300,99,99);
  fill(mouseY,mouseY,mouseY);
  ellipse(299,354,99,99);
  
  
  
  fill(255,1,1);
  ellipse(280,340,50,50);
  fill(255,1,1);
  ellipse(570,300,50,50);
}
