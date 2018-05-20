void draw(){
background(0,0,0);
  fill(255,255,255);
ellipse(150,400,250,100);
ellipse(450,400,250,100);
  fill(0,0,0);
   int eyex= mouseX;
   int eyey= mouseY;
   if(mouseX<75){
   eyex = 75;
 }
 if(mouseX>225){
 eyex=225;
 }
 if(mouseY>425){
 eyey=425; }
 if(mouseY<375){
   eyey=375;}
  ellipse(eyex,eyey,35,35);
    ellipse(eyex+300,eyey,35,35);
}
void setup(){
size(600,800);

}