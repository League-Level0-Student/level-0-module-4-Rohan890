void draw(){
background(0,0,0);
  fill(255,255,255);
ellipse(150,400,250,100);
ellipse(450,400,250,100);
  fill(0,0,0);
  ellipse(mouseX,mouseY,35,35);
    ellipse(mouseX+300,mouseY,35,35);
}
void setup(){
size(600,800);

}