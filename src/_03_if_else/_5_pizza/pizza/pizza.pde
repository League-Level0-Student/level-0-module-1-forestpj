
PImage pepperoni;

void setup() {
    size(500, 500);
    
    pepperoni = loadImage("pepperoni.png");
}
void draw() {
    
  fill(206, 141, 0, 255);
  ellipse(245, 255, 255, 255);
  
  fill(224, 34, 0, 255);
  ellipse(245, 255, 235, 235);
  
  fill(238, 247, 0, 255);
  ellipse(245, 255, 215, 215);
  
  image(pepperoni,200,200);
  image(pepperoni,250,250);
  image(pepperoni,150,150);
  image(pepperoni,150,250);  
  image(pepperoni,250,150);
  
  if (mousePressed) {
    image(pepperoni,200,150);
    image(pepperoni,200,250);
    image(pepperoni,150,200);
    image(pepperoni,250,200);
  }
    
}
