void setup(){
  size (200,200);
for(int i = 10; i > 0; i--){
  if ((i % 2) == 0){
    fill(255,0,0);
  }else{
    fill(255,255,255);
  }
  ellipse( 100, 100, i * 15, i * 15);
}
}
