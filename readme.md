# BarBuilder

## **What is that ?**

BarBuilder is a class that help you to make bars, like  Xp bars.
Exemple: 10% of 20 = 2 are green and 18 are red
-> in code this is: new BarBuilder(10, 20).build();

## **How to make a basic XP bar ?
Create a String wich the bar you want to have.
 
    String myXpBar;

Initialize it with the bar you want. For me, I want a bar that shows 12% with 50 caracters (default is '|')

    myXpBar = new BarBuilder(12, 50).build;
    
It will make this: ![Image of result](https://raw.githubusercontent.com/Ariouz/BarBuilder/master/Screenshot_1.png)
    
Don't forget to use build() methods at the end.
You can also change the colors, the caracter, the size of bar.

## Methods and Build details

If you want to customize you bar, you can change the colors, the size of the baar (how many '|' there are) and the caracter (change '|' with another thing).

### The setFullColor Method:
    public void setFullColor(ChatColor color){
        this.full = color;
    }
    
This methods will change the greens bars to another color, exemple in code:

    myXpBar = new BarBuilder(12, 50).setFullColor(ChatColor.BLUE).build;

**Enjoy my class, if you have any request or idea ask me.
