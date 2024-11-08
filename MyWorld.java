

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * */
      GhostA blue1 = new GhostA();
      GhostA blue2 = new GhostA();
      GhostA blue3 = new GhostA();
      GhostA blue4 = new GhostA();
      GhostB yellow1 = new GhostB();
      GhostB yellow2 = new GhostB();
      GhostC pink1 = new GhostC();
      GhostC pink2 = new GhostC();
      GhostD red1 = new GhostD();
      GhostC red2 = new GhostC();
      Person grant = new Person();
      SmallVert SmallVert1 = new SmallVert();
      SmallVert SmallVert2 = new SmallVert();
      ArrayList<Balls> balls = new ArrayList<Balls>();
      ArrayList<Pillars> walls = new ArrayList<Pillars>();
      ArrayList<smallPillars> smallWalls = new ArrayList<smallPillars>();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 450, 1); 
        SmallVert1.setRotation(-90);
        SmallVert2.setRotation(-90);
        addObject(SmallVert1,96,200);
        addObject(SmallVert2,507,198);
        addObject(grant,117,200);
        addObject(red1,303,199);
        addObject(blue1,303,199);
        addObject(blue2,303,199);
        addObject(blue3,303,199);
        addObject(blue4,303,199);
        addObject(yellow1,303,199);
        addObject(yellow2,303,199);
        addObject(pink1,303,199);
        addObject(pink2,303,199);
        addObject(red2,303,199);
        for(int i=0;i<300;i++)
        {
            balls.add(new Balls());
        }
        for(int i=0;i<100;i++)
        {
            walls.add(new Pillars());
            walls.get(i).getImage();
        }
        for(int i=0;i<100;i++)
        {
            smallWalls.add(new smallPillars());
            smallWalls.get(i).getImage();
        }
        
        addObject(walls.get(0),125,214);
        addObject(walls.get(1),128,137);
        addObject(walls.get(2),131,5);
        addObject(walls.get(3),191,5);
        addObject(walls.get(4),257,5);
        addObject(walls.get(5),126,263);
        addObject(walls.get(6),127,184);
        addObject(walls.get(7),121,418);
        addObject(walls.get(8),188,418);
        addObject(walls.get(9),254,418);
        addObject(walls.get(10),321,418);
        addObject(walls.get(11),386,418);
        addObject(walls.get(12),452,418);
        addObject(walls.get(13),517,418);
        addObject(walls.get(16),409,5);
        addObject(walls.get(17),341,5);
        addObject(walls.get(18),474,5);
        addObject(walls.get(19),474,183);
        addObject(walls.get(20),476,215);
        addObject(walls.get(21),460,183);
        addObject(walls.get(22),460,215);
        addObject(walls.get(23),140,214);
        addObject(walls.get(23),143,214);
        addObject(walls.get(24),139,184);
        addObject(walls.get(28),90,338);
        addObject(walls.get(29),509,337);
        addObject(walls.get(31),140,263);
        addObject(walls.get(32),140,137);
        addObject(walls.get(33),473,263);
        addObject(walls.get(34),460,263);
        addObject(walls.get(35),473,138);
        addObject(walls.get(36),461,138);
        addObject(walls.get(38),437,377);
        addObject(walls.get(39),375,377);
        addObject(walls.get(45),162,377);
        addObject(walls.get(46),225,377);
        addObject(walls.get(48),286,337);
        addObject(walls.get(49),314,337);
        addObject(walls.get(52),368,298);
        addObject(walls.get(54),231,298);       
        addObject(walls.get(56),285,258);
        addObject(walls.get(57),314,258);       
        addObject(walls.get(60),280,222);
        addObject(walls.get(61),320,222);
        addObject(walls.get(62),280,101);
        addObject(walls.get(63),320,101);        
        addObject(walls.get(66),232,64);
        addObject(walls.get(67),367,64);
        addObject(walls.get(68),367,45);
        addObject(walls.get(69),232,46);              
        addObject(walls.get(74),407,5);
        addObject(walls.get(75),367,54);
        addObject(walls.get(76),232,55);
        
        
        //large vertical walls
        for(int i=77;i<100;i++)
        {
            walls.get(i).turn(-90);
        }
        addObject(walls.get(77),511,106);
        addObject(walls.get(78),511,44);
        addObject(walls.get(79),90,105);
        addObject(walls.get(80),90,42);
        addObject(walls.get(81),511,297);
        addObject(walls.get(82),511,375);
        addObject(walls.get(83),90,298);
        addObject(walls.get(84),90,377);  
        addObject(walls.get(89),391,150);
        addObject(walls.get(90),391,130);
        addObject(walls.get(95),209,151);
        addObject(walls.get(96),209,130);
        addObject(walls.get(99),301,32);
        
        
        //small horizontal walls
        addObject(smallWalls.get(0),454,61);
        addObject(smallWalls.get(1),145,61);
        addObject(smallWalls.get(2),446,101);
        addObject(smallWalls.get(3),146,101);
        addObject(smallWalls.get(4),147,298);
        addObject(smallWalls.get(5),452,298);
        addObject(smallWalls.get(27),264,176);
        addObject(smallWalls.get(28),336,176);
        addObject(smallWalls.get(29),244,140);
        addObject(smallWalls.get(30),357,140);
        addObject(smallWalls.get(31),145,48);
        addObject(smallWalls.get(32),454,48);
        addObject(smallWalls.get(33),153,101);
        addObject(smallWalls.get(34),455,101);
        addObject(smallWalls.get(35),153,298);
        addObject(smallWalls.get(36),447,298);
        addObject(smallWalls.get(37),154,61);
        addObject(smallWalls.get(38),154,48);
        addObject(smallWalls.get(39),446,48);
        addObject(smallWalls.get(40),446,61);
        addObject(smallWalls.get(41),446,55);
        addObject(smallWalls.get(42),454,55);
        addObject(smallWalls.get(43),145,55);
        addObject(smallWalls.get(44),154,55);
        //small vertical walls
        for(int i=6;i<26;i++)
        {
            smallWalls.get(i).turn(-90);
        }
        addObject(smallWalls.get(6),300,283);
        addObject(smallWalls.get(7),165,322);
        addObject(smallWalls.get(8),210,350);
        addObject(smallWalls.get(9),391,350);
        addObject(smallWalls.get(10),300,360);
        addObject(smallWalls.get(11),210,231);
        addObject(smallWalls.get(12),391,230);
        addObject(smallWalls.get(13),300,126);
        addObject(smallWalls.get(14),300,355);
        addObject(smallWalls.get(15),436,322);
        addObject(smallWalls.get(16),172,238);
        addObject(smallWalls.get(17),172,161);
        addObject(smallWalls.get(18),430,160);
        addObject(smallWalls.get(19),430,239);
        addObject(smallWalls.get(20),352,207);
        addObject(smallWalls.get(21),352,191);
        addObject(smallWalls.get(22),250,207);
        addObject(smallWalls.get(23),250,191);
        addObject(smallWalls.get(24),210,245);
        addObject(smallWalls.get(25),391,246);
        
        int j=0;
        for(int i=359;i>14;i-=15)
        {
               addObject(balls.get(j),414,i);
               j++;
               addObject(balls.get(j),184,i);
               j++;
        }
        for(int i=324;i<414;i+=15)
        {
            addObject(balls.get(j),i,29);
               j++;
        }
         for(int i=429;i<504;i+=15)
        {
            addObject(balls.get(j),i,29);
               j++;
        }
        for(int i=113;i<503;i+=15)
        {
             addObject(balls.get(j),i,397);
             j++;
        }
         for(int i=199;i<401;i+=15)
        {
             addObject(balls.get(j),i,81);
             j++;
             addObject(balls.get(j),i,318);
             j++;
        }
        for(int i=233;i<369;i+=15)
        {
             addObject(balls.get(j),i,239);
             j++;
             addObject(balls.get(j),i,161);
             j++;
        }
        for(int i=177;i<237;i+=15)
        {
             addObject(balls.get(j),233,i);
             j++;
             addObject(balls.get(j),366,i);
             j++;
        }
        for(int i=110;i<184;i+=15)
        {
             addObject(balls.get(j),i,29);
             j++;
        }
        for(int i=199;i<280;i+=15)
        {
             addObject(balls.get(j),i,29);
             j++;
        }
         for(int i=199;i<280;i+=15)
        {
             addObject(balls.get(j),i,279);
             j++;
        }
        for(int i=320;i<410;i+=15)
        {
             addObject(balls.get(j),i,279);
             j++;
        }
         for(int i=428;i<492;i+=15)
        {
             addObject(balls.get(j),i,360);
             j++;
        }
         for(int i=169;i>108;i-=15)
        {
             addObject(balls.get(j),i,359);
             j++;
        }
         for(int i=134;i<179;i+=15)
        {
             addObject(balls.get(j),i,200);
             j++;
        }
         for(int i=431;i<491;i+=15)
        {
             addObject(balls.get(j),i,200);
             j++;
        }
          for(int i=134;i<171;i+=15)
        {
             addObject(balls.get(j),i,279);
             j++;
              addObject(balls.get(j),i,80);
             j++;
        }
         for(int i=109;i<171;i+=15)
        {
             addObject(balls.get(j),i,123);
             j++;
        }
         for(int i=430;i<468;i+=15)
        {
             addObject(balls.get(j),i,80);
             j++;
             addObject(balls.get(j),i,122);
             j++;
              addObject(balls.get(j),i,279);
             j++;
        }
         for(int i=230;i<277;i+=15)
        {
             addObject(balls.get(j),i,357);
             j++;
             
        }
          
             addObject(balls.get(j),200,200);
             j++;
             addObject(balls.get(j),215,200);
             j++;
              addObject(balls.get(j),397,200);
             j++;
             addObject(balls.get(j),383,200);
             j++;
             addObject(balls.get(j),486,96);
             j++;
             addObject(balls.get(j),486,110);
             j++;
             addObject(balls.get(j),486,123);
             j++;
             addObject(balls.get(j),473,123);
             j++;
             addObject(balls.get(j),486,300);
             j++;
             addObject(balls.get(j),486,318);
             j++;
             addObject(balls.get(j),486,47);
             j++;
              addObject(balls.get(j),486,63);
             j++;
              addObject(balls.get(j),472,318);
             j++;
             addObject(balls.get(j),458,318);
             j++;
             addObject(balls.get(j),458,333);
             j++;
             addObject(balls.get(j),458,348);
             j++;
             addObject(balls.get(j),488,371);
             j++;
             addObject(balls.get(j),488,383);
             j++;
             addObject(balls.get(j),109,373);
             j++;
             addObject(balls.get(j),109,385);
             j++;
             addObject(balls.get(j),275,370);
             j++;
             addObject(balls.get(j),275,385);
             j++;
             addObject(balls.get(j),364,334);
             j++;
             addObject(balls.get(j),229,331);
             j++;
             addObject(balls.get(j),229,346);
             j++;
             addObject(balls.get(j),110,47);
             j++;
             addObject(balls.get(j),110,63);
             j++;
             addObject(balls.get(j),109,95);
             j++;
             addObject(balls.get(j),109,110);
             j++;
             addObject(balls.get(j),113,301);
             j++;
             addObject(balls.get(j),113,319);
             j++;
             addObject(balls.get(j),129,319);
             j++;
             addObject(balls.get(j),144,319);
             j++;
             addObject(balls.get(j),144,334);
             j++;
             addObject(balls.get(j),144,347);
             j++;
             
             addObject(balls.get(j),275,45);
             j++;
             addObject(balls.get(j),275,62);
             j++;
             addObject(balls.get(j),324,45);
             j++;
             addObject(balls.get(j),324,62);
             j++;
    }
}
