#BarBuilder

**What is that ?**

BarBuilder is a class that help you to make bars, like  Xp bars.
Exemple: 10% of 20 = 2 are green and 18 are red
-> in code this is: new BarBuilder(10, 20).build();

**How to make a basic XP bar ?
Create a String wich the bar you want to have.
 
    String myXpBar;

Initialize it with the bar you want. For me, I want a bar that shows 10% with 50 caracters (default is '|')

    myXpBar = new BarBuilder(10, 50).build;
    
Don't forget to use build() methods at the end.
You can also change the colors, the caracter, the size of bar.

**Enjoy my class, if you have any request or idea ask me.
