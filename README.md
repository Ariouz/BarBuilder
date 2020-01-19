# BarBuilder

## **What is that ?**

BarBuilder is a class that help you to make bars, looking like XP bars.
Example: 10% of 20 = 2 are green and 18 are red
-> in code this is: 
  
    new BarBuilder(10, 20).build();

## **How to make a basic XP bar ?**
Create a String wich the bar you want to have.
 
    String myXpBar;

Initialize it with the bar you want. For example, if I want a bar that shows 12% with 50 caracters (default is '|')

    myXpBar = new BarBuilder(12, 50).build;
    
Preview: ![Image of result](https://raw.githubusercontent.com/Ariouz/BarBuilder/master/imgs/1.png)
    
Don't forget to use build() methods at the end.
You can also change the colors, the caracter, the size of bar.

## Methods and Build details

If you want to customize you bar, you can change the colors, the size of the bar (how many '|' there are) and the caracter (change '|' with another thing).

### The setFullColor Method:
This methods will change the green bars to another color, exemple in code:

    myXpBar = new BarBuilder(12, 50).setFullColor(ChatColor.BLUE).build;
Preview: ![Image of result](https://raw.githubusercontent.com/Ariouz/BarBuilder/master/imgs/2.png)

### The setEmptyColor Method:
This method will change you the red bars to another color, exemple in code:

    myXpBar = new BarBuilder(12, 50).setEmptyColor(ChatColor.GOLD).build;
 Preview: ![Image of result](https://raw.githubusercontent.com/Ariouz/BarBuilder/master/imgs/3.png)  
 
### The setSize Method:
This method will change you the bar size (default is 100), exemple in code:

    myXpBar = new BarBuilder(12, 150).build;
    myXpBar = new BarBuilder(12).setSize(150).build;
 (These methods do the same thing)
 Preview: ![Image of result](https://raw.githubusercontent.com/Ariouz/BarBuilder/master/imgs/4.png) 
 
 ### The setCaracter Method:
 This method will change you the bar caracter (default is '|'), exemple in code:
 
    myXpBar = new BarBuilder(12, 50).setCaracter('x').build;
Preview: ![Image of result](https://raw.githubusercontent.com/Ariouz/BarBuilder/master/imgs/5.png)

## You can superpose methods in one line of code, exemple in code:

    myXpBar = new BarBuilder(12).setCaracter(':').setFullColor(ChatColor.YELLOW).setEmptyColor(ChatColor.GOLD).setSize(50).build;
Preview: ![Image of result](https://raw.githubusercontent.com/Ariouz/BarBuilder/master/imgs/6.png)

## Hope you enjoy my class, if you have any request or idea ask me.
