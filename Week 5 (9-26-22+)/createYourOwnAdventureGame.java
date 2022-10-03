import java.util.Scanner;




public class createYourOwnAdventureGame {
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("You are a gladiator. There are 3 mystery opponents you can choose between.");
        System.out.println("Choose your opponent (a/b/c)");
        System.out.println(" ");

        String ans = keyboard.nextLine();
       
        ans = checkValid(ans);
        // CHOICE #1:====================================================================================================================================================
        // CHOSE A; HENRY
        if(ans.equals("a")){
            System.out.println("The figher you have chosen is...");
            System.out.println("HENRY!!");
            System.out.println(" ");
            System.out.println("You can choose between 3 weapons to fight Henry:");
            System.out.println("Type 'a' for a butter knife");
            System.out.println("Type 'b' for a pair of safety scissors");
            System.out.println("Type 'c' for a big rock");
            System.out.println(" ");
            
            ans = keyboard.nextLine();
            ans = checkValid(ans);
            // CHOICE #2.1====================================================================================================================================================
            // CHOSE A; BUTTER KNIFE
            if(ans.equals("a")){
                System.out.println("You have chosen a butter knife as your weapon!");
                System.out.println(" ");
                System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                System.out.println("As Henry draws his weapon, you see that he wields... a gun!");
                System.out.println(" ");
                System.out.println("You ready yourself for combat, clutching your butter knife.");
                System.out.println("You charge at Henry, dodging many of his bullets as you sprint towards him");
                System.out.println("Your heart sinks as you feel a small handful of Henry's bullets enter your chest");
                System.out.println("HOWEVER, YOU REFUSE TO GIVE UP! With the last of your energy, you sink your butter knife into Henry's heart,");
                System.out.println("killing him. This combat ends with both of your deaths, and you lie dying together on the cold colosseum floor");
                System.out.println(" ");
                System.out.println("Despite your death you have still ended in a tie, and you have given the audience a good show");
                System.out.println("Your show has earned enough for a modest funeral, and both you and your opponent are remembered fondly");
                System.out.println(" ");
                System.out.println("Ending 1/6");
                // CHOICE 3.1 =================================================================================================================================================
            }
            // CHOSE B; SAFETY SCISSORS
            else if(ans.equals("b")){
                System.out.println("You have chosen safety scissors as your weapon!");
                System.out.println(" ");
                System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                System.out.println("As Henry draws his weapon, you see that he wields... a gun!");
                System.out.println(" ");
                System.out.println("Fortunately for you, you have trained extensively in Scissor-kwon-doe and know how to use safety scissors quite well");
                System.out.println("Henry shoots his gun at you, but with your masterful maneuvers you manage to deflect Henry's bullets back using the scissors ");
                System.out.println("This combat ends with your victory! Henry lies on the floor, slowly bleeding out from his own bullet");
                System.out.println(" ");
                // CHOICE 3.2 =================================================================================================================================================

                System.out.println("After a week of rest, you must fight one of the remaining gladiators ");
                System.out.println("Since you chose Henry last time and won, you now must choose between the remaining 2 gladiators, (a or b)");
                ans = keyboard.nextLine();
                ans = checkValid2(ans);
                System.out.println(" ");

                if(ans.equals("a")){
                    System.out.println("The figher you have chosen is...");
                    System.out.println("ASHER!!");
                    System.out.println(" ");
                    System.out.println("You can choose between 3 weapons to fight Asher:");
                    System.out.println("Type 'a' for a small prision shiv");
                    System.out.println("Type 'b' for a can of hair spray and a lighter");
                    System.out.println("Type 'c' for 3 human molars on a string");
                    System.out.println(" ");
        
                    ans = keyboard.nextLine();
                    ans = checkValid(ans);
                    // CHOICE 2.2====================================================================================================================================================
                    // CHOSE A; SHIV
                    if(ans.equals("a")){
                        System.out.println("You have chosen a shiv as your weapon!");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Asher draws his weapon, you see that he wields... a huge broadsword!");
                        System.out.println(" ");
                        System.out.println("You freeze in terror at the sight of Asher's long, thick, hard... sword");
                        System.out.println("Using this moment of weakness, Asher's sword CLEAVES THROUGH YOU like a sword through a nerdy highschooler");
                        System.out.println("This combat ends with your death. Asher gives you a solemn warrior's respect after your death");
                        System.out.println(" ");
                        System.out.println("Despite your death you have still ended in a tie, and you have given the audience a good show");
                        System.out.println("Your show has earned enough for a modest funeral, and both you and your opponent are remembered fondly");
                        System.out.println(" ");
                        System.out.println("Ending 1/6 - A Quick Death");
                        // CHOICE 3.4 =================================================================================================================================================
                    }
                    // CHOSE B; FLAMETHROWER
                    else if(ans.equals("b")){
                        System.out.println("You have chosen a makeshift flamethrower as your weapon!");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Asher draws his weapon, you see that he wields... a huge broadsword!");
                        System.out.println(" ");
                        System.out.println("You use the superior range granted to you by your flamethrower to shoot a wave of flames at Asher");
                        System.out.println("These flames are so intense that they start to melt Asher's sword");
                        System.out.println("Seeing this, Asher causally tosses aside his half-melted sword and charges toward you");
                        System.out.println("Despite your desperate bursts of flame toward him, his enormous muscles and wonderous physique simply will not burn");
                        System.out.println("Asher plunges his hand into your chest, grabbing your heart, and then bursting out the other side");
                        System.out.println("After your death, Asher is finally enveloped by the flames");  
                        System.out.println("This combat ends with both of your deaths");
                        System.out.println(" ");
                        System.out.println("Despite your tie, you both still recieve praise for your previous battles after your deaths, and both recieve honorable funerals");
                        System.out.println(" ");
                        System.out.println("Ending 2/6 - An Honorable Tie");
                        // CHOICE 3.5 =================================================================================================================================================
                        
                    }
                    // CHOSE C; TEETH WEAPON
                    else if(ans.equals("c")){
                        System.out.println("You have chosen 3 human molars on a string as your weapon!... weirdo.");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Asher draws his weapon, you see that he wields... a huge broadsword!");
                        System.out.println(" ");
                        System.out.println("Swinging your weapon quickly, you dash nimbly towards Asher. After exchanging a few blows each, you finally land");
                        System.out.println("A powerful blow with your molars on a string, knocking Asher out. Seeing that he is not fully dead,");
                        System.out.println("You proceed to bash his head in repeatedly until the only thing left is a red stain.");
                        System.out.println("This combat ends with your victory");
                        System.out.println(" ");
                        System.out.println("The audience roars in approval! You have fought 2 gladiators and won! This day marks you as the chapmion.");
                        System.out.println("You go on to live a life of luxury, proceeding to win every battle you enter");
                        System.out.println(" ");
                        System.out.println("Ending 3/6 - Champion");
                    }
                }

            }
            // CHOSE C; BIG ROCK
            else if(ans.equals("c")){
                System.out.println("You have chosen a big rock as your weapon!");
                System.out.println(" ");
                System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                System.out.println("As Henry draws his weapon, you see that he wields... a gun!");
                System.out.println(" ");
                System.out.println("You grab your huge and powerful rock, and start to charge at henry with all the force you can muster!");
                System.out.println("Henry shoots you in the face. This combat ends with your death");
                System.out.println("You can hear Henry gloating as you lie on the floor, bleeding out");
                System.out.println(" ");
                System.out.println("...");
                System.out.println("Suddenly, you feel yourself standing back up. As you look down at your feet, your own corpse.");
                System.out.println("Seeing your new incorporeal form, you think of something");
                System.out.println("'Do I want to stay... as a ghost? Do I have unfinished buisness?'");
                System.out.println(" ");
                System.out.println("Do you want to continue on as a ghost, to haunt Henry? (a for yes, b for no)");
                ans = keyboard.nextLine();
                ans = checkValid2(ans);
                System.out.println(" ");
                if ans.equals("a"){
                    System.out.println("You have decided to continue on as a Ghost, so that you can haunt Henry until his death.");
                    System.out.println("Make sure the remainder of his life is filled with misery and torment!");
                    System.out.println("Ending 6/6 - Ghostly Revenge");
                }
                else if ans.equals("b"){
                    System.out.println("You decide not to continue as a Ghost. Henry defeated you in fair combat, and it's only right you let him live peacefully");
                    System.out.println("A good end, you decide to fade on to wherever you will go next");
                    System.out.println("Ending 5/6 - Acceptance of Defeat");
                }

                // CHOICE 3.3 =================================================================================================================================================
            }
            
        }
        // CHOSE B; ASHER
        else if(ans.equals("b")){
            System.out.println("The figher you have chosen is...");
            System.out.println("ASHER!!");
            System.out.println(" ");
            System.out.println("You can choose between 3 weapons to fight Asher:");
            System.out.println("Type 'a' for a small prision shiv");
            System.out.println("Type 'b' for a can of hair spray and a lighter");
            System.out.println("Type 'c' for 3 human molars on a string");
            System.out.println(" ");

            ans = keyboard.nextLine();
            ans = checkValid(ans);
            // CHOICE 2.2====================================================================================================================================================
            // CHOSE A; SHIV
            if(ans.equals("a")){
                System.out.println("You have chosen a shiv as your weapon!");
                System.out.println(" ");
                System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                System.out.println("As Asher draws his weapon, you see that he wields... a huge broadsword!");
                System.out.println(" ");
                System.out.println("You freeze in terror at the sight of Asher's long, thick, hard... sword");
                System.out.println("Using this moment of weakness, Asher's sword CLEAVES THROUGH YOU like a sword through a nerdy highschooler");
                System.out.println("This combat ends with your death. Asher gives you a solemn warrior's respect after your death");
                System.out.println(" ");
                System.out.println("...");
                System.out.println("Suddenly, you feel yourself standing back up. As you look down at your feet, your own corpse.");
                System.out.println("Seeing your new incorporeal form, you think of something");
                System.out.println("'Do I want to stay... as a ghost? Do I have unfinished buisness?'");
                System.out.println(" ");
                System.out.println("Do you want to continue on as a ghost, to haunt Asher? (a for yes, b for no)");
                ans = keyboard.nextLine();
                ans = checkValid2(ans);
                System.out.println(" ");
                if ans.equals("a"){
                    System.out.println("You have decided to continue on as a Ghost, so that you can haunt Asher until his death.");
                    System.out.println("Make sure the remainder of his life is filled with misery and torment!");
                    System.out.println("Ending 6/6 - Ghostly Revenge");
                }
                else if ans.equals("b"){
                    System.out.println("You decide not to continue as a Ghost. Asher defeated you in fair combat, and it's only right you let him live peacefully");
                    System.out.println("A good end, you decide to fade on to wherever you will go next");
                    System.out.println("Ending 5/6 - Acceptance of Defeat");
                }

                // CHOICE 3.4 =================================================================================================================================================
            }
            // CHOSE B; FLAMETHROWER
            else if(ans.equals("b")){
                System.out.println("You have chosen a makeshift flamethrower as your weapon!");
                System.out.println(" ");
                System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                System.out.println("As Asher draws his weapon, you see that he wields... a huge broadsword!");
                System.out.println(" ");
                System.out.println("You use the superior range granted to you by your flamethrower to shoot a wave of flames at Asher");
                System.out.println("These flames are so intense that they start to melt Asher's sword");
                System.out.println("Seeing this, Asher causally tosses aside his half-melted sword and charges toward you");
                System.out.println("Despite your desperate bursts of flame toward him, his enormous muscles and wonderous physique simply will not burn");
                System.out.println("Asher plunges his hand into your chest, grabbing your heart, and then bursting out the other side");
                System.out.println("After your death, Asher is finally enveloped by the flames");  
                System.out.println("This combat ends with both of your deaths");
                System.out.println(" ");
                System.out.println("Despite your death you have still ended in a tie, and you have given the audience a good show");
                System.out.println("Your show has earned enough for a modest funeral, and both you and your opponent are remembered fondly");
                System.out.println(" ");
                System.out.println("Ending 1/6 - A Quick Death");
                // CHOICE 3.5 =================================================================================================================================================
                
            }
            // CHOSE C; TEETH WEAPON
            else if(ans.equals("c")){
                System.out.println("You have chosen 3 human molars on a string as your weapon!... weirdo.");
                System.out.println(" ");
                System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                System.out.println("As Asher draws his weapon, you see that he wields... a huge broadsword!");
                System.out.println(" ");
                System.out.println("Swinging your weapon quickly, you dash nimbly towards Asher. After exchanging a few blows each, you finally land");
                System.out.println("A powerful blow with your molars on a string, knocking Asher out. Seeing that he is not fully dead,");
                System.out.println("You proceed to bash his head in repeatedly until the only thing left is a red stain.");
                System.out.println("This combat ends with your victory");
                System.out.println(" ");
                // CHOICE 3.6 =================================================================================================================================================
                
                System.out.println("After a week of rest, you must fight one of the remaining gladiators ");
                System.out.println("Since you chose Asher last time and won, you now must choose between the remaining 2 gladiators, (a or b)");
                ans = keyboard.nextLine();
                ans = checkValid2(ans);
                System.out.println(" ");

                if(ans.equals("a")){
                    System.out.println("The figher you have chosen is...");
                    System.out.println("HENRY!!");
                    System.out.println(" ");
                    System.out.println("You can choose between 3 weapons to fight Henry:");
                    System.out.println("Type 'a' for a butter knife");
                    System.out.println("Type 'b' for a pair of safety scissors");
                    System.out.println("Type 'c' for a big rock");
                    System.out.println(" ");
                    // CHOICE 4.14 =================================================================================================================================================
                    ans = keyboard.nextLine();
                    ans = checkValid(ans);
                    System.out.println(" ");

                    if(ans.equals("a")){
                        System.out.println("You have chosen a butter knife as your weapon!");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Henry draws his weapon, you see that he wields... a gun!");
                        System.out.println(" ");
                        System.out.println("You ready yourself for combat, clutching your butter knife.");
                        System.out.println("You charge at Henry, dodging many of his bullets as you sprint towards him");
                        System.out.println("Your heart sinks as you feel a small handful of Henry's bullets enter your chest");
                        System.out.println("HOWEVER, YOU REFUSE TO GIVE UP! With the last of your energy, you sink your butter knife into Henry's heart,");
                        System.out.println("killing him. This combat ends with both of your deaths, and you lie dying together on the cold colosseum floor");
                        System.out.println(" ");
                        System.out.println("Despite your tie, you both still recieve praise for your previous battles after your deaths, and both recieve honorable funerals");
                        System.out.println(" ");
                        System.out.println("Ending 2/6 - An Honorable Tie");
                        
                    }
                    // CHOSE B; SAFETY SCISSORS
                    else if(ans.equals("b")){
                        System.out.println("You have chosen safety scissors as your weapon!");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Henry draws his weapon, you see that he wields... a gun!");
                        System.out.println(" ");
                        System.out.println("Fortunately for you, you have trained extensively in Scissor-kwon-doe and know how to use safety scissors quite well");
                        System.out.println("Henry shoots his gun at you, but with your masterful maneuvers you manage to deflect Henry's bullets back using the scissors ");
                        System.out.println("This combat ends with your victory! Henry lies on the floor, slowly bleeding out from his own bullet");
                        System.out.println(" ");
                        System.out.println("The audience roars in approval! You have fought 2 gladiators and won! This day marks you as the chapmion.");
                        System.out.println("You go on to live a life of luxury, proceeding to win every battle you enter");
                        System.out.println(" ");
                        System.out.println("Ending 3/6 - Champion");
                        
        
        
                    }
                    // CHOSE C; BIG ROCK
                    else if(ans.equals("c")){
                        System.out.println("You have chosen a big rock as your weapon!");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Henry draws his weapon, you see that he wields... a gun!");
                        System.out.println(" ");
                        System.out.println("You grab your huge and powerful rock, and start to charge at henry with all the force you can muster!");
                        System.out.println("Henry shoots you in the face. This combat ends with your death");
                        System.out.println("You can hear Henry gloating as you lie on the floor, bleeding out");
                        System.out.println(" ");
                        System.out.println("Despite your loss, you still recieve praise for your previous battle after your death, and recieve an honorable funeral");
                        System.out.println(" ");
                        System.out.println("Ending 4/6 - An Honorable Death");
                        
                    }


                }
                else if(ans.equals("c")){
                    System.out.println("The figher you have chosen is...");
                    System.out.println("NATE!!");
                    System.out.println(" ");
                 
        
                    System.out.println("You can choose between 3 weapons to fight Nate:");
                    System.out.println("Type 'a' for a plastic straw");
                    System.out.println("Type 'b' for a powerful metal hammer");
                    System.out.println("Type 'c' for... dylan?");
                    System.out.println(" ");
        
                    ans = keyboard.nextLine();
                    ans = checkValid(ans);

                    if(ans.equals("a")){
                        System.out.println("You have chosen a plastic straw as your weapon!");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Nate draws his weapon, you see that he wields... a shortbow!");
                        System.out.println(" ");
                        System.out.println("As you look closer at the weapon you have chosen, the plasic straw, you see");
                        System.out.println("That it is made out of an incredibly durable, strong and sharb material");
                        System.out.println("Gaining confidence after seeing this, you run at Nate and manage to dodge his arrows");
                        System.out.println("While Nate is fumbling with his quiver, you run your straw through his throat, ending his life.");
                        System.out.println("This match ends with your victory!");
                        System.out.println(" ");
                        System.out.println("The audience roars in approval! You have fought 2 gladiators and won! This day marks you as the chapmion.");
                        System.out.println("You go on to live a life of luxury, proceeding to win every battle you enter");
                        System.out.println(" ");
                        System.out.println("Ending 3/6 - Champion");
                    }

                    if (ans.equals("b")){
                        System.out.println("You have chosen metal hammer as your weapon!");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Nate draws his weapon, you see that he wields... a shortbow!");
                        System.out.println(" ");
                        System.out.println("As you look closer at the weapon you have chosen, the metal, you see");
                        System.out.println("That is is made out of a flimsy plastic and rubber, painted a silver color");
                        System.out.println("Your heart fills with dread as you notice this, and while you stand shocked Nate nocks an arrow");
                        System.out.println("and lets it fly, piercing your heart easily. You fall to your knees and then to the ground, dying");
                        System.out.println("This match ends with your death");
                        System.out.println(" ");
                        
                        System.out.println("Despite your loss, you still recieve praise for your previous battle after your death, and recieve an honorable funeral");
                        System.out.println(" ");
                        System.out.println("Ending 4/6 - An Honorable Death");
        
                    }

                    else if(ans.equals("c")){
                        System.out.println("You have chosen dylan as your weapon?");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Henry draws his weapon, you see that he wields... a shortbow!");
                        System.out.println(" ");
                        System.out.println("You glance at the... Dylan? As you look at Dylan, his entire body starts to glow and float softly in the air");
                        System.out.println("That beautiful light around him quickly is relpaced by a blinding, painful glow. Despite the pain, you cannot look away.");
                        System.out.println("You can feel your eyes start to melt as you stare at Dylan's glowing form. Then suddenly, you feel a wave of energy wash over you.");
                        System.out.println("In the very next moment, you feel your flesh getting ripped away from your body, and your bones tearing themselves apart.");
                        System.out.println(" ");
                        System.out.println("This marks the extinction of life on Earth, as every single living thing is obliterated by Dylan's sheer force");
                        System.out.println("This is the end of your and everybody and everything else's story. Total anhiliation, and the slow death of a lonely world.");
                        System.out.println(" ");
                        System.out.println("Ending 0/6 - Behold, Dylan");

                    }
                }
            }
        }
        // CHOSE C; NATE ====================================================================================================================================================
        else if(ans.equals("c")){
            System.out.println("The figher you have chosen is...");
            System.out.println("NATE!!");
            System.out.println(" ");
         

            System.out.println("You can choose between 3 weapons to fight Nate:");
            System.out.println("Type 'a' for a plastic straw");
            System.out.println("Type 'b' for a powerful metal hammer");
            System.out.println("Type 'c' for... dylan?");
            System.out.println(" ");

            ans = keyboard.nextLine();
            ans = checkValid(ans);
            // CHOICE 2.3 ====================================================================================================================================================
            // CHOSE A; PLASTIC STRAW
            if(ans.equals("a")){
                System.out.println("You have chosen a plastic straw as your weapon!");
                System.out.println(" ");
                System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                System.out.println("As Nate draws his weapon, you see that he wields... a shortbow!");
                System.out.println(" ");
                System.out.println("As you look closer at the weapon you have chosen, the plasic straw, you see");
                System.out.println("That it is made out of an incredibly durable, strong and sharb material");
                System.out.println("Gaining confidence after seeing this, you run at Nate and manage to dodge his arrows");
                System.out.println("While Nate is fumbling with his quiver, you run your straw through his throat, ending his life.");
                System.out.println("This match ends with your victory!");
                System.out.println(" ");
                // CHOICE 3.7 =================================================================================================================================================
                
                System.out.println("After a week of rest, you must fight one of the remaining gladiators ");
                System.out.println("Since you chose Nate last time and won, you now must choose between the remaining 2 gladiators, (a or b)");
                ans = keyboard.nextLine();
                ans = checkValid2(ans);
                System.out.println(" ");


                if(ans.equals("a")){
                    System.out.println("The figher you have chosen is...");
                    System.out.println("HENRY!!");
                    System.out.println(" ");
                    System.out.println("You can choose between 3 weapons to fight Henry:");
                    System.out.println("Type 'a' for a butter knife");
                    System.out.println("Type 'b' for a pair of safety scissors");
                    System.out.println("Type 'c' for a big rock");
                    System.out.println(" ");
                    // CHOICE 4.14 =================================================================================================================================================
                    ans = keyboard.nextLine();
                    ans = checkValid(ans);
                    System.out.println(" ");

                    if(ans.equals("a")){
                        System.out.println("You have chosen a butter knife as your weapon!");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Henry draws his weapon, you see that he wields... a gun!");
                        System.out.println(" ");
                        System.out.println("You ready yourself for combat, clutching your butter knife.");
                        System.out.println("You charge at Henry, dodging many of his bullets as you sprint towards him");
                        System.out.println("Your heart sinks as you feel a small handful of Henry's bullets enter your chest");
                        System.out.println("HOWEVER, YOU REFUSE TO GIVE UP! With the last of your energy, you sink your butter knife into Henry's heart,");
                        System.out.println("killing him. This combat ends with both of your deaths, and you lie dying together on the cold colosseum floor");
                        System.out.println(" ");
                        System.out.println("Despite your tie, you both still recieve praise for your previous battles after your deaths, and both recieve honorable funerals");
                        System.out.println(" ");
                        System.out.println("Ending 2/10 - An Honorable Tie");
                    }
                    // CHOSE B; SAFETY SCISSORS
                    else if(ans.equals("b")){
                        System.out.println("You have chosen safety scissors as your weapon!");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Henry draws his weapon, you see that he wields... a gun!");
                        System.out.println(" ");
                        System.out.println("Fortunately for you, you have trained extensively in Scissor-kwon-doe and know how to use safety scissors quite well");
                        System.out.println("Henry shoots his gun at you, but with your masterful maneuvers you manage to deflect Henry's bullets back using the scissors ");
                        System.out.println("This combat ends with your victory! Henry lies on the floor, slowly bleeding out from his own bullet");
                        System.out.println(" ");
                        System.out.println("The audience roars in approval! You have fought 2 gladiators and won! This day marks you as the chapmion.");
                        System.out.println("You go on to live a life of luxury, proceeding to win every battle you enter");
                        System.out.println(" ");
                        System.out.println("Ending 3/6 - Champion");
                        
        
        
                    }
                    // CHOSE C; BIG ROCK
                    else if(ans.equals("c")){
                        System.out.println("You have chosen a big rock as your weapon!");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Henry draws his weapon, you see that he wields... a gun!");
                        System.out.println(" ");
                        System.out.println("You grab your huge and powerful rock, and start to charge at henry with all the force you can muster!");
                        System.out.println("Henry shoots you in the face. This combat ends with your death");
                        System.out.println("You can hear Henry gloating as you lie on the floor, bleeding out");
                        System.out.println(" ");
                        System.out.println("Despite your loss, you still recieve praise for your previous battle after your death, and recieve an honorable funeral");
                        System.out.println(" ");
                        System.out.println("Ending 4/10 - An Honorable Death");
                        
                    }


                }

                else if(ans.equals("b")){
                    System.out.println("The figher you have chosen is...");
                    System.out.println("ASHER!!");
                    System.out.println(" ");
                    System.out.println("You can choose between 3 weapons to fight Asher:");
                    System.out.println("Type 'a' for a small prision shiv");
                    System.out.println("Type 'b' for a can of hair spray and a lighter");
                    System.out.println("Type 'c' for 3 human molars on a string");
                    System.out.println(" ");
                    // CHOICE 4.14 =================================================================================================================================================
                    ans = keyboard.nextLine();
                    ans = checkValid(ans);
                    System.out.println(" ");

                    if(ans.equals("a")){
                        System.out.println("You have chosen a shiv as your weapon!");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Asher draws his weapon, you see that he wields... a huge broadsword!");
                        System.out.println(" ");
                        System.out.println("You freeze in terror at the sight of Asher's long, thick, hard... sword");
                        System.out.println("Using this moment of weakness, Asher's sword CLEAVES THROUGH YOU like a sword through a nerdy highschooler");
                        System.out.println("This combat ends with your death. Asher gives you a solemn warrior's respect after your death");
                        System.out.println(" ");
                        System.out.println("Despite your loss, you still recieve praise for your previous battle after your death, and recieve an honorable funeral");
                        System.out.println(" ");
                        System.out.println("Ending 4/6 - An Honorable Death");
                    }
                    // CHOSE B; FLAMETHROWER
                    else if(ans.equals("b")){
                        System.out.println("You have chosen a makeshift flamethrower as your weapon!");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Asher draws his weapon, you see that he wields... a huge broadsword!");
                        System.out.println(" ");
                        System.out.println("You use the superior range granted to you by your flamethrower to shoot a wave of flames at Asher");
                        System.out.println("These flames are so intense that they start to melt Asher's sword");
                        System.out.println("Seeing this, Asher causally tosses aside his half-melted sword and charges toward you");
                        System.out.println("Despite your desperate bursts of flame toward him, his enormous muscles and wonderous physique simply will not burn");
                        System.out.println("Asher plunges his hand into your chest, grabbing your heart, and then bursting out the other side");
                        System.out.println("After your death, Asher is finally enveloped by the flames");  
                        System.out.println("This combat ends with both of your deaths");
                        System.out.println(" ");
                        System.out.println("Despite your tie, you both still recieve praise for your previous battles after your deaths, and both recieve honorable funerals");
                        System.out.println(" ");
                        System.out.println("Ending 2/6 - An Honorable Tie");
                        // CHOICE 3.5 =================================================================================================================================================
                        
                    }
                    // CHOSE C; TEETH WEAPON
                    else if(ans.equals("c")){
                        System.out.println("You have chosen 3 human molars on a string as your weapon!... weirdo.");
                        System.out.println(" ");
                        System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                        System.out.println("As Asher draws his weapon, you see that he wields... a huge broadsword!");
                        System.out.println(" ");
                        System.out.println("Swinging your weapon quickly, you dash nimbly towards Asher. After exchanging a few blows each, you finally land");
                        System.out.println("A powerful blow with your molars on a string, knocking Asher out. Seeing that he is not fully dead,");
                        System.out.println("You proceed to bash his head in repeatedly until the only thing left is a red stain.");
                        System.out.println("This combat ends with your victory");
                        System.out.println(" ");
                        System.out.println("The audience roars in approval! You have fought 2 gladiators and won! This day marks you as the chapmion.");
                        System.out.println("You go on to live a life of luxury, proceeding to win every battle you enter");
                        System.out.println(" ");
                        System.out.println("Ending 3/6 - Champion");

                }
            }
            // CHOSE B; HAMMER
            else if(ans.equals("b")){
                System.out.println("You have chosen metal hammer as your weapon!");
                System.out.println(" ");
                System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                System.out.println("As Nate draws his weapon, you see that he wields... a shortbow!");
                System.out.println(" ");
                System.out.println("As you look closer at the weapon you have chosen, the metal, you see");
                System.out.println("That is is made out of a flimsy plastic and rubber, painted a silver color");
                System.out.println("Your heart fills with dread as you notice this, and while you stand shocked Nate nocks an arrow");
                System.out.println("and lets it fly, piercing your heart easily. You fall to your knees and then to the ground, dying");
                System.out.println("This match ends with your death");
                System.out.println(" ");
                System.out.println("...");
                System.out.println("Suddenly, you feel yourself standing back up. As you look down at your feet, your own corpse.");
                System.out.println("Seeing your new incorporeal form, you think of something");
                System.out.println("'Do I want to stay... as a ghost? Do I have unfinished buisness?'");
                System.out.println(" ");
                System.out.println("Do you want to continue on as a ghost, to haunt Nate? (a for yes, b for no)");
                ans = keyboard.nextLine();
                ans = checkValid2(ans);
                System.out.println(" ");
                if ans.equals("a"){
                    System.out.println("You have decided to continue on as a Ghost, so that you can haunt Nate until his death.");
                    System.out.println("Make sure the remainder of his life is filled with misery and torment!");
                    System.out.println("Ending 6/6 - Ghostly Revenge");
                }
                else if ans.equals("b"){
                    System.out.println("You decide not to continue as a Ghost. Nate defeated you in fair combat, and it's only right you let him live peacefully");
                    System.out.println("A good end, you decide to fade on to wherever you will go next");
                    System.out.println("Ending 5/6 - Acceptance of Defeat");
                }

                // CHOICE 3.8 =================================================================================================================================================
                
                
            }
            // CHOSE C; DYLAN
            else if(ans.equals("c")){
                System.out.println("You have chosen dylan as your weapon?");
                System.out.println(" ");
                System.out.println("As the gates of the colosseum slowly open, you come face to face with your enemy");
                System.out.println("As Henry draws his weapon, you see that he wields... a shortbow!");
                System.out.println(" ");
                System.out.println("You glance at the... Dylan? As you look at Dylan, his entire body starts to glow and float softly in the air");
                System.out.println("That beautiful light around him quickly is relpaced by a blinding, painful glow. Despite the pain, you cannot look away.");
                System.out.println("You can feel your eyes start to melt as you stare at Dylan's glowing form. Then suddenly, you feel a wave of energy wash over you.");
                System.out.println("In the very next moment, you feel your flesh getting ripped away from your body, and your bones tearing themselves apart.");
                System.out.println(" ");
                System.out.println("This marks the extinction of life on Earth, as every single living thing is obliterated by Dylan's sheer force");
                System.out.println("This is the end of your and everybody and everything else's story. Total anhiliation, and the slow death of a lonely world.");
                System.out.println(" ");
                System.out.println("Ending 0/6 - Behold, Dylan");
                

                
                
            }


        }




    }
    public static String checkValid(String answer){
        Scanner keyboard = new Scanner(System.in);
        while (!answer.equals("a") && !answer.equals("b") && !answer.equals("c")){
            System.out.println("Please enter either a, b, or c");
            answer = keyboard.nextLine();
        }
        return answer;
        
    }
    public static String checkValid2(String answer){
        Scanner keyboard = new Scanner(System.in);
        while (!answer.equals("a") && !answer.equals("b")){
            System.out.println("Please enter either a, b, or c");
            answer = keyboard.nextLine();
        } 
        return answer;
       
    }
}
